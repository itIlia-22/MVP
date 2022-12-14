package com.example.mvp.model.loc

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class GitHubUser(
    val id: Long,
    val login: String,
    val avatar_url: String?,


    ) : Parcelable

@Parcelize
data class Repos(
    val forks_url: String,
    val id: Long,
    val fullName: String,

) : Parcelable