package com.example.mvp.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvp.App
import com.example.mvp.databinding.FragmentUserBinding
import com.example.mvp.interfacs.OnBackPressendListener
import com.example.mvp.interfacs.OnClickListener
import com.example.mvp.model.GitUsers
import com.example.mvp.repository.impl.RepositoryGitUserImpl
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter


class UserFragment : MvpAppCompatFragment(), UserView, OnBackPressendListener {
    private lateinit var binding: FragmentUserBinding

    private val presenter by moxyPresenter {
        UserPresenter(
            App.instance.router,
            RepositoryGitUserImpl()
        )
    }
    private val adapter = UserAdapter(object : OnClickListener {
        override fun onClick(login: String) {
            presenter.openInfoFragment(login)
        }

    })


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            rvUsers.layoutManager = LinearLayoutManager(requireContext())
            rvUsers.adapter = adapter

        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentUserBinding.inflate(inflater, container, false).also {
            binding = it
        }.root
    }

    companion object {
        fun newInstance() = UserFragment()
    }

    override fun initList(list: List<GitUsers>) {
        adapter.users = list
    }

    override fun show() = with(binding) {
        lodList.visibility = View.VISIBLE
    }

    override fun hide() = with(binding) {
        lodList.visibility = View.GONE
    }

    override fun openClickFragment() = with(binding) {
        convert.setOnClickListener {
            presenter.openConvertFragment()
        }
    }


    override fun onBackPressend(): Boolean {
        return presenter.onBackPressed()
    }
}