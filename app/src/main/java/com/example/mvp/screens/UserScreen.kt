package com.example.mvp.screens

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.example.mvp.convert.ConvertFragment
import com.example.mvp.details.DetailsFragment
import com.example.mvp.user.UserFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

 object UserScreen: FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment {
        return UserFragment.newInstance()
    }
     data class UserDetails(val login:String):FragmentScreen {
         override fun createFragment(factory: FragmentFactory): Fragment {
             return DetailsFragment.newInstance(login)
         }
     }

     class ConvertToFragment():FragmentScreen{
         override fun createFragment(factory: FragmentFactory): Fragment {
             return ConvertFragment.newInstance()
         }

     }
     }