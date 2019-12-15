package com.raywenderlich.android.ComposableCookBook

import androidx.compose.Composable
import androidx.ui.core.dp
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.layout.Padding

@Composable
fun RecipeList(recipes: List<Recipe>) {
  VerticalScroller {
    Column {
      for (recipe in recipes) {
        Padding(16.dp) {
          RecipeCard(recipe)
        }
      }
    }
  }
}

