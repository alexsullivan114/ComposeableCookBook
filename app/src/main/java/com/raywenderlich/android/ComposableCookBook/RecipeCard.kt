package com.raywenderlich.android.ComposableCookBook

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.material.themeTextStyle
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

@Composable
fun RecipeCard(recipe: Recipe) {
  Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp) {
    val image = +imageResource(recipe.imageResource)
    Column {
      Container(expanded = true, height = 144.dp) {
        DrawImage(image = image)
      }
      Column(modifier = Spacing(16.dp)) {
        Text(recipe.title, style = +themeTextStyle { h4 })
        for (ingredient in recipe.ingredients) {
          Text("• $ingredient")
        }
      }
    }
  }
}

@Composable
@Preview
fun DefaultRecipeCard() {
  MaterialTheme {
    RecipeCard(defaultRecipes[0])
  }
}

