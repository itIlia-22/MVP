package com.example.mvp.api

import android.os.Parcelable
import com.example.mvp.model.loc.GitHubUser
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RepositoryDto(
    @Expose
    @SerializedName("id")
    val id: Long,
    @Expose
    @SerializedName("forks")
    val forks: Int,
    @Expose
    @SerializedName("full_name")
    val name: String


) : Parcelable
