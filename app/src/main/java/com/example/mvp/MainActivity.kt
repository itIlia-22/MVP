package com.example.mvp

import android.os.Bundle
import com.example.mvp.databinding.ActivityMainBinding
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding
    private val presenter by moxyPresenter { CounterPresenter(CounterModel()) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            presenter.clickBtnOne()
        }
        binding.btn1.setOnClickListener {
            presenter.clickBtnTwo()
        }
        binding.btn2.setOnClickListener {
            presenter.clickBtnThree()
        }
    }


    override fun setText1(counter: String) = with(binding) {
        text.text = counter
    }

    override fun setText2(counter: String) = with(binding) {
        text1.text = counter
    }

    override fun setText3(counter: String) = with(binding) {
        text2.text = counter
    }
}