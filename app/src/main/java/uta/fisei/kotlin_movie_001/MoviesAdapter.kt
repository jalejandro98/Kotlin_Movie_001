package uta.fisei.kotlin_movie_001

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uta.fisei.kotlin_movie_001.databinding.ViewMovieItemBinding

class MoviesAdapter (private val movies: List<Movie>,
private val movieClickedListener: (Movie)->Unit):
    RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {



    // este metodo permite crear una vista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewMovieItemBinding.inflate(LayoutInflater.from(parent.context),
        parent,false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie= movies[position]
        holder.bind(movie)
        holder.itemView.setOnClickListener{
            movieClickedListener (movie)
        }
    }

     override fun getItemCount(): Int {
        // regresa el valor de la longitud de la lista, en este caso las peliculas
        return movies.size
    }

    // otra forma de hacerlo con un expression body/ expresion lamda
    // override fun getItemCount(): Int = movies.size


    class ViewHolder(private val binding: ViewMovieItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(movie:Movie){
            binding.textViewTitle.text=movie.title
            Glide
                .with(binding.root.context)
                .load(movie.cover)
                .into(binding.imageViewCover)

        }
    }

}
/*
interface MovieClickedListener{
    fun onMovieClicked(movie: Movie) //(Movie)->Unit

}
*/
