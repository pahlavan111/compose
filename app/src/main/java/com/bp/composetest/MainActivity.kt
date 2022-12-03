package com.bp.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.bp.composetest.ui.OutlineTextFieldScreen
import com.bp.composetest.ui.theme.ComposeTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
//                MainScreen()
//                ColorBox(Modifier.fillMaxSize())
//                ListScreen()
                OutlineTextFieldScreen("name")

            }
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun DefaultPreview() {
    ComposeTestTheme {
//        MainScreen()
//        ColorBox()
//        ListScreen()
//        OutlineTextFieldScreen("name")
        OutlineTextFieldScreen("name")
    }
}