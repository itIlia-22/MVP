package com.example.mvp

import com.example.mvp.model.GitUsers
import com.example.mvp.repository.GitUsersRepository
import moxy.MvpPresenter

class CounterPresenter(
    val repository:GitUsersRepository
): MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.initList(repository.getGitUsers())
    }


}