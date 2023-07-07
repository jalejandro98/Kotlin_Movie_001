package uta.fisei.kotlin_movie_001.model


data class MovieDbResult(
    val page: Int,
    val results: List<MovieDb>,
    val total_pages: Int,
    val total_results: Int
)