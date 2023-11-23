package com.korzhueva.compose.experiments

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.korzhueva.compose.experiments.ui.theme.ComposeExperimentsTheme

@Composable
fun MainScreen() {
    ScreenBox()
}

@Composable
fun ScreenBox() {
    Row(
        modifier = Modifier.wrapContentHeight()
    ) {
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Test screen",
                modifier = Modifier.padding(10.dp)
            )
        }
        Column(
            modifier = Modifier,
        ) {
            Button(
                onClick = { /*TODO Open test screen*/ }) {
                Text(text = "Go")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    ComposeExperimentsTheme {
        MainScreen()
    }
}
