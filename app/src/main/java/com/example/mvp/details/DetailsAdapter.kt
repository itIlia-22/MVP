package com.example.mvp.details

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvp.databinding.ItemRepoBinding
import com.example.mvp.model.loc.GitHubRepos

typealias OnRepoClickListener = (id: Long) -> Unit

class DetailsAdapter(private val onUserClickListener: OnRepoClickListener) :
    RecyclerView.Adapter<DetailsAdapter.MyViewHolder>() {
    var userApis: List<GitHubRepos> = emptyList()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class MyViewHolder(
        itemView: ItemRepoBinding,
        private val onUserClickListener: OnRepoClickListener,
    ) : RecyclerView.ViewHolder(itemView.root) {

        fun bind(repo: GitHubRepos) {
            ItemRepoBinding.bind(itemView).apply {
                tvRepo.text = repo.fullName
                root.setOnClickListener {
                    onUserClickListener.invoke(repo.id)
                }

            }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = ItemRepoBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        return MyViewHolder(view, onUserClickListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(userApis[position])
    }

    override fun getItemCount(): Int = userApis.size
}