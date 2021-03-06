// Generated by view binder compiler. Do not edit!
package com.flores.appfogata.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.flores.appfogata.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CompraBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgcompra;

  @NonNull
  public final TextView productocompra;

  @NonNull
  public final TextView totalcompra;

  private CompraBinding(@NonNull LinearLayout rootView, @NonNull ImageView imgcompra,
      @NonNull TextView productocompra, @NonNull TextView totalcompra) {
    this.rootView = rootView;
    this.imgcompra = imgcompra;
    this.productocompra = productocompra;
    this.totalcompra = totalcompra;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CompraBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CompraBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.compra, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CompraBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgcompra;
      ImageView imgcompra = ViewBindings.findChildViewById(rootView, id);
      if (imgcompra == null) {
        break missingId;
      }

      id = R.id.productocompra;
      TextView productocompra = ViewBindings.findChildViewById(rootView, id);
      if (productocompra == null) {
        break missingId;
      }

      id = R.id.totalcompra;
      TextView totalcompra = ViewBindings.findChildViewById(rootView, id);
      if (totalcompra == null) {
        break missingId;
      }

      return new CompraBinding((LinearLayout) rootView, imgcompra, productocompra, totalcompra);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
