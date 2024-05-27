package com.dlf.app24jam.Component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Badge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dlf.app24jam.R
import com.dlf.app24jam.ui.theme.Caption
import com.dlf.app24jam.ui.theme.Font
import com.dlf.app24jam.ui.theme.blue500
import com.dlf.app24jam.ui.theme.blue600
import com.dlf.app24jam.ui.theme.gray200
import com.dlf.app24jam.ui.theme.gray800

@Composable
fun RegisterTopbar() {

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(){
    Row (
        modifier = Modifier.fillMaxWidth().padding(20.dp, 15.dp, 20.dp, 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ){
        Text(text = "이주영" + "님!", fontFamily = Font.EliceDXNeolii, fontSize = 16.sp)
        Box(
            contentAlignment = Alignment.TopEnd,
        )
        {
            Icon(painter = painterResource(id = R.drawable.ic_ring), contentDescription = null, tint = gray800)
            Badge(
                containerColor = blue500,
                contentColor = Color.White,
                modifier = Modifier
                    .padding(0.dp, 0.dp, 0.dp, 0.dp)
                    .clip(MaterialTheme.shapes.small)
                    .size(9.dp),
            ){
                Text(text = "1", fontSize = 5.sp, color = Color.White, fontFamily = Font.EliceDXNeolii, modifier = Modifier)
                
            }

        }
    }
}
@Preview
@Composable
fun PreviewTopBar(){
    MainTopBar()
}