package com.raywenderlich.android.ComposableCookBook

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.surface.Surface
import androidx.ui.material.themeTextStyle
import androidx.ui.res.imageResource

@Composable
fun RecipeCard(recipe: Recipe) {
  val image = +imageResource(recipe.imageResource)
  val favoriteResource =
      if (recipe.favorite) R.drawable.favorite_filled else R.drawable.favorite_outline
  val favoritedImage = +imageResource(favoriteResource)
  Padding(16.dp) {
    Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp) {
      Column(crossAxisSize = LayoutSize.Expand) {
        Container(expanded = true, height = 144.dp) {
          DrawImage(image = image)
        }
        Column(modifier = Spacing(16.dp)) {
          FlexRow {
            expanded(1f) {
              Text(recipe.title, style = +themeTextStyle { h4 })
            }
            inflexible {
              RippleImageButton(onClick = { recipe.favorite = !recipe.favorite }) {
                DrawImage(image = favoritedImage)
              }
            }
          }
          for (ingredient in recipe.ingredients) {
            Text("• $ingredient")
          }
        }
      }
    }
  }
}

