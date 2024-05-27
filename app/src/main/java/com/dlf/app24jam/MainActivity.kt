package com.dlf.app24jam

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dlf.app24jam.Component.BottomBar
import com.dlf.app24jam.Component.MainTopBar
import com.dlf.app24jam.Component.PretendardText
import com.dlf.app24jam.Screen.Health.Screen_medicine
import com.dlf.app24jam.Screen.Home.Screen_home
import com.dlf.app24jam.Screen.Mypage.Screen_mypage
import com.dlf.app24jam.ui.theme.App24JamTheme
import com.dlf.app24jam.ui.theme.Caption
import com.dlf.app24jam.ui.theme.gray200
import com.dlf.app24jam.ui.theme.gray500

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun MainScreen() {
    val currentScreen = remember { mutableStateOf<ScreenType>(ScreenType.Home) }
    Scaffold(
        topBar = {
            MainTopBar()
        },
        bottomBar = {
            BottomNavigationBar(currentScreen = currentScreen.value) { newScreen ->
                currentScreen.value = newScreen
            }
        },


    ) {
        Surface(modifier = Modifier
            .fillMaxSize()
            .padding(it)) {
            when (val screen = currentScreen.value) {
                is ScreenType.Home -> Screen_home()
                is ScreenType.Health -> Screen_medicine()
                is ScreenType.Chat -> Screen_home()
                is ScreenType.Heart -> Screen_home()
                is ScreenType.Profile -> Screen_mypage()
            }
        }
    }
}

@Composable
fun BottomNavigationBar(currentScreen: ScreenType, onItemSelected: (ScreenType) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp, 12.dp, 12.dp, 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        BottomBarItem(screen = ScreenType.Home, currentScreen = currentScreen, onItemSelected = onItemSelected)
        BottomBarItem(screen = ScreenType.Health, currentScreen = currentScreen, onItemSelected = onItemSelected)
        BottomBarItem(screen = ScreenType.Chat, currentScreen = currentScreen, onItemSelected = onItemSelected)
        BottomBarItem(screen = ScreenType.Heart, currentScreen = currentScreen, onItemSelected = onItemSelected)
        BottomBarItem(screen = ScreenType.Profile, currentScreen = currentScreen, onItemSelected = onItemSelected)
    }
}

@Composable
fun BottomBarItem(screen: ScreenType, currentScreen: ScreenType, onItemSelected: (ScreenType) -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.clickable(onClick = { onItemSelected(screen) })
    ) {
        Icon(
            painter = painterResource(id = screen.iconId),
            contentDescription = null,
            tint = if (currentScreen == screen) gray500 else gray200
        )
        PretendardText(text = screen.label, TypeScale = Caption, color = if (currentScreen == screen) gray500 else gray200)
    }
}

sealed class ScreenType(val label: String, val iconId: Int) {
    object Home : ScreenType("홈", R.drawable.ic_home)
    object Health : ScreenType("영양 관리", R.drawable.ic_health)
    object Chat : ScreenType("챗봇", R.drawable.ic_chat)
    object Heart : ScreenType("마음", R.drawable.ic_heart)
    object Profile : ScreenType("마이페이지", R.drawable.ic_person)
}
