package com.example.tmdbclient.presentation.di.core

import com.example.tmdbclient.data.api.TMBDService
import com.example.tmdbclient.data.repository.artist.datasource.ArtistRemoteDataSource
import com.example.tmdbclient.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.example.tmdbclient.data.repository.movie.datasource.MovieRemoteDataSource
import com.example.tmdbclient.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.example.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.example.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey:String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmbdService: TMBDService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(tmbdService, apiKey)
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmbdService: TMBDService): ArtistRemoteDataSource {
        return ArtistRemoteDataSourceImpl(tmbdService, apiKey)
    }

    @Singleton
    @Provides
    fun provideTvShowRemoteDataSource(tmbdService: TMBDService): TvShowRemoteDatasource {
        return TvShowRemoteDataSourceImpl(tmbdService, apiKey)
    }
}