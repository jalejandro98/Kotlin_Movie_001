package uta.fisei.kotlin_movie_001.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import java.nio.channels.spi.AbstractSelectionKey

interface MovieDbService {

    @GET("popular")
    fun listPopularMovies(@Query("apiKey") apiKey: String):Call<MovieDbResult>

}