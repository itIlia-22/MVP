package com.example.mvp.details

import android.util.Log
import com.example.mvp.api.repo.GitHubUsersRepository
import com.example.mvp.screens.UserScreen
import com.github.terrakok.cicerone.Router
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import moxy.MvpPresenter
import java.util.concurrent.TimeUnit

class DetailsPresenter(
    private val router: Router,
    private val repository: GitHubUsersRepository

): MvpPresenter<DetailsView>() {

    fun loadUser(login:String){
        viewState.show()
        repository.getUserLogin(login)
            .delay(1000L, TimeUnit.MILLISECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                viewState.showLogin(it)
                viewState.hide()
            }, {
                Log.d("TAG", it.toString())
            })

    }


    fun onBackPressed(): Boolean {
        router.backTo(UserScreen)
        return true
    }
}