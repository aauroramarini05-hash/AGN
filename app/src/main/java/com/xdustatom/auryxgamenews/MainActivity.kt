package com.xdustatom.auryxgamenews

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier.padding(32.dp),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text("Auryx Game News", style = MaterialTheme.typography.headlineLarge)
                        Spacer(modifier = Modifier.height(12.dp))
                        Text("RSS Gaming News – TV Edition")
                    }
                }
            }
        }
    }
}