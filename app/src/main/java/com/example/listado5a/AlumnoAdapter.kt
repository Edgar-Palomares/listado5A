package com.example.listado5a

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AlumnoAdapter (private val context: Context, private val listAlumnos: List<Alumno>) : RecyclerView.Adapter<AlumnoAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_personas, parent, false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = listAlumnos[position]

        // sets the image to the imageview from our itemHolder class
        Glide.with(context).load(ItemsViewModel.imagen).into(holder.imgFoto)
        // sets the text to the textview from our itemHolder class
        holder.nombre.text = ItemsViewModel.nombre
        holder.numCuenta.text = ItemsViewModel.cuenta
    }

    override fun getItemCount(): Int {
        return listAlumnos.size
    }

    inner class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imgFoto: ImageView = itemView.findViewById(R.id.imgPersona)
        val nombre: TextView = itemView.findViewById(R.id.tvNombre)
        val numCuenta: TextView = itemView.findViewById(R.id.tvCuenta)

    }

}
