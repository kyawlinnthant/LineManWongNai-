package com.kyawlinnthant.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Size(
    val one: Dp = 1.dp,
    val tiny: Dp = 2.dp,
    val small: Dp = 4.dp,
    val base: Dp = 8.dp,
    val base2x: Dp = 16.dp,
    val base3x: Dp = 24.dp,
    val base4x: Dp = 32.dp,
    val base5x: Dp = 40.dp,
    val base6x: Dp = 48.dp,
    val base7x: Dp = 56.dp,
    val base8x: Dp = 64.dp,
    val base9x: Dp = 72.dp,
    val base10x: Dp = 80.dp,
    val base11x: Dp = 88.dp,
    val base12x: Dp = 96.dp,
    val topRank: Dp = 108.dp,
    val defaultAlpha: Float = 0.5f,
)

val DefaultSize = Size()

val MaterialTheme.dimen: Size
    @Composable
    get() = DefaultSize
