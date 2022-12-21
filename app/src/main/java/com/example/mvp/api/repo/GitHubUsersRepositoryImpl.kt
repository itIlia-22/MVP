package com.example.mvp.api.repo

import com.example.mvp.api.DataSource
import com.example.mvp.api.data.loc.GitHubUser
import com.example.mvp.api.data.loc.mapper.Mapper
import io.reactivex.rxjava3.core.Single

class GitHubUsersRepositoryImpl constructor(private val api: DataSource) : GitHubUsersRepository {
    override fun getUsers(): Single<List<GitHubUser>> {
        return api.loadUser()
            .map { it.map(Mapper::mapToEntity) }
    }


}