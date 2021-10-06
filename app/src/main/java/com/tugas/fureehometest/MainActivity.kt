package com.tugas.fureehometest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.tugas.fureehometest.ui.AppointmentScreen
import com.tugas.fureehometest.ui.theme.FureeHomeTestTheme

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FureeHomeTestTheme {
                AppointmentScreen()
            }
        }
    }
}
