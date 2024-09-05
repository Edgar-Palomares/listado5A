package com.example.listado5a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerPersonas)

        recyclerView.layoutManager= LinearLayoutManager(this)

        val data = ArrayList<Alumno>()

        for (i in 1 .. 50) {
            data.add(Alumno("Edgar Palomares", "20192025", "epalomares@ucol.mx", R.drawable.baseline_school))
            data.add(Alumno("Julio Angulo", "20197482", "jangulo@ucol.mx", R.drawable.baseline_school))
            data.add(Alumno("Armando Escalera", "20178035", "aescalera@ucol.mx", R.drawable.baseline_school))
            data.add(Alumno("Raul Pineda", "20183403", "rpineda@ucol.mx", R.drawable.baseline_school))
        }

        val adapter = AlumnoAdapter(this, data)

        recyclerView.adapter = adapter
    }
}