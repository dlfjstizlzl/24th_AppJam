package com.dlf.app24jam.Component

import android.graphics.ColorFilter
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dlf.app24jam.R
import com.dlf.app24jam.ui.theme.Caption
import com.dlf.app24jam.ui.theme.Font
import com.dlf.app24jam.ui.theme.gray100
import com.dlf.app24jam.ui.theme.gray200
import javax.annotation.meta.When
@Composable
fun BottomBar(){
    Row (
        modifier = Modifier.fillMaxWidth().padding(0.dp,12.dp,0.dp,12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f).clickable(onClick = {})
        ){
            Icon(painter = painterResource(id = R.drawable.ic_home), contentDescription = null, tint = gray200)
            PretendardText(text = "홈", TypeScale = Caption)

        }
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f)
        ){
            Icon(painter = painterResource(id = R.drawable.ic_health), contentDescription = null, tint = gray200)
            PretendardText(text = "영양 관리", TypeScale = Caption)
        }
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f)
        ){
            Icon(painter = painterResource(id = R.drawable.ic_home), contentDescription = null, Modifier.alpha(0f))
            PretendardText(text = "챗봇", TypeScale = Caption)
        }
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f)
        ){
            Icon(painter = painterResource(id = R.drawable.ic_heart), contentDescription = null, tint = gray200)
            PretendardText(text = "마음", TypeScale = Caption)
        }
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f)
        ){
            Icon(imageVector = Icons.Default.Person, contentDescription = null, tint = gray200)
            PretendardText(text = "마이페이지", TypeScale = Caption)
        }
    }
}
@Composable
fun changeContent(number : Int){
when(number){
    1 -> {
    }
}

}
@Composable
@Preview(showBackground = true)
fun Preview(){
    BottomBar()
}