package com.example.aplicacionbancaria.ui.main

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.aplicacionbancaria.Cliente
import com.example.aplicacionbancaria.R
import com.example.aplicacionbancaria.databinding.FragmentAgregarClienteBinding
import com.google.firebase.Firebase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore


class agregarClienteFragment : Fragment(R.layout.fragment_agregar_cliente) {

    private lateinit var binding: FragmentAgregarClienteBinding
    private var db = Firebase.firestore

    //override fun onCreateView(
    //    inflater: LayoutInflater, container: ViewGroup?,
    //    savedInstanceState: Bundle?
    //): View? {
    //    Inflate the layout for this fragment
    //    return inflater.inflate(R.layout.fragment_agregar_cliente, container, false)
    //}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAgregarClienteBinding.bind(view)

        binding.btnSave.setOnClickListener {


            val builder = AlertDialog.Builder(activity)
            builder.setCancelable(false)
            builder.setView(R.layout.progress_layout)
            val dialog = builder.create()
            dialog.show()
            guardarData()
            dialog.dismiss()
        }

    }

    private fun guardarData() {
        db = FirebaseFirestore.getInstance()

        val cliente = Cliente(

            nombre = binding.txtNombre.editText?.text.toString(),
            apellido = binding.txtApellido.editText?.text.toString(),
            dni = binding.txtDni.editText?.text.toString(),
            telefono = binding.txtTelefono.editText?.text.toString(),
            direccion = binding.txtDireccion.editText?.text.toString()
        )
        db.collection("Clientes")
            .add(cliente)
            .addOnSuccessListener { task ->
                Toast.makeText(activity, "Guardado ${task.id}", Toast.LENGTH_SHORT).show()
            }
            .addOnFailureListener { e ->
                Toast.makeText(activity, e.message.toString(), Toast.LENGTH_SHORT).show()
            }
    }
}