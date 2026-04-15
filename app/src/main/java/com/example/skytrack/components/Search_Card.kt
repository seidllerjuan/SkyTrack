package com.example.skytrack.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.skytrack.ui.theme.Roboto

@Composable
fun Search_Card (ciudad : String, estado : String, temperatura : Int) {
    Row(modifier = Modifier.fillMaxWidth().border(0.5.dp, Color(0xE42F343D), shape = RoundedCornerShape(20.dp)).background(Color(
        0x92020C38
    )
    ).padding(20.dp), horizontalArrangement = Arrangement.SpaceBetween) {
        Column() {
            Text("${ciudad}", fontSize = 20.sp, color = Color.White, fontFamily = Roboto, fontWeight = FontWeight.Medium)
            Spacer(modifier = Modifier.height(5.dp))
            Text("${estado}", color = Color(0xED8597D2), fontSize = 15.sp, fontFamily = Roboto, fontWeight = FontWeight.Normal)
        }
        Column() {
            Spacer(modifier = Modifier.height(10.dp))
            Text("${temperatura}°", color = Color(0xED6CA6FF), fontSize = 30.sp, fontFamily = Roboto, fontWeight = FontWeight.Bold)
        }
    }
    Spacer(modifier = Modifier.height(15.dp))
}
