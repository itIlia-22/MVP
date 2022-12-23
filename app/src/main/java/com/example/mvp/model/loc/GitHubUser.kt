package com.example.mvp.model.loc

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class GitHubUser(
    val id: String,
    val login: String,
    val avatar_url: String?,


    ) : Parcelable

@Parcelize
data class Repos(
    val forks_url: String,
    val id: Int,
    val nodeId: String = "",
    val name: String = "",
    val fullName: String,
    val owner: GitHubUser,
    val private: Boolean = false,
    val htmlUrl: String,
    val url: String,
    val description: String,
    val forksCount: Int,
    val stargazersCount: Int,
    val watchersCount: Int,
) : Parcelable