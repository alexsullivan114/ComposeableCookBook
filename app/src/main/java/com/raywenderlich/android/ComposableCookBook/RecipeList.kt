package com.raywenderlich.android.composableCookBook

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.foundation.lazy.LazyColumnItems
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun RecipeList(recipes: List<Recipe>) {
  LazyColumnFor(items = recipes) { item ->
    RecipeCard(item, Modifier.padding(16.dp))
  }
}

