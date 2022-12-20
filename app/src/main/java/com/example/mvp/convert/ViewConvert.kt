package com.example.mvp.convert

import com.example.mvp.model.GitUsers
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndStrategy::class)
interface ViewConvert : MvpView {


}