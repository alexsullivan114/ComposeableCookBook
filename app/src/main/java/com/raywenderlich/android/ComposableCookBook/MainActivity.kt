package com.raywenderlich.android.ComposableCookBook

import android.os.Bundle
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.material.themeTextStyle
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MaterialTheme {
        Surface(color = Color(250, 250, 250)) {
          ListOfStuff()
        }
      }
    }
  }
}

@Composable
@Preview
fun ListOfStuff() {
  VerticalScroller() {
    Column(crossAxisSize = LayoutSize.Expand) {
      IngredientCard(R.drawable.noodles)
      IngredientCard(R.drawable.pizza)
      IngredientCard(R.drawable.produce)
      IngredientCard(R.drawable.salad_egg)
      IngredientCard(R.drawable.smoothie)
      IngredientCard(R.drawable.croissant)
    }
  }
}

fun IngredientCard(@DrawableRes imageRes: Int) {
  val image = +imageResource(imageRes)
  Padding(16.dp) {
    Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp) {
      Column(crossAxisSize = LayoutSize.Expand) {
        Container(expanded = true, height = 144.dp) {
          DrawImage(image = image)
        }
        Column(modifier = Spacing(16.dp)) {
          Text("Ingredients", style = +themeTextStyle { h4 })
          Text("• Red Kidney Beans")
          Text("• Onions")
          Text("• Ginger")
          Text("• Garlic")
          Text("• Time!")
        }
      }
    }
  }
}

