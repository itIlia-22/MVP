package com.example.mvp

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvp.databinding.ActivityMainBinding
import com.example.mvp.model.GitUsers
import com.example.mvp.repository.impl.RepositoryGitUserImpl
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding
    private val presenter by moxyPresenter { CounterPresenter(RepositoryGitUserImpl()) }
    private val adapter = MainAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            rvUsers.layoutManager = LinearLayoutManager(this@MainActivity)
            rvUsers.adapter = adapter

        }

    }

    override fun initList(list: List<GitUsers>) {
        adapter.users = list
    }


}