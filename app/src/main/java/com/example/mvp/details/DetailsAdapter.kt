package com.example.mvp.details

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvp.databinding.ItemRepoBinding
import com.example.mvp.model.loc.Repos

//val onClickListener: OnClickListener
class DetailsAdapter() :
    RecyclerView.Adapter<DetailsAdapter.MyViewHolder>() {
    var userApis: List<Repos> = emptyList()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class MyViewHolder(itemView: ItemRepoBinding) : RecyclerView.ViewHolder(itemView.root) {

        fun bind(repo: Repos) {
            ItemRepoBinding.bind(itemView).apply {
                tvRepo.text = repo.url

                /*
                tvLogin.setOnClickListener {
                    onClickListener.onClick(login.login)
                }
                 */

            }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = ItemRepoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(userApis[position])
    }

    override fun getItemCount(): Int = userApis.size
}