package com.dlf.app24jam.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.dlf.app24jam.R


object Font {
    val EliceDXNeolii = FontFamily(
        Font(R.font.elicedxneolli_bold, FontWeight.Bold, FontStyle.Normal)
    )

    val pretendard = FontFamily(
        Font(R.font.pretendard_black, FontWeight.Black, FontStyle.Normal),
        Font(R.font.pretendard_bold, FontWeight.Bold, FontStyle.Normal),
        Font(R.font.pretendard_extrabold, FontWeight.ExtraBold, FontStyle.Normal),
        Font(R.font.pretendard_extralight, FontWeight.ExtraLight, FontStyle.Normal),
        Font(R.font.pretendard_light, FontWeight.Light, FontStyle.Normal),
        Font(R.font.pretendard_medium, FontWeight.Medium, FontStyle.Normal),
        Font(R.font.pretendard_regular, FontWeight.Normal, FontStyle.Normal),
        Font(R.font.pretendard_semibold, FontWeight.SemiBold, FontStyle.Normal),
        Font(R.font.pretendard_thin, FontWeight.Thin, FontStyle.Normal),
    )
}
val H1 = TextStyle(
    fontSize = 24.sp,
    fontWeight = FontWeight.SemiBold,
)
val H2 = TextStyle(
    fontSize = 22.sp,
    fontWeight = FontWeight.SemiBold,
)
val H3 = TextStyle(
    fontSize = 20.sp,
    fontWeight = FontWeight.SemiBold,
)
val H4 = TextStyle(
    fontSize = 18.sp,
    fontWeight = FontWeight.SemiBold,
)
val H5 = TextStyle(
    fontSize = 18.sp,
    fontWeight = FontWeight.Medium,
)
val Body0 = TextStyle(
    fontSize = 16.sp,
    fontWeight = FontWeight.SemiBold,
)
val Body1 = TextStyle(
    fontSize = 16.sp,
    fontWeight = FontWeight.SemiBold,
)
val Body2 = TextStyle(
    fontSize = 16.sp,
    fontWeight = FontWeight.Medium,
)
val Body3 = TextStyle(
    fontSize = 14.sp,
    fontWeight = FontWeight.SemiBold,
)
val Body4 = TextStyle(
    fontSize = 14.sp,
    fontWeight = FontWeight.Medium,
)
val Caption = TextStyle(
    fontSize = 12.sp,
    fontWeight = FontWeight.Medium,
)