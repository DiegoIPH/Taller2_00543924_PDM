package com.example.taller2_00543924_pdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.taller2_00543924_pdm.Navigation.App
import com.example.taller2_00543924_pdm.ui.theme.Taller2_00543924_PDMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Taller2_00543924_PDMTheme {
                App()
            }
        }
    }
}
