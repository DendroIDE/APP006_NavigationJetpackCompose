package com.dendroide.navigationguide

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.dendroide.navigationguide.core.navigation.Detail
import com.dendroide.navigationguide.core.navigation.Settings
import com.dendroide.navigationguide.core.navigation.SettingsInfo

@Composable
fun DetailScreen(name: String, navigateToSettings:(SettingsInfo) -> Unit, navigateBack: () ->  Unit){
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "DETAIL SCREEN $name", fontSize = 25.sp)
        Spacer(modifier = Modifier.weight(1f))
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = {
            val settingsInfo = SettingsInfo(
                name = "DendroIDE Code",
                id = 1,
                darkMode = true,
                subscribe = false
            )
            navigateToSettings(settingsInfo)
        }) {
            Text(text = "Navegar a ajustes")
        }
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navigateBack() }) {
            Text(text = "Log Out")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}
