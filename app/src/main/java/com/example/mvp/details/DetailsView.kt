package com.example.mvp.details

import com.example.mvp.model.loc.GitHubUser
import com.example.mvp.model.loc.Repos
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndStrategy::class)
interface DetailsView : MvpView {

    fun showLogin(login: GitHubUser)
    fun initList(repo: List<Repos>)
    fun show()
    fun hide()
}