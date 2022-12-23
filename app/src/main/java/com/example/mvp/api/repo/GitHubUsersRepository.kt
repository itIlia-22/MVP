package com.example.mvp.api.repo

import com.example.mvp.model.loc.GitHubUser
import com.example.mvp.model.loc.Repos
import io.reactivex.rxjava3.core.Single

interface GitHubUsersRepository {

    fun getUsers(): Single<List<GitHubUser>>
    fun getUserLogin(login: String): Single<GitHubUser>
    fun getRepo(repos: String): Single<List<Repos>>
}