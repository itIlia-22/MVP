package com.example.mvp.user

import com.example.mvp.model.GitUsers
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndStrategy::class)
interface UserView : MvpView {

    fun initList(list: List<GitUsers>)
}