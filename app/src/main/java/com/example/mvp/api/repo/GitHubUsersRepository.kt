package com.example.mvp.api.repo

import com.example.mvp.api.UserApi
import com.example.mvp.api.data.loc.GitHubUser
import io.reactivex.rxjava3.core.Single

interface GitHubUsersRepository {

    fun getUsers():Single<List<GitHubUser>>
    //fun getUserLogin(login:String):Single<User>
}