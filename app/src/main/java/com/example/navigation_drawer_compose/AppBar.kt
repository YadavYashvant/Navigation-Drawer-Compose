package com.example.navigation_drawer_compose

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    onIconClick: () -> Unit
) {
    TopAppBar(
        title = {
            Text(text = "Drawer Compose")
        },
        Modifier
            .background(MaterialTheme.colorScheme.background),
        navigationIcon = {
            IconButton(onClick = onIconClick) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Toggle Drawer")
            }
        }
    )
}