package com.example.mvp.api.data.loc.mapper

import com.example.mvp.api.UserApiDto
import com.example.mvp.api.data.loc.GitHubUser

object Mapper {



    fun mapToEntity(dto:UserApiDto):GitHubUser{
        return GitHubUser(
            id = dto.id,
            login = dto.login,
            avatar_url = dto.avatar_url
        )
    }
}