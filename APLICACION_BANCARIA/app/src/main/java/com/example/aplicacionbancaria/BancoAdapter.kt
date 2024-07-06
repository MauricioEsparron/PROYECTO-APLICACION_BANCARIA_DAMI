package com.example.aplicacionbancaria

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BancoAdapter(private val clienteList: ArrayList<Cliente>) :
    RecyclerView.Adapter<BancoAdapter.MyViewHolder>(){

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val nombre: TextView = itemView.findViewById(R.id.txtNombre)
        val apellido: TextView = itemView.findViewById(R.id.txtApellido)
        val dni: TextView = itemView.findViewById(R.id.txtDni)
        val telefono: TextView = itemView.findViewById(R.id.txtTelefono)
        val direccion: TextView = itemView.findViewById(R.id.txtDireccion)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.item_clientes, parent, false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nombre.text = clienteList[position].nombre
        holder.apellido.text = clienteList[position].apellido
        holder.dni.text = clienteList[position].dni
        holder.telefono.text = clienteList[position].telefono
        holder.direccion.text = clienteList[position].direccion
    }
    override fun getItemCount(): Int {
        return clienteList.size
    }


}