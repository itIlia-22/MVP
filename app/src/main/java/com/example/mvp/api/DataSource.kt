package com.example.mvp.api

import io.reactivex.rxjava3.core.Single
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Url





interface DataSource {
    @GET("/users")
    fun loadUser(): Single<List<UserApiDto>>

    @GET("users/{login}")
    fun getLogin(@Path("login") login: String): Single<UserApiDto>

    @GET("users/login/{repos}")
    fun getRepo(@Path("repos") repos: String): Single<List<RepositoryDto>>

    @GET
    fun getR(@Url url: String?): Single<List<RepositoryDto>>



}