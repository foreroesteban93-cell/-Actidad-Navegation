
package com.sena.first_project.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Azul = Color(0xFF2167E8)
private val Fondo = Color(0xFFF2F6FD)
private val TextoOscuro = Color(0xFF172B4D)

@Composable
fun Home(
    onirProducto: () -> Unit,
    onIrFavoritos: () -> Unit,
    onIrPerfil: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Fondo)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "MI APLICACIÓN",
            color = Azul,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "¡Hola!",
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold,
            color = TextoOscuro
        )

        Text(
            text = "¿Qué deseas hacer hoy?",
            fontSize = 16.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(32.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 4.dp
            )
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                BotonMenu("Ir a Productos", Azul, onirProducto)

                Spacer(modifier = Modifier.height(14.dp))

                BotonMenu(
                    "Ir a Favoritos",
                    Color(0xFF7256E8),
                    onIrFavoritos
                )

                Spacer(modifier = Modifier.height(14.dp))

                BotonMenu(
                    "Ir a Perfil",
                    Color(0xFF159E91),
                    onIrPerfil
                )
            }
        }
    }
}

@Composable
private fun BotonMenu(
    texto: String,
    color: Color,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = color
        )
    ) {
        Text(
            text = texto,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}
