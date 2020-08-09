package com.raywenderlich.android.ComposableCookBook

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.size
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

@Composable
fun RecipeCard(recipe: Recipe) {
  Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp) {
    val image = imageResource(recipe.imageResource)
    Column(modifier = Modifier.fillMaxSize()) {
      Box(modifier = Modifier.fillMaxWidth()) {
        Image(asset = image)
      }
      // TODO: There used to be 16dp of spacing here.
      Column() {
        Text(recipe.title, style = MaterialTheme.typography.h4)
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

