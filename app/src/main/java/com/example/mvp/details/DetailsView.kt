package com.example.mvp.details

import com.example.mvp.model.loc.GitHubUser
import com.example.mvp.model.loc.GitHubRepos
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndStrategy::class)
interface DetailsView : MvpView {
   // repos:List<GitHubRepos>
    fun showLogin(login: GitHubUser,)
    fun show()
    fun hide()
}