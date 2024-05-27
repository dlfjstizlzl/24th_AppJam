package com.dlf.app24jam.Screen.Health

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dlf.app24jam.Component.PretendardText
import com.dlf.app24jam.R
import com.dlf.app24jam.Screen.Health.component.MartCard
import com.dlf.app24jam.Screen.Health.component.MealCard
import com.dlf.app24jam.ui.theme.Body4
import com.dlf.app24jam.ui.theme.Caption
import com.dlf.app24jam.ui.theme.H3
import com.dlf.app24jam.ui.theme.H4
import com.dlf.app24jam.ui.theme.gray100
import com.dlf.app24jam.ui.theme.gray300
import com.dlf.app24jam.ui.theme.gray400
import com.dlf.app24jam.ui.theme.gray600
import com.dlf.app24jam.ui.theme.gray900
import com.dlf.app24jam.ui.theme.green500
import com.dlf.app24jam.ui.theme.red500

@Composable
fun Screen_medicine() {
    val scrollState = rememberScrollState()
    Column (
        modifier = Modifier.verticalScroll(scrollState)
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 12.dp, 20.dp, 0.dp)
        ) {
            Column(
            ) {
                Column(
                ) {
                    PretendardText(text = "2024년 01월 16일", TypeScale = Body4, color = gray400)
                    Spacer(modifier = Modifier.size(8.dp))
                    PretendardText(text = "이주영님의 영양 상태", TypeScale = H3)
                    Spacer(modifier = Modifier.size(20.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "2024년 1월 1주차")
                        Row {
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowLeft,
                                contentDescription = null,
                                modifier = Modifier.padding(0.dp)
                            )
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowRight,
                                contentDescription = null
                            )
                            Spacer(modifier = Modifier.size(12.dp))
                            Surface(
                                shape = RoundedCornerShape(16.dp),
                                color = gray100,
                            ) {
                                PretendardText(
                                    text = "주", TypeScale = Caption, color = gray600,
                                    modifier = Modifier
                                        .padding(8.dp, 3.dp, 8.dp, 3.dp)
                                )
                            }
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.size(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 12.dp, 0.dp, 12.dp)
                ,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    PretendardText(text = "월", TypeScale = Body4, color = gray300)
                    Spacer(modifier = Modifier.size(8.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_bob),
                        contentDescription = null,
                        tint = red500
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    PretendardText(text = "1", TypeScale = Body4, color = gray300)
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    PretendardText(text = "화", TypeScale = Body4, color = gray300)
                    Spacer(modifier = Modifier.size(8.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_bob),
                        contentDescription = null,
                        tint = green500
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    PretendardText(text = "2", TypeScale = Body4, color = gray300)
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    PretendardText(text = "수", TypeScale = Body4, color = gray300)
                    Spacer(modifier = Modifier.size(8.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_bob),
                        contentDescription = null,
                        tint = green500
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    PretendardText(text = "3", TypeScale = Body4, color = gray300)
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    PretendardText(text = "목", TypeScale = Body4, color = gray300)
                    Spacer(modifier = Modifier.size(8.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_bob),
                        contentDescription = null,
                        tint = green500
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    PretendardText(text = "4", TypeScale = Body4, color = gray300)
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    PretendardText(text = "금", TypeScale = Body4, color = gray300)
                    Spacer(modifier = Modifier.size(8.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_bob),
                        contentDescription = null,
                        tint = green500
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    PretendardText(text = "5", TypeScale = Body4, color = gray300)
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    PretendardText(text = "토", TypeScale = Body4, color = gray300)
                    Spacer(modifier = Modifier.size(8.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_bob),
                        contentDescription = null,
                        tint = green500
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    PretendardText(text = "6", TypeScale = Body4, color = gray300)
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    PretendardText(text = "일", TypeScale = Body4, color = gray300)
                    Spacer(modifier = Modifier.size(8.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_bob),
                        contentDescription = null,
                        tint = gray300
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    PretendardText(text = "7", TypeScale = Body4, color = gray300)
                }
            }
        }
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp, 24.dp, 20.dp, 0.dp),
        ){
            PretendardText(text = "영양 상태 기록하기", TypeScale = H4, color = gray900)
            Spacer(modifier = Modifier.size(12.dp))
            Column (horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                MealCard(title = "아침", img = painterResource(id = R.drawable.breakfast_img))
                Spacer(modifier = Modifier.size(8.dp))
                MealCard(title = "점심", img = painterResource(id = R.drawable.breakfast_img))
                Spacer(modifier = Modifier.size(8.dp))
                MealCard(title = "저녁", img = painterResource(id = R.drawable.breakfast_img))

            }
            Spacer(modifier = Modifier.size(32.dp))
            PretendardText(text = "내 주변 친환경 마트", TypeScale = H4)
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
}

@Preview(showBackground = true)
@Composable
fun Screen_medicinePreview() {
    Screen_medicine()
}