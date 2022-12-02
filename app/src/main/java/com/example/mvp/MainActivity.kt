package com.example.mvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = CounterPresenter(this)


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

    override fun setText(counter: String, id: Int) {
        with(binding){
            when (id) {
                0 -> text.text = counter
                1-> text1.text = counter
                2 -> text2.text = counter
            }
        }

    }
}