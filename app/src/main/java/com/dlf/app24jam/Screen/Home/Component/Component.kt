package com.dlf.app24jam.Screen.Home.Component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dlf.app24jam.Component.PretendardText
import com.dlf.app24jam.ui.theme.Body1
import com.dlf.app24jam.ui.theme.Body4
import com.dlf.app24jam.ui.theme.gray300
import com.dlf.app24jam.ui.theme.gray400
import com.dlf.app24jam.ui.theme.gray50
import com.dlf.app24jam.ui.theme.gray500

@Composable
fun PreviewCard(title: String, Subtitle: String){
    Column(modifier = Modifier
        .fillMaxWidth()
        .height(92.dp)
        .background(shape = RoundedCornerShape(16.dp), color = gray50)
        .padding(20.dp, 24.dp, 20.dp, 24.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            PretendardText(text = title, TypeScale = Body1 )
            Icon(imageVector = Icons.Default.ArrowForward, contentDescription = null)
        }
        PretendardText(text = Subtitle, TypeScale = Body4, color = gray300)
        
    }
}

@Composable
@Preview
fun PreviewCardPreview(){
    PreviewCard("dd","dd")
}
