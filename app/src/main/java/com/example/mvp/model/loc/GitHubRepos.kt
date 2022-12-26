package com.example.mvp.model.loc

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GitHubRepos(
    val forks_url: String,
    val id: Long,
    val fullName: String,
):Parcelable
