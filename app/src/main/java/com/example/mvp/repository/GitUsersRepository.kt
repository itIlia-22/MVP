package com.example.mvp.repository

import com.example.mvp.model.GitUsers

interface GitUsersRepository {
    fun getGitUsers(): List<GitUsers>

}