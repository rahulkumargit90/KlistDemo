package com.example.klistdemo.list

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class KList {

    private var padding: Dp = 0.dp
    private var headerTitle: String? = null
    private var itemsList: List<Any> = emptyList()
    private var itemContent: @Composable (Any) -> Unit = {}

    fun padding(dp: Dp): KList {
        padding = dp
        return this
    }

    fun header(title: String): KList {
        headerTitle = title
        return this
    }

    fun <T> items(list: List<T>, content: @Composable (T) -> Unit): KList {
        itemsList = list as List<Any>
        itemContent = { item -> content(item as T) }
        return this
    }

    @Composable
    fun render() {
        LazyColumn(modifier = Modifier.padding(padding)) {
            headerTitle?.let {
                item {
                    Text(text = it)
                }
            }
            items(itemsList) { item ->
                itemContent(item)
            }
        }
    }

    companion object {
        val instance: KList
            get() = KList()
    }
}
