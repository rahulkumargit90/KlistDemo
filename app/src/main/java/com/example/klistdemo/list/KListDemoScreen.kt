package com.example.klistdemo.list

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun KListDemoScreen() {
    val coins = listOf(
        Coin("Bitcoin", "$50,000"),
        Coin("Ethereum", "$4,000"),
        Coin("Litecoin", "$200")
    )
    KList.instance
        .padding(16.dp)
        .header("Top Gainers")
        .items(coins) {
            KListItem(it)
        }.render()
}


@Preview(showBackground = true)
@Composable
fun PreviewKListDemoScreen() {
    KListDemoScreen()
}
