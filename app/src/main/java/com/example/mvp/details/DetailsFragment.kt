package com.example.mvp.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mvp.App
import com.example.mvp.api.Retrofit
import com.example.mvp.api.data.loc.GitHubUser
import com.example.mvp.api.repo.GitHubUsersRepositoryImpl
import com.example.mvp.databinding.FragmentDetailsBinding
import com.example.mvp.interfacs.OnBackPressendListener
import com.example.mvp.utils.loadView
import com.example.mvp.utils.makeGone
import com.example.mvp.utils.makeVisible
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter


class DetailsFragment : MvpAppCompatFragment(), DetailsView, OnBackPressendListener {
    private lateinit var binding: FragmentDetailsBinding

    private val presenter by moxyPresenter {
        DetailsPresenter(
            App.instance.router,
            GitHubUsersRepositoryImpl(Retrofit.api)
        )
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.getString(ARG_LOGIN)?.let { login ->
            presenter.loadUser(login)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentDetailsBinding.inflate(inflater, container, false).also {
            binding = it
        }.root
    }

    companion object {
        private const val ARG_LOGIN = "ARG_LOGIN"
        fun newInstance(login: String): DetailsFragment {
            return DetailsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_LOGIN, login)
                }
            }
        }
    }


    override fun onBackPressend(): Boolean {
        return presenter.onBackPressed()
    }

    override fun showLogin(login: GitHubUser) = with(binding) {
        image.loadView(login.avatar_url)
        txLogin.text = login.login
    }

    override fun show() = with(binding) {
        image.makeGone()
        txLogin.makeGone()
        lodList.makeVisible()
    }

    override fun hide() = with(binding) {
        image.makeVisible()
        txLogin.makeVisible()
        lodList.makeGone()
    }


}