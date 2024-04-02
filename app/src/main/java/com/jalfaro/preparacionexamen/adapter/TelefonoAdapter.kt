package com.jalfaro.preparacionexamen.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jalfaro.preparacionexamen.databinding.TelefonoLayoutBinding
import com.jalfaro.preparacionexamen.models.Telefono

class TelefonoAdapter(val listado: ArrayList<Telefono>):
    RecyclerView.Adapter<TelefonoAdapter.TelefonoViewHolder>() {
    class TelefonoViewHolder(val binding: TelefonoLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TelefonoViewHolder =
        TelefonoViewHolder(TelefonoLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int = listado.size

    override fun onBindViewHolder(holder: TelefonoViewHolder, position: Int) {
        holder.binding.txtTelefono.text = listado.get(position).telefono
        holder.binding.txtNombre.text = listado.get(position).nombre
    }
}