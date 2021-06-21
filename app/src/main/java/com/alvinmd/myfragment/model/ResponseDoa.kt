package com.alvinmd.myfragment.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResponseDoa(
    val image: Int?,
    val name: String?,
    val latin: String?,
) : Parcelable