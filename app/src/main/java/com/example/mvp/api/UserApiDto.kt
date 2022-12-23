package com.example.mvp.api

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserApiDto(
    @Expose
    @SerializedName("id")
    val id: String ,
    @Expose
    @SerializedName("login")
    val login: String ,
    @Expose
    @SerializedName("avatar_url")
    val avatar_url: String? ,


    ) : Parcelable

