package com.example.mvp.api.data.loc.mapper

import com.example.mvp.api.UserApi
import com.example.mvp.api.data.loc.GitHubUser

object Mapper {



    fun mapToEntity(user:UserApi):GitHubUser{
        return GitHubUser(
            id = user.id,
            login = user.login,
            avatar_url = user.avatar_url
        )
    }
}