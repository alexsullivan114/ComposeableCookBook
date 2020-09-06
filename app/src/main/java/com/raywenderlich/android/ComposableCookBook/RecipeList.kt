package com.raywenderlich.android.ComposableCookBook

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun RecipeList(recipes: List<Recipe>) {
  ScrollableColumn {
    Column {
      for (recipe in recipes) {
          RecipeCard(recipe, Modifier.padding(16.dp))
      }
    }
  }
}

