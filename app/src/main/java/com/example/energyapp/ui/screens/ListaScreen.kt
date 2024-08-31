package com.example.energyapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.energyapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListaScreen(navController: NavController) {
    var qtdBusca = 9
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0B1202))
            .padding(top = 30.dp)
    ) {
        Column(
            modifier = Modifier
                .background(
                    Color(0xFFF5F5E6),
                    shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
                )
                .fillMaxSize()
                .padding(top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, start = 12.dp, end = 12.dp)
            ) {
                // Campo de Pesquisa
                TextField(
                    value = "",
                    onValueChange = {},
                    placeholder = { Text("Buscar Distribuidora") },
                    trailingIcon = {
//                        Icon(
//                            painter = painterResource(
//                                id = R.drawable.outline_search_24
//                            ),
//                            contentDescription = "Lupa para Buscar"
//                        )
                    },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent, // Fundo transparente ao focar
                        unfocusedContainerColor = Color.Transparent, // Fundo transparente quando desfocado
                        disabledContainerColor = Color.Transparent, // Fundo transparente quando desativado
                        focusedIndicatorColor = Color(0xFF4CAF50), // Para remover a linha de foco
                        unfocusedIndicatorColor = Color(0xFF4CAF50), // Para remover a linha quando desfocado
                        disabledIndicatorColor = Color(0xFF4CAF50), // Para remover a linha quando desativado
                    )
                )
            }

            Row(
                modifier = Modifier
                    .padding(top = 7.dp)
            ) {
                Row {
                    Text(
                        text = "Filtrar",
                        color = Color(0xFF4CAF50),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        textDecoration = TextDecoration.Underline,
                        modifier = Modifier
                            .clickable {}
                            .padding(start = 24.dp)
                    )
//                    Icon(
//                        painter = painterResource(id = R.drawable.outline_filter_alt_24),
//                        contentDescription = "Filtrar",
//                        modifier = Modifier
//                            .padding(start = 4.dp)
//                            .size(24.dp),
//                        tint = Color(0xFF4CAF50),
//                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 12.dp, bottom = 18.dp),
                    horizontalArrangement = Arrangement.End

                ) {
                    Text(text = "Resultado da busca: ")
                    Text(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        text = "${qtdBusca}"
                    )
                }
            }

            // Área de rolagem para os cards
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 70.dp) // Espaço suficiente para o botão
            ) {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp)
                ) {
                    items(9) {
                        Card(
                            modifier = Modifier
                                //.offset(y = (-30).dp)
                                .fillMaxWidth()
                                .height(120.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(0xfff9f6f6)),
                            elevation = CardDefaults.cardElevation(20.dp)
                        ) {
                            // Conteúdo do Card
                        }
                        HorizontalDivider(
                            modifier = Modifier.padding(vertical = 8.dp),
                            thickness = 1.dp,
                            color = Color.Gray
                        )
                    }
                }
            }
        }
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 18.dp)
        ) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .size(width = 250.dp, height = 50.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF569e1e)),
            ) {
                Text(
                    text = "Voltar",
                    color = Color.White,
                    fontSize = 20.sp
                )
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ListaScreenPreview() {
//    AppSmartCityFIAPTheme {
    //ListaScreen()
//    }
}