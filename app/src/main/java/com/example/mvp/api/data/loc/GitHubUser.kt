package com.example.mvp.api.data.loc

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class GitHubUser(
    val id: String,
    val login: String,
    val avatar_url: String?,

    ) : Parcelable
