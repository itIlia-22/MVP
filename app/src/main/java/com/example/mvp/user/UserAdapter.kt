package com.example.mvp.user

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvp.interfacs.OnClickListener
import com.example.mvp.databinding.ItemUserBinding
import com.example.mvp.model.GitUsers

class UserAdapter(val onClickListener: OnClickListener) :
    RecyclerView.Adapter<UserAdapter.MyViewHolder>() {
    var users: List<GitUsers> = emptyList()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(login: GitUsers) {
            ItemUserBinding.bind(itemView).apply {
                tvLogin.text = login.login
                tvLogin.setOnClickListener {
                    onClickListener.onClick(login.login)
                }
            }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(view.root)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount(): Int = users.size
}