package com.dlf.app24jam.Screen.Health.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dlf.app24jam.Component.PretendardText
import com.dlf.app24jam.R
import com.dlf.app24jam.ui.theme.Body2
import com.dlf.app24jam.ui.theme.Body4
import com.dlf.app24jam.ui.theme.Caption
import com.dlf.app24jam.ui.theme.H4
import com.dlf.app24jam.ui.theme.blue100
import com.dlf.app24jam.ui.theme.blue50
import com.dlf.app24jam.ui.theme.blue500
import com.dlf.app24jam.ui.theme.gray100
import com.dlf.app24jam.ui.theme.gray50
import com.dlf.app24jam.ui.theme.gray500
import com.dlf.app24jam.ui.theme.green200
import com.dlf.app24jam.ui.theme.green50
import com.dlf.app24jam.ui.theme.green500
import com.dlf.app24jam.ui.theme.green600

@Composable
fun MealCard(title: String, img:Painter) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(RoundedCornerShape(16.dp))
    ) {
        // 배경 이미지
        Image(
            painter = img,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
        PretendardText(text = title, TypeScale = H4, color = Color.White,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(16.dp, 12.dp, 0.dp, 0.dp))
        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(1.dp, green200),
            colors = ButtonDefaults.buttonColors(
                containerColor = green50),
            modifier = Modifier
                .padding(0.dp, 0.dp, 12.dp, 12.dp)
                .align(Alignment.BottomEnd),
            contentPadding = PaddingValues(1.dp, 0.dp, 1.dp, 0.dp)
        ) {
            PretendardText(text = "기록완료", TypeScale = Caption, color = green500)
        }
    }
}
@Composable
fun MartCard(){
    Surface (
        modifier = Modifier
            .width(293.dp)
            .height(176.dp)
            .border(1.dp, gray100)
            .clip(RoundedCornerShape(32.dp)),
        color = gray50,
    ){
        Column(modifier = Modifier.padding(18.dp, 18.dp, 18.dp, 18.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(painter = painterResource(id = R.drawable.breakfast_img), contentDescription = null,
                    modifier = Modifier
                        .size(48.dp, 48.dp)
                        .clip(RoundedCornerShape(16.dp)),
                )
                Column {
                    PretendardText(text = "초록마을", TypeScale = Body2)
                    PretendardText(text = "서울 광진구 뚝섬로 522 심희빌딩", TypeScale = Body4, color = gray500)
                }
            }
            Spacer(modifier = Modifier.size(12.dp))
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.horizontalScroll(rememberScrollState())
            ){
                Box (
                    modifier = Modifier
                        .size(56.dp, 30.dp)
                        .background(shape = CircleShape, color = blue50)
                        .border(1.dp, blue100, shape = CircleShape)

                ){
                    PretendardText(text = "식자재", TypeScale = Caption, color = blue500,
                        modifier = Modifier.align(Alignment.Center))
                }
                Spacer(modifier = Modifier.size(8.dp))
                Box (
                    modifier = Modifier
                        .size(56.dp, 30.dp)
                        .background(shape = CircleShape, color = blue50)
                        .border(1.dp, blue100, shape = CircleShape)

                ){
                    PretendardText(text = "식자재", TypeScale = Caption, color = blue500,
                        modifier = Modifier.align(Alignment.Center))
                }
                Spacer(modifier = Modifier.size(8.dp))
            }
        }

    }
}

@Preview
@Composable
fun MealCardPreview(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .height(100.dp)
            .clip(RoundedCornerShape(16.dp)),
        color = Color.Black
    ) {
        Row {
            MartCard()
        }
    }

}