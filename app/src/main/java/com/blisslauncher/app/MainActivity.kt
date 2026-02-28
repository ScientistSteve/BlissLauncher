package com.blisslauncher.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.dynamicColor;
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost;
import androidx.navigation.compose.composable;
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme { // Use Material 3 theming
                Surface { // Background Surface
                    MainScreen() // Start from MainScreen function
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController: NavHostController = rememberNavController()
    // Navigation scaffold placeholder
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme { 
        MainScreen() // Preview of the MainScreen
    }
}

@Composable
fun MyApplicationTheme(content: @Composable () -> Unit) {
    MaterialTheme( // Apply Material 3
        colorScheme = dynamicColor(), // Dynamic colors support
        content = content
    )
}