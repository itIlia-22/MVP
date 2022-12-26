package com.example.mvp.api.repo

import com.example.mvp.api.DataSource
import com.example.mvp.model.loc.GitHubRepos
import com.example.mvp.model.loc.GitHubUser
import com.example.mvp.model.loc.mapper.Mapper
import com.example.mvp.model.loc.mapper.MapperRepos
import io.reactivex.rxjava3.core.Single

class GitHubUsersRepositoryImpl constructor(private val api: DataSource) : GitHubUsersRepository {
    override fun getUsers(): Single<List<GitHubUser>> {
        return api.loadUser()
            .map { it.map(Mapper::mapToEntity) }
    }

    override fun getUserLogin(login: String): Single<GitHubUser> {
        return api.getLogin(login)
            .map(Mapper::mapToEntity)
    }

    override fun getRepo(repos: String): Single<List<GitHubRepos>> {
        return api.getR(repos)
            .map { it.map(MapperRepos::mapToEntity) }
    }




}