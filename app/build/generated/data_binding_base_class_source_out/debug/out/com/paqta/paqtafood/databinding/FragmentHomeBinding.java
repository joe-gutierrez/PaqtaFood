// Generated by view binder compiler. Do not edit!
package com.paqta.paqtafood.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.paqta.paqtafood.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ShapeableImageView imageView;

  @NonNull
  public final ImageView imageView10;

  @NonNull
  public final ImageView imageView11;

  @NonNull
  public final ImageView imageView12;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final ImageView imageView9;

  @NonNull
  public final MaterialCardView materialCardView3;

  @NonNull
  public final MaterialCardView materialCardView4;

  @NonNull
  public final MaterialCardView materialCardView5;

  @NonNull
  public final MaterialCardView materialCardView6;

  @NonNull
  public final MaterialCardView materialCardView7;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  private FragmentHomeBinding(@NonNull FrameLayout rootView, @NonNull ShapeableImageView imageView,
      @NonNull ImageView imageView10, @NonNull ImageView imageView11,
      @NonNull ImageView imageView12, @NonNull ImageView imageView6, @NonNull ImageView imageView7,
      @NonNull ImageView imageView8, @NonNull ImageView imageView9,
      @NonNull MaterialCardView materialCardView3, @NonNull MaterialCardView materialCardView4,
      @NonNull MaterialCardView materialCardView5, @NonNull MaterialCardView materialCardView6,
      @NonNull MaterialCardView materialCardView7, @NonNull TextView textView,
      @NonNull TextView textView10, @NonNull TextView textView6, @NonNull TextView textView7,
      @NonNull TextView textView8, @NonNull TextView textView9) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.imageView10 = imageView10;
    this.imageView11 = imageView11;
    this.imageView12 = imageView12;
    this.imageView6 = imageView6;
    this.imageView7 = imageView7;
    this.imageView8 = imageView8;
    this.imageView9 = imageView9;
    this.materialCardView3 = materialCardView3;
    this.materialCardView4 = materialCardView4;
    this.materialCardView5 = materialCardView5;
    this.materialCardView6 = materialCardView6;
    this.materialCardView7 = materialCardView7;
    this.textView = textView;
    this.textView10 = textView10;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.textView8 = textView8;
    this.textView9 = textView9;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ShapeableImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView10;
      ImageView imageView10 = ViewBindings.findChildViewById(rootView, id);
      if (imageView10 == null) {
        break missingId;
      }

      id = R.id.imageView11;
      ImageView imageView11 = ViewBindings.findChildViewById(rootView, id);
      if (imageView11 == null) {
        break missingId;
      }

      id = R.id.imageView12;
      ImageView imageView12 = ViewBindings.findChildViewById(rootView, id);
      if (imageView12 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.imageView7;
      ImageView imageView7 = ViewBindings.findChildViewById(rootView, id);
      if (imageView7 == null) {
        break missingId;
      }

      id = R.id.imageView8;
      ImageView imageView8 = ViewBindings.findChildViewById(rootView, id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.imageView9;
      ImageView imageView9 = ViewBindings.findChildViewById(rootView, id);
      if (imageView9 == null) {
        break missingId;
      }

      id = R.id.materialCardView3;
      MaterialCardView materialCardView3 = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView3 == null) {
        break missingId;
      }

      id = R.id.materialCardView4;
      MaterialCardView materialCardView4 = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView4 == null) {
        break missingId;
      }

      id = R.id.materialCardView5;
      MaterialCardView materialCardView5 = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView5 == null) {
        break missingId;
      }

      id = R.id.materialCardView6;
      MaterialCardView materialCardView6 = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView6 == null) {
        break missingId;
      }

      id = R.id.materialCardView7;
      MaterialCardView materialCardView7 = ViewBindings.findChildViewById(rootView, id);
      if (materialCardView7 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      return new FragmentHomeBinding((FrameLayout) rootView, imageView, imageView10, imageView11,
          imageView12, imageView6, imageView7, imageView8, imageView9, materialCardView3,
          materialCardView4, materialCardView5, materialCardView6, materialCardView7, textView,
          textView10, textView6, textView7, textView8, textView9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
