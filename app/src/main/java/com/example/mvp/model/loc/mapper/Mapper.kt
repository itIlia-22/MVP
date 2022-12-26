package com.example.mvp.model.loc.mapper

import com.example.mvp.api.RepositoryDto
import com.example.mvp.api.UserApiDto
import com.example.mvp.model.loc.GitHubUser
import com.example.mvp.model.loc.GitHubRepos

object Mapper {


    fun mapToEntity(dto: UserApiDto): GitHubUser {
        return GitHubUser(
            id = dto.id,
            login = dto.login,
            avatar_url = dto.avatar_url,

            )
    }




}