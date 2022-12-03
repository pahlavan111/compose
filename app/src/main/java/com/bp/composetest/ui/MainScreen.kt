package com.bp.composetest.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideIn
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bp.composetest.ui.theme.ComposeTestTheme

@Composable
fun MainScreen() {
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {

        var message by rememberSaveable() {
            mutableStateOf("Android")
        }

        var isMessageVisible by rememberSaveable {
            mutableStateOf(true)
        }

        AnimatedVisibility(visible = isMessageVisible,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            Greeting(message)
        }
//        if (isMessageVisible)
//            Greeting(message)

//        Spacer(modifier = Modifier.height(32.dp))

//        Button(onClick = {
//            message = "Behrooz"
//            Toast.makeText(context, "هیییییی من و فشار دادی ......", Toast.LENGTH_SHORT).show()
//        }, modifier = Modifier.wrapContentWidth()) {
//            Text(text = "press me...")
//        }

        Spacer(modifier = Modifier.height(32.dp))


        Button(onClick = {
            isMessageVisible = !isMessageVisible
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = if (isMessageVisible) "hide message" else "show message")
        }

        Spacer(modifier = Modifier.height(32.dp))
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun MainScreenPreview() {
    ComposeTestTheme {
        MainScreen()
    }
}