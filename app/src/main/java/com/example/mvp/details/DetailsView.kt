package com.example.mvp.details

import com.example.mvp.api.data.loc.GitHubUser
import com.example.mvp.model.GitUsers
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndStrategy::class)
interface DetailsView : MvpView {

    fun showLogin(login: GitHubUser)
    fun show()
    fun hide()
}