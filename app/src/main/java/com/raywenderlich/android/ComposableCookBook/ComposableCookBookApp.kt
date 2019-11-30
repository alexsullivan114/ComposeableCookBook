package com.raywenderlich.android.ComposableCookBook

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.FlexColumn
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.material.surface.Surface

@Composable
fun ComposableCookBookApp() {
  MaterialTheme {
    FlexColumn {
      inflexible {
        TopAppBar(title = {
          Text("ComposableCookBook")
        })
      }
      flexible(flex = 1f) {
        Surface(color = Color(250, 250, 250)) {
          RecipeList(defaultRecipes)
        }
      }
    }
  }
}