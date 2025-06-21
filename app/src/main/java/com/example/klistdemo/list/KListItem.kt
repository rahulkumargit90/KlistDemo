package com.example.klistdemo.list


import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

data class Coin(val name: String, val price: String)

@Composable
fun KListItem(coin: Coin) {
    ListItem(
        headlineContent = { Text(coin.name) },
        supportingContent = { Text(coin.price) }
    )

}

