package com.example.mvp.details

import com.example.mvp.screens.UserScreen
import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter

class DetailsPresenter(
    private val router: Router

): MvpPresenter<DetailsView>() {




    fun onBackPressed(): Boolean {
        router.backTo(UserScreen)
        return true
    }
}