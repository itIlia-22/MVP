package com.example.mvp.repository

import com.example.mvp.model.GitUsers
import io.reactivex.rxjava3.core.Single

interface GitUsersRepository {
    fun getGitUsers(): Single<List<GitUsers>>

}