package com.dlf.app24jam.Component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dlf.app24jam.ui.theme.Font

@Composable
fun PretendardText(
    text: String,
    TypeScale: TextStyle,
    color: Color = Color.Black,
    fontFamily: FontFamily = Font.pretendard,
    modifier: Modifier = Modifier
){
    Text(text = text,
        style = TypeScale,
        color = color,
        fontFamily = fontFamily,
        modifier = modifier)
}