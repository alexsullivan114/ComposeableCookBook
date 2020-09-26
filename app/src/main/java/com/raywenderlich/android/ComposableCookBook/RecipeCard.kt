package com.raywenderlich.android.composableCookBook

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Composable
fun RecipeCard(recipe: Recipe, modifier: Modifier) {
  Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp, modifier = modifier) {
    val image = imageResource(recipe.imageResource)
    Column(modifier = Modifier.fillMaxWidth()) {
      Image(asset = image, contentScale = ContentScale.Crop, modifier = Modifier.fillMaxWidth().height(144.dp))
      Column(modifier = Modifier.padding(16.dp)) {
        Text(recipe.title, style = MaterialTheme.typography.h4, modifier = Modifier.padding(bottom = 4.dp))
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
    RecipeCard(defaultRecipes[0], Modifier.padding(16.dp))
  }
}

