package com.raywenderlich.android.ComposableCookBook

import androidx.annotation.DrawableRes
import androidx.compose.Model

@Model
data class Recipe(@DrawableRes val imageResource: Int,
                  val title: String,
                  val ingredients: List<String>,
                  var favorite: Boolean)