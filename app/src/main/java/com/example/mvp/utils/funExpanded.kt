package com.example.mvp.utils

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.mvp.R

fun ImageView.loadViewList(url: String?) {
    Glide.with(context)
        .load(url)
        .placeholder(R.drawable.ic_user_list)
        .into(this)
}
fun ImageView.loadView(url: String?) {
    Glide.with(context)
        .load(url)
        .placeholder(R.drawable.ic_user)
        .into(this)
}

fun View.makeVisible() {
    this.visibility = View.VISIBLE
}

fun View.makeGone() {
    this.visibility = View.GONE
}