package com.bp.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bp.composetest.ui.ColorBox
import com.bp.composetest.ui.theme.ComposeTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
//                MainScreen()
                ColorBox(Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun DefaultPreviewMain() {
    ComposeTestTheme {
//        MainScreen()
        ColorBox()
    }
}