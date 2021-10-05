package com.tugas.fureehometest.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.tugas.fureehometest.R

val prompt = FontFamily(
    listOf(
        Font(R.font.prompt_black,FontWeight.Black),
        Font(R.font.prompt_bold,FontWeight.Bold),
        Font(R.font.prompt_extrabold, FontWeight.ExtraBold),
        Font(R.font.prompt_extralight,FontWeight.ExtraLight),
        Font(R.font.prompt_light, FontWeight.Light),
        Font(R.font.prompt_regular, FontWeight.Normal),
        Font(R.font.prompt_medium, FontWeight.Medium),
        Font(R.font.prompt_semibold, FontWeight.SemiBold),
        Font(R.font.prompt_thin,FontWeight.Thin)
    )
)
// Set of Material typography styles to start with
val typography = Typography(
    body1 = TextStyle(
        color = textDarkBlue,
        fontFamily = prompt,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp
    ),
    body2 = TextStyle(
        color = textDarkBlue,
        fontFamily = prompt,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp
    ),
    h1 = TextStyle(
        color = textDarkBlue,
        fontFamily = prompt,
        fontWeight = FontWeight.SemiBold,
        fontSize = 21.sp
    ),
    h2 = TextStyle(
        color = textDarkBlue,
        fontFamily = prompt,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    ),
    h3 = TextStyle(
        color = textDarkBlue,
        fontFamily = prompt,
        fontWeight = FontWeight.SemiBold,
        fontSize = 15.sp
    ),
    button = TextStyle(
        color = Color.White,
        fontFamily = prompt,
        fontWeight = FontWeight.SemiBold,
        fontSize = 15.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)