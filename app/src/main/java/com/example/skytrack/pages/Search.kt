package com.example.skytrack.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.skytrack.components.Search_Card
import com.example.skytrack.ui.theme.Roboto

@Preview(showBackground = true)
@Composable
fun Search() {
    var buscar by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize().background(Color(0xFF01091C)).padding(20.dp)) {
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Text("SkyTrack", fontSize = 30.sp ,color = Color.White, fontFamily = Roboto, fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.height(20.dp))
        TextField(value = buscar, onValueChange = { buscar = it }, label = { Text("🔍 Buscar ciudad...", fontSize = 18.sp, color = Color.White) }, modifier = Modifier.fillMaxWidth(), colors = TextFieldDefaults.colors(
            unfocusedContainerColor = Color(0xFF020C38),
            focusedContainerColor = Color(0xFF020C38),

            ))
        Spacer(modifier = Modifier.height(20.dp))
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                Text("Resultados", color = Color(0xED8597D2))
                Spacer(modifier = Modifier.height(5.dp))
                Spacer(modifier = Modifier.height(10.dp))
                Search_Card("Ciudad de México", "Estado México", 22)
                Search_Card("Monterrey", "Nuevo León, México", 31)
                Search_Card("Tampico", "Tamaulipas, México", 28)
                Search_Card("Madrid", "España, UTC+1", 19)
                Text("Recientes", color = Color(0xED8597D2))
                Spacer(modifier = Modifier.height(10.dp))
                Search_Card("Guadalajara", "Jalisco, México", 25)
                Search_Card("Hermosillo", "Sonora, México", 28)
                Search_Card("Mexicali", "Baja California, México", 29)
            }
        }
    }
}