package com.example.mvp.user

import android.util.Log
import com.example.mvp.repository.GitUsersRepository
import com.example.mvp.screens.UserScreen
import com.github.terrakok.cicerone.Router
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import moxy.MvpPresenter
import java.util.concurrent.TimeUnit

class UserPresenter(
    private val router: Router,
    private val repository: GitUsersRepository
) : MvpPresenter<UserView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.show()
        repository.getGitUsers()
            .delay(3000L, TimeUnit.MILLISECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                viewState.initList(it)
                viewState.hide()
            }, {
                Log.d("TAG", it.toString())
            })

    }

    fun openInfoFragment(login: String) {
        router.navigateTo(UserScreen.UserDetails(login))
    }

    fun onBackPressed(): Boolean {
        router.replaceScreen(UserScreen)
        return true
    }
}