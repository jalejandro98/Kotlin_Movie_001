package uta.fisei.kotlin_movie_001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import uta.fisei.kotlin_movie_001.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        // declarar para que el binding se enlace al activity
        val binding = ActivityMainBinding.inflate(layoutInflater)
        // enlazar el binding con los elementos del layout
        setContentView(binding.root)

        // establecer el adapter creado para el llenar el recyclerview
        binding.recycler.adapter = MoviesAdapter(
            listOf(
                Movie("Titulo 1","https://loremflickr.com/320/240?lock=1"),
                Movie("Titulo 2","https://loremflickr.com/320/240?lock=2"),
                Movie("Titulo 3","https://loremflickr.com/320/240?lock=3"),
                Movie("Titulo 4","https://loremflickr.com/320/240?lock=4"),
                Movie("Titulo 5","https://loremflickr.com/320/240?lock=5"),
                Movie("Titulo 6","https://loremflickr.com/320/240?lock=6"),
            )
        ) { movie ->
            Toast.makeText(this@MainActivity, movie.title, Toast.LENGTH_SHORT).show()
        }


    }
}