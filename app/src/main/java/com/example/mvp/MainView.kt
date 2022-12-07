package com.example.mvp

import com.example.mvp.model.GitUsers
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndStrategy::class)
interface MainView : MvpView {

    fun initList(list: List<GitUsers>)
}