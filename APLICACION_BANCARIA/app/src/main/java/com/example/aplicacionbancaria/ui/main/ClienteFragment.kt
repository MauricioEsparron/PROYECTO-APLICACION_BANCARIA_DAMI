package com.example.aplicacionbancaria.ui.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aplicacionbancaria.BancoAdapter
import com.example.aplicacionbancaria.Cliente
import com.example.aplicacionbancaria.R
import com.example.aplicacionbancaria.databinding.FragmentClienteBinding
import com.google.firebase.Firebase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore


class ClienteFragment : Fragment(R.layout.fragment_cliente) {

    private lateinit var recyclerView: RecyclerView
    private lateinit var clienteList: ArrayList<Cliente>
    private lateinit var adapter: BancoAdapter
    private var db = Firebase.firestore
    private lateinit var binding: FragmentClienteBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentClienteBinding.bind(view)

        //Firebase-RecyclerView
        recyclerView = view.findViewById(R.id.recyclerClientes)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        clienteList = arrayListOf()
        adapter = BancoAdapter(clienteList)
        recyclerView.adapter = adapter


        db = FirebaseFirestore.getInstance()

        db.collection("Clientes")
            .get()
            .addOnSuccessListener {
                if(!it.isEmpty){
                    for (data in it.documents) {

                        val cliente: Cliente? = data.toObject(Cliente::class.java)
                        if(cliente != null) {
                            clienteList.add(cliente)
                            Log.i("Doc","Documento con nombre: ${cliente.nombre}")
                        }
                    }
                    recyclerView.adapter = BancoAdapter(clienteList)
                }
            }
            .addOnFailureListener {
                Toast.makeText(activity, it.toString(), Toast.LENGTH_SHORT).show()
            }
        binding.addClient.setOnClickListener{
            findNavController().navigate(R.id.action_clienteFragment_to_agregarClienteFragment)
        }

    }
}