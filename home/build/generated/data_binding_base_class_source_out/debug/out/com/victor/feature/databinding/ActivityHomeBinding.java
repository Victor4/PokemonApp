// Generated by view binder compiler. Do not edit!
package com.victor.feature.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.victor.feature.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView pokemonRecyclerView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Button retryButton;

  private ActivityHomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView pokemonRecyclerView, @NonNull ProgressBar progressBar,
      @NonNull Button retryButton) {
    this.rootView = rootView;
    this.pokemonRecyclerView = pokemonRecyclerView;
    this.progressBar = progressBar;
    this.retryButton = retryButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.pokemonRecyclerView;
      RecyclerView pokemonRecyclerView = rootView.findViewById(id);
      if (pokemonRecyclerView == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.retry_button;
      Button retryButton = rootView.findViewById(id);
      if (retryButton == null) {
        break missingId;
      }

      return new ActivityHomeBinding((ConstraintLayout) rootView, pokemonRecyclerView, progressBar,
          retryButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}