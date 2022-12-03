package com.bp.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.bp.composetest.ui.MainScreen
import com.bp.composetest.ui.theme.ComposeTestTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                MainScreen()
//                ColorBox(Modifier.fillMaxSize())
            }
        }
    }
}

//
//@Composable
//fun ColorBox(modifier: Modifier = Modifier) {
//
//    var color = remember {
//        mutableStateOf(value = Color.Yellow)
//    }
//
//    Box(modifier = modifier
//        .background(color.value)
//        .clickable {
//            color.value =
//                Color(
//                    red = Random.nextFloat(),
//                    green = Random.nextFloat(),
//                    blue = Random.nextFloat()
//                )
//
//        }) {
//    }
//}
//
//
//@Composable
//@Preview(showSystemUi = true, showBackground = true)
//fun DefaultPreviewMain() {
//    ComposeTestTheme {
//        ColorBox()
//    }
//}