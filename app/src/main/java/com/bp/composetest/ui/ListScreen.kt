package com.bp.composetest.ui

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bp.composetest.ui.theme.ComposeTestTheme

val stringList = listOf(
    "name",
    "family",
    "address",
    "number",
    "city",
    "country",
    "name",
    "family",
    "address",
    "number",
    "city",
    "country"
)

@Composable
fun ListScreen(
    nameList: List<String> = stringList
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        item {
            Text(
                text = "title",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        items(items = nameList) {
            MyItem(title = it)
        }
    }
}

@Composable
fun MyItem(
    context: Context = LocalContext.current,
    title: String = "",
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .clickable {
            Toast
                .makeText(context, title, Toast.LENGTH_SHORT)
                .show()
        }
        .padding(16.dp)
) {
    Text(modifier = modifier, text = title)
    MyDivider(thickness = 0.5.dp, startIndent = 16.dp)
}

@Composable
fun MyDivider(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colors.onSurface
        .copy(red = 0.75f, green = 0.15f, blue = 0.125f),
    thickness: Dp = 1.dp,
    startIndent: Dp = 0.dp
) {
    Divider(modifier, color, thickness, startIndent)
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ListScreenPreview() {
    ComposeTestTheme {
        ListScreen()
    }
}