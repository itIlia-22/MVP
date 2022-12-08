package com.example.mvp.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mvp.App
import com.example.mvp.interfacs.OnBackPressendListener
import com.example.mvp.databinding.FragmentDetailsBinding
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter


class DetailsFragment : MvpAppCompatFragment(), DetailsView, OnBackPressendListener {
    private lateinit var binding: FragmentDetailsBinding

    private val presenter by moxyPresenter {
        DetailsPresenter(
            App.instance.router
        )
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.getString(ARG_LOGIN)?.let {
            binding.txLogin.text = it
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


}