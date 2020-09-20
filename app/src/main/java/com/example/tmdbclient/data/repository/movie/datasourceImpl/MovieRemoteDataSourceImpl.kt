package com.example.tmdbclient.data.repository.movie.datasourceImpl

import com.example.tmdbclient.data.api.TMBDService
import com.example.tmdbclient.data.model.movie.MovieList
import com.example.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(private val tmdbService: TMBDService, private val apiKey: String) :
    MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)
}