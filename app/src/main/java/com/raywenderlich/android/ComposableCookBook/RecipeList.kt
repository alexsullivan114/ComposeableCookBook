package com.raywenderlich.android.ComposableCookBook

import androidx.compose.Composable
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.layout.LayoutSize

@Composable
fun RecipeList(recipes: List<Recipe>) {
  VerticalScroller {
    Column(crossAxisSize = LayoutSize.Expand) {
      for (recipe in recipes) {
        RecipeCard(recipe)
      }
    }
  }
}

