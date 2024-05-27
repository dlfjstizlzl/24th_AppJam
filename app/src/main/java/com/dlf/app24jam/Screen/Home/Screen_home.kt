package com.dlf.app24jam.Screen.Home

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dlf.app24jam.Component.PretendardText
import com.dlf.app24jam.Screen.Health.component.MartCard
import com.dlf.app24jam.Screen.Home.Component.PreviewCard
import com.dlf.app24jam.ui.theme.Body4
import com.dlf.app24jam.ui.theme.H3
import com.dlf.app24jam.ui.theme.H4
import com.dlf.app24jam.ui.theme.gray400

@Composable
fun Screen_home(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 0.dp, 20.dp, 0.dp)
    ) {
        PretendardText(text = "2024년 01월 16일", TypeScale = Body4, color = gray400)
        Spacer(modifier = Modifier.size(8.dp))
        PretendardText(text = "이앱잼님을 위해 이런 서비스를 준비했어요", TypeScale = H3)
        Spacer(modifier = Modifier.size(28.dp))
        PreviewCard(title = "나를 위한 지원 알아보러가기", Subtitle = "나를 위한 지원 사업 알아보고 지원금 받자!")
        Spacer(modifier = Modifier.size(12.dp))
        PreviewCard(title = "내 건강을 위해 식단 체크해보기", Subtitle = "식단을 기록하고 돌아보고 건강도 챙기자!")
        Spacer(modifier = Modifier.size(12.dp))
        PreviewCard(title = "지친 내마음, 달래줄 곳이 필요하다면?", Subtitle = "무거운 이야기들, 챗봇에게 털어놓자")
        PretendardText(text = "내 주변 친환경 마트", TypeScale = H4)
        Spacer(modifier = Modifier.size(28.dp))
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())){
            MartCard()
            Spacer(modifier = Modifier.size(12.dp))
            MartCard()
            Spacer(modifier = Modifier.size(12.dp))
            MartCard()
            Spacer(modifier = Modifier.size(12.dp))
            MartCard()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Screen_home_preview(){
    Screen_home()
}