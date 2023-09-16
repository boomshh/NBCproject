package com.example.market

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

@Parcelize
data class MyItem(
    val aIcon:Int,
    val aName:String,
    val aAddress:String,
    val aPrice:String,
    val aLike:String,
    val aComment:String,
    val aPerson:String,
    val aEx:String,
    val aTem:String,
    val aEmo:Int) : Parcelable {
}