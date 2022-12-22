package com.example.mvp.api

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface DataSource {
    @GET("/users")
    fun loadUser(): Single<List<UserApiDto>>

    @GET("users/{login}")
    fun getLogin(@Path("login") login: String): Single<UserApiDto>
}