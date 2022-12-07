package com.example.mvp.repository.impl

import com.example.mvp.model.GitUsers
import com.example.mvp.repository.GitUsersRepository

class RepositoryGitUserImpl : GitUsersRepository {
    private val repository = listOf(
        GitUsers("Mark"),
        GitUsers("Switch"),
        GitUsers("Gold"),
        GitUsers("Block"),
        GitUsers("Server"),

        )

    override fun getGitUsers(): List<GitUsers> = repository


}