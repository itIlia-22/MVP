package com.example.mvp.main

import com.example.mvp.screens.UserScreen
import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter

class MainPresenter(
    private val router:Router
): MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        router.replaceScreen(UserScreen)
    }
    fun onBackPressed() {
        router.exit()
    }

}