package com.paqta.paqtafood.screens.user.cart;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.paqta.paqtafood.R;
import com.paqta.paqtafood.adapters.CardCartAdapter;
import com.paqta.paqtafood.model.Producto;
import com.shuhart.stepview.StepView;


import java.util.ArrayList;
import java.util.List;


public class CartFragment extends Fragment {
    StepView stepView;
    TextView stepTextView;
    Button btnReservar, btnComprar;
    RecyclerView rycrCart;

    CardCartAdapter mAdapterCart;
    LinearLayout layoutContaint;

    int stepIndex = 0;
    String[] stepsTexts = {"CARRITO", "ENTREGA", "METODO DE PAGO"};
    List<TextView> textViewList = new ArrayList<>();

    private FirebaseFirestore mFirestore;
    private FirebaseAuth mAuth;
    private FirebaseUser mUser;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_cart, container, false);

        mFirestore = FirebaseFirestore.getInstance();
        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();

        btnReservar = root.findViewById(R.id.btnReservar);
        btnComprar = root.findViewById(R.id.btnComprar);

        rycrCart = root.findViewById(R.id.cartPlatillos);

        layoutContaint = root.findViewById(R.id.linearLayoutContaint);

        stepTextView = root.findViewById(R.id.stepTextView);
        stepView = root.findViewById(R.id.step_view);
        stepView.getState()
                .animationType(StepView.ANIMATION_ALL)
                .stepsNumber(3)
                .animationDuration(getResources().getInteger(android.R.integer.config_shortAnimTime))
                .commit();

        btnComprar.setOnClickListener(v -> configureStep());

        configureRecyclers();
//        nextStep();
        return root;
    }

    private void configureRecyclers() {
        DocumentReference userRef = mFirestore.collection("usuarios").document(mUser.getUid());

        userRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                List<String> carrito = (List<String>) documentSnapshot.get("carrito");

                if (carrito != null && !carrito.isEmpty()) {
                    rycrCart.setLayoutManager(new LinearLayoutManager(getContext()));

                    Query queryPlatillos = mFirestore.collection("productos")
                            .whereIn("id", carrito);

                    FirestoreRecyclerOptions<Producto> options = new FirestoreRecyclerOptions.Builder<Producto>()
                            .setQuery(queryPlatillos, Producto.class)
                            .build();

                    mAdapterCart = new CardCartAdapter(options, getActivity(), getActivity().getSupportFragmentManager());
                    mAdapterCart.notifyDataSetChanged();
                    rycrCart.setAdapter(mAdapterCart);
                    mAdapterCart.startListening();
                }
            }
        });
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAdapterCart != null) {
            mAdapterCart.stopListening();
        }
    }

    private void configureStep() {
        stepIndex++;
        if (stepIndex < stepsTexts.length) {
            stepTextView.setText(stepsTexts[stepIndex]);
            stepView.go(stepIndex, true);
        }
    }

    private void nextStep() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                stepIndex++;
                if (stepIndex < stepsTexts.length) {
                    stepTextView.setText(stepsTexts[stepIndex]);
                    stepView.go(stepIndex, true);
                    nextStep();
                }
            }
        }, 3000);
    }
}