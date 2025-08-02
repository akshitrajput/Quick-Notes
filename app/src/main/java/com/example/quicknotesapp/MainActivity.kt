package com.example.quicknotesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.quicknotesapp.Pages.MainPages.HomePage
import com.example.quicknotesapp.ui.theme.QuickNotesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuickNotesAppTheme {
                HomePage()
            }
        }
    }
}