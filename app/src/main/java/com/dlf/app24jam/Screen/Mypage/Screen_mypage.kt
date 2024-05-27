package com.dlf.app24jam.Screen.Mypage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dlf.app24jam.Component.PretendardText
import com.dlf.app24jam.R
import com.dlf.app24jam.Screen.Home.Component.PreviewCard
import com.dlf.app24jam.ui.theme.H4

@Composable
fun Screen_mypage(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 0.dp, 20.dp, 0.dp)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(painter = painterResource(id = R.drawable.profile), contentDescription = null,
                modifier = Modifier.size(64.dp, 64.dp))
            Column {
                PretendardText(text = "안녕하세요", TypeScale = H4)
                PretendardText(text = "이주영님", TypeScale = H4)
            }
        }
        Spacer(modifier = Modifier.size(28.dp))
        Image(painter = painterResource(id = R.drawable.stamp), contentDescription = null,
            modifier = Modifier.size(350.dp, 224.dp))
        Spacer(modifier = Modifier.size(12.dp))
        PreviewCard(title = "쿠폰 교환하러 가기", Subtitle = "쿠폰을 교환하고 지원금을 받아보세요!")
    }
}
@Preview(showBackground = true)
@Composable
fun Screen_mypage_preview(){
    Screen_mypage()
}