package com.example.mvp.convert

import com.example.mvp.screens.UserScreen
import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter

class ConvertPresenter(
    private val router: Router
): MvpPresenter<ViewConvert>() {


    fun onBackPressed(): Boolean {
        router.backTo(UserScreen)
        return true
    }

}