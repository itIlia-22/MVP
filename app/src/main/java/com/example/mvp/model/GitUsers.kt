package com.example.mvp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class GitUsers(val login: String) : Parcelable
