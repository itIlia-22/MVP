package com.example.mvp.repository.impl

import com.example.mvp.model.GitUsers
import com.example.mvp.repository.GitUsersRepository
import io.reactivex.rxjava3.core.Single

class RepositoryGitUserImpl : GitUsersRepository {
    private val repository = listOf(
        GitUsers("Mark"),
        GitUsers("Switch"),
        GitUsers("Gold"),
        GitUsers("Block"),
        GitUsers("Server"),

        )

    override fun getGitUsers(): Single<List<GitUsers>> {
        return Single.create {
            it.onSuccess(repository)
        }
    }


}