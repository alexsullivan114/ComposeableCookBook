package com.raywenderlich.android.ComposableCookBook

import androidx.compose.Composable
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.layout.Container
import androidx.ui.material.ripple.Ripple

@Composable
fun RippleImageButton(onClick: () -> Unit, child: @Composable()() -> Unit) {
  Ripple(bounded = false) {
    Clickable(onClick = onClick) {
      Container(height = 18.dp, width = 18.dp) {
        child()
      }
    }
  }
}
