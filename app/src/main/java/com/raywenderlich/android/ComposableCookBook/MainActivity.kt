package com.raywenderlich.android.ComposableCookBook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.FlexColumn
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview

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
            RecipeList(defaultRecipes)
          }
        }
      }
    }
  }
}

@Composable
@Preview
fun Greeting() {
  Column {
    Text("Hello, World!", style = TextStyle(color = Color.Red))
    Text("Hello, Second World!", style = TextStyle(color = Color.Red))
    Text("Hello, Third World!", style = TextStyle(color = Color.Red))
  }
}

