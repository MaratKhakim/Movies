package com.example.tmdbclient.data.repository.artist.datasourceImpl

import com.example.tmdbclient.data.api.TMBDService
import com.example.tmdbclient.data.model.artist.ArtistList
import com.example.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(private val tmdbService: TMBDService, private val apiKey: String) :
    ArtistRemoteDataSource {
    override suspend fun getArtists(): Response<ArtistList> = tmdbService.getPopularArtist(apiKey)
}