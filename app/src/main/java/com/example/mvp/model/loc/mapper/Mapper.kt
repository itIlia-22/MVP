package com.example.mvp.model.loc.mapper

import com.example.mvp.api.RepositoryDto
import com.example.mvp.api.UserApiDto
import com.example.mvp.model.loc.GitHubUser
import com.example.mvp.model.loc.Repos

object Mapper {


    fun mapToEntity(dto: UserApiDto): GitHubUser {
        return GitHubUser(
            id = dto.id,
            login = dto.login,
            avatar_url = dto.avatar_url,

            )
    }

    fun mapToEntity(dto: RepositoryDto): Repos {
        return Repos(
            id = dto.id,
            forks_url = dto.forks_url,
            forksCount = dto.forksCount,
            fullName = dto.fullName,
            name = dto.name,
            description = dto.description,
            url = dto.url,
            htmlUrl = dto.htmlUrl,
            nodeId = dto.nodeId,
            watchersCount = dto.watchersCount,
            owner = dto.owner,
            stargazersCount = dto.stargazersCount


        )
    }


}