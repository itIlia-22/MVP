package com.example.mvp

class CounterPresenter(
    private val view: MainView
) {
    private val model = CounterModel()

    fun clickBtnOne() {
        view.setText(model.next(0).toString(), 0)
    }

    fun clickBtnTwo() {
        view.setText(model.next(0).toString(), 0)
    }

    fun clickBtnThree() {
        view.setText(model.next(0).toString(), 0)
    }

}