package com.example.mvp.api

import android.os.Parcelable
import com.example.mvp.model.loc.GitHubUser
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RepositoryDto(
    @Expose
    @SerializedName("forks_url")
    val forks_url: String,
    @Expose
    @SerializedName("id")
    val id: Int,
    @SerializedName("node_id")
    @Expose
    val nodeId: String = "",
    @Expose
    @SerializedName("name")
    val name: String,
    @Expose
    @SerializedName("full_name")
    val fullName: String,
    @Expose
    @SerializedName("owner")
    val owner: GitHubUser,
    @Expose
    @SerializedName("private")
    val private: Boolean = false,
    @Expose
    @SerializedName("html_url")
    val htmlUrl: String,
    @Expose
    @SerializedName("url")
    val url: String,
    @Expose
    @SerializedName("description")
    val description: String,
    @Expose
    @SerializedName("forks_count")
    val forksCount: Int,
    @Expose
    @SerializedName("stargazers_count")
    val stargazersCount: Int,
    @Expose
    @SerializedName("starred_url")
    val watchersCount: Int,

    ) : Parcelable
