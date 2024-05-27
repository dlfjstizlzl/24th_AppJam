package com.dlf.app24jam.Screen.Health

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dlf.app24jam.Component.PretendardText
import com.dlf.app24jam.ui.theme.Body1
import com.dlf.app24jam.ui.theme.Body4
import com.dlf.app24jam.ui.theme.Font
import com.dlf.app24jam.ui.theme.H4
import com.dlf.app24jam.ui.theme.blue50
import com.dlf.app24jam.ui.theme.blue500
import com.dlf.app24jam.ui.theme.gray100
import com.dlf.app24jam.ui.theme.gray200
import com.dlf.app24jam.ui.theme.gray400
import com.dlf.app24jam.ui.theme.gray50
import com.dlf.app24jam.ui.theme.gray500

@Composable
fun Record_Health(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 0.dp, 20.dp, 0.dp)
    ) {
        Text(text = "영양 정보를 기록해 주세요!", fontFamily = Font.EliceDXNeolii, fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.size(8.dp))
        PretendardText(text = "해당 문항에 솔직하게 체크해 주세요", TypeScale = Body4, color = gray200)
        Spacer(modifier = Modifier.size(35.dp))
        PretendardText(text = "이미지", TypeScale = Body4)
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .background(shape = RoundedCornerShape(16.dp), color = blue50),
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(imageVector = Icons.Default.Add, contentDescription = null, tint = blue500,
                modifier = Modifier.padding(12.dp, 18.dp, 12.dp, 18.dp))
            Spacer(modifier = Modifier.size(10.dp))
            PretendardText(text = "이미지를 업로드 해주세요", TypeScale = Body4, color = blue500)

        }
        Spacer(modifier = Modifier.size(24.dp))
        Divider(color = gray100, thickness = 1.dp)
        Spacer(modifier = Modifier.size(24.dp))
        PretendardText(text = "탄수화물을 얼마나 섭취했나요? *", TypeScale = H4)
        PretendardText(text = "쌀, 면, 빵, 구활작물, 과자 등", TypeScale = Body4, color = gray400)
        Spacer(modifier = Modifier.size(12.dp))
        Row {
            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = gray50),
                modifier = Modifier
                    .border(1.dp, gray100, RoundedCornerShape(16.dp))
            ) {
                PretendardText(text = "많이 ", TypeScale = Body4, color = gray500,)
            }
            Spacer(modifier = Modifier.size(8.dp))

            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = gray50),
                modifier = Modifier
                    .border(1.dp, gray100, RoundedCornerShape(16.dp))
            ) {
                PretendardText(text = "적당히 ", TypeScale = Body4, color = gray500,)
            }
            Spacer(modifier = Modifier.size(8.dp))

            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = gray50),
                modifier = Modifier
                    .border(1.dp, gray100, RoundedCornerShape(16.dp))
            ) {
                PretendardText(text = "적게 ", TypeScale = Body4, color = gray500,)
            }
        }

        Spacer(modifier = Modifier.size(24.dp))
        Divider(color = gray100, thickness = 1.dp)
        Spacer(modifier = Modifier.size(24.dp))
        PretendardText(text = "담백질을 얼마나 섭취했나요? *", TypeScale = H4)
        PretendardText(text = "닭고기, 소고기, 두부, 콩 등", TypeScale = Body4, color = gray400)
        Spacer(modifier = Modifier.size(12.dp))
        Row {
            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = gray50),
                modifier = Modifier
                    .border(1.dp, gray100, RoundedCornerShape(16.dp))
            ) {
                PretendardText(text = "많이 ", TypeScale = Body4, color = gray500,)
            }
            Spacer(modifier = Modifier.size(8.dp))

            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = gray50),
                modifier = Modifier
                    .border(1.dp, gray100, RoundedCornerShape(16.dp))
            ) {
                PretendardText(text = "적당히 ", TypeScale = Body4, color = gray500,)
            }
            Spacer(modifier = Modifier.size(8.dp))

            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = gray50),
                modifier = Modifier
                    .border(1.dp, gray100, RoundedCornerShape(16.dp))
            ) {
                PretendardText(text = "적게 ", TypeScale = Body4, color = gray500,)
            }
        }

        Spacer(modifier = Modifier.size(24.dp))
        Divider(color = gray100, thickness = 1.dp)
        Spacer(modifier = Modifier.size(24.dp))
        PretendardText(text = "채소 얼마나 섭취했나요? *", TypeScale = H4)
        PretendardText(text = "양배추, 무, 콩나물, 버섯 등 ", TypeScale = Body4, color = gray400)
        Spacer(modifier = Modifier.size(12.dp))
        Row {
            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = gray50),
                modifier = Modifier
                    .border(1.dp, gray100, RoundedCornerShape(16.dp))
            ) {
                PretendardText(text = "많이 ", TypeScale = Body4, color = gray500,)
            }
            Spacer(modifier = Modifier.size(8.dp))

            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = gray50),
                modifier = Modifier
                    .border(1.dp, gray100, RoundedCornerShape(16.dp))
            ) {
                PretendardText(text = "적당히 ", TypeScale = Body4, color = gray500,)
            }
            Spacer(modifier = Modifier.size(8.dp))

            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = gray50),
                modifier = Modifier
                    .border(1.dp, gray100, RoundedCornerShape(16.dp))
            ) {
                PretendardText(text = "적게 ", TypeScale = Body4, color = gray500,)
            }
        }
        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = gray100),
            modifier = Modifier.fillMaxWidth()

        ) {
            PretendardText(text = "등록하기", TypeScale = Body1, color = gray500)

        }
    }

}

@Composable
@Preview(showBackground = true)
fun Record_Health_preview(){
    Record_Health()
}
