package com.raywenderlich.android.ComposableCookBook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.material.ripple.Ripple
import androidx.ui.material.surface.Surface
import androidx.ui.material.themeTextStyle
import androidx.ui.res.imageResource

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
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
  }
}

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

@Composable
fun RecipeCard(recipe: Recipe) {
  val image = +imageResource(recipe.imageResource)
  val favoriteResource = if (recipe.favorite) R.drawable.favorite_filled else R.drawable.favorite_outline
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
              Ripple(bounded = false) {
                Clickable(onClick = { recipe.favorite = !recipe.favorite }) {
                  Container(height = 18.dp, width = 18.dp) {
                    DrawImage(image = favoritedImage)
                  }
                }
              }
            }
          }
          recipe.ingredients.forEach {
            Text("• $it")
          }
        }
      }
    }
  }
}

