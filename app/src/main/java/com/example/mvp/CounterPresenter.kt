package com.example.mvp

import moxy.MvpPresenter

class CounterPresenter(
    private val model: CounterModel
): MvpPresenter<MainView>(){


    fun clickBtnOne() {
        viewState.setText1(model.next(0).toString())
    }

    fun clickBtnTwo() {
        viewState.setText2(model.next(1).toString())
    }

    fun clickBtnThree() {
        viewState.setText3(model.next(2).toString())
    }

}