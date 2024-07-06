// Generated by view binder compiler. Do not edit!
package com.example.aplicacionbancaria.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aplicacionbancaria.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAgregarClienteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView SubTextView;

  @NonNull
  public final MaterialButton btnSave;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextInputLayout txtApellido;

  @NonNull
  public final TextInputLayout txtDireccion;

  @NonNull
  public final TextInputLayout txtDni;

  @NonNull
  public final TextInputLayout txtNombre;

  @NonNull
  public final TextInputLayout txtTelefono;

  private FragmentAgregarClienteBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView SubTextView, @NonNull MaterialButton btnSave, @NonNull TextView textView,
      @NonNull TextInputLayout txtApellido, @NonNull TextInputLayout txtDireccion,
      @NonNull TextInputLayout txtDni, @NonNull TextInputLayout txtNombre,
      @NonNull TextInputLayout txtTelefono) {
    this.rootView = rootView;
    this.SubTextView = SubTextView;
    this.btnSave = btnSave;
    this.textView = textView;
    this.txtApellido = txtApellido;
    this.txtDireccion = txtDireccion;
    this.txtDni = txtDni;
    this.txtNombre = txtNombre;
    this.txtTelefono = txtTelefono;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAgregarClienteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAgregarClienteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_agregar_cliente, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAgregarClienteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.SubTextView;
      TextView SubTextView = ViewBindings.findChildViewById(rootView, id);
      if (SubTextView == null) {
        break missingId;
      }

      id = R.id.btnSave;
      MaterialButton btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.txtApellido;
      TextInputLayout txtApellido = ViewBindings.findChildViewById(rootView, id);
      if (txtApellido == null) {
        break missingId;
      }

      id = R.id.txtDireccion;
      TextInputLayout txtDireccion = ViewBindings.findChildViewById(rootView, id);
      if (txtDireccion == null) {
        break missingId;
      }

      id = R.id.txtDni;
      TextInputLayout txtDni = ViewBindings.findChildViewById(rootView, id);
      if (txtDni == null) {
        break missingId;
      }

      id = R.id.txtNombre;
      TextInputLayout txtNombre = ViewBindings.findChildViewById(rootView, id);
      if (txtNombre == null) {
        break missingId;
      }

      id = R.id.txtTelefono;
      TextInputLayout txtTelefono = ViewBindings.findChildViewById(rootView, id);
      if (txtTelefono == null) {
        break missingId;
      }

      return new FragmentAgregarClienteBinding((ConstraintLayout) rootView, SubTextView, btnSave,
          textView, txtApellido, txtDireccion, txtDni, txtNombre, txtTelefono);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
