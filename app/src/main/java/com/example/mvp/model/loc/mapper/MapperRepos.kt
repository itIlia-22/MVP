package com.example.mvp.model.loc.mapper

import com.example.mvp.api.RepositoryDto
import com.example.mvp.model.loc.GitHubRepos

object MapperRepos {


    fun mapToEntity(dto: RepositoryDto): GitHubRepos {
        return GitHubRepos(
            id = dto.id,
            fullName = dto.name,
            forks_url = dto.forks.toString()

        )
    }


}