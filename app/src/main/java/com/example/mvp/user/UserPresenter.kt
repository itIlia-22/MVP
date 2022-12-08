package com.example.mvp.user

import com.example.mvp.screens.UserScreen
import com.example.mvp.repository.GitUsersRepository
import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter

class UserPresenter(
    private val router: Router,
    private val repository: GitUsersRepository
) : MvpPresenter<UserView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.initList(repository.getGitUsers())
    }

    fun openInfoFragment(login: String) {
        router.navigateTo(UserScreen.UserDetails(login))
    }

    fun onBackPressed(): Boolean {
        router.replaceScreen(UserScreen)
        return true
    }
}