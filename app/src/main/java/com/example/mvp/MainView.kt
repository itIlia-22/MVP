package com.example.mvp

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndStrategy::class)
interface MainView : MvpView {

    fun setText1(counter: String)
    fun setText2(counter: String)
    fun setText3(counter: String)
}