package com.example.energyapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.energyapp.R

@Composable
fun CadastroScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0B1202))
            .padding(top = 90.dp)
    ) {
        Column(
            modifier = Modifier
                .background(
                    Color(0xFFF5F5E6),
                    shape = RoundedCornerShape(topStart = 90.dp)
                )
                .fillMaxSize()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Image(
                painter = painterResource(id = R.drawable.placa_solar),
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Cadastre-se",
                    fontSize = 42.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                TextField(
                    value = "",
                    onValueChange = {},
                    placeholder = { Text("Nome Completo") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.baseline_person_outline_24
                            ),
                            contentDescription = "Logo de pessoa"
                        )
                    },
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier.width(350.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent, // Fundo transparente ao focar
                        unfocusedContainerColor = Color.Transparent, // Fundo transparente quando desfocado
                        disabledContainerColor = Color.Transparent, // Fundo transparente quando desativado
                        focusedIndicatorColor = Color(0xFF4CAF50), // Para remover a linha de foco
                        unfocusedIndicatorColor = Color(0xFF4CAF50), // Para remover a linha quando desfocado
                        disabledIndicatorColor = Color(0xFF4CAF50), // Para remover a linha quando desativado
                    )

                )
                Spacer(modifier = Modifier.height(10.dp))
                TextField(
                    value = "",
                    onValueChange = {},
                    placeholder = { Text("CPF") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.outline_feed_24
                            ),
                            contentDescription = "Logo de documento"
                        )
                    },
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier.width(350.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent, // Fundo transparente ao focar
                        unfocusedContainerColor = Color.Transparent, // Fundo transparente quando desfocado
                        disabledContainerColor = Color.Transparent, // Fundo transparente quando desativado
                        focusedIndicatorColor = Color(0xFF4CAF50), // Para remover a linha de foco
                        unfocusedIndicatorColor = Color(0xFF4CAF50), // Para remover a linha quando desfocado
                        disabledIndicatorColor = Color(0xFF4CAF50), // Para remover a linha quando desativado
                    )

                )
                Spacer(modifier = Modifier.height(10.dp))
                TextField(
                    value = "",
                    onValueChange = {},
                    placeholder = { Text("E-mail") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.baseline_mail_outline_24
                            ),
                            contentDescription = "Logo de email"
                        )
                    },
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier.width(350.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent, // Fundo transparente ao focar
                        unfocusedContainerColor = Color.Transparent, // Fundo transparente quando desfocado
                        disabledContainerColor = Color.Transparent, // Fundo transparente quando desativado
                        focusedIndicatorColor = Color(0xFF4CAF50), // Para remover a linha de foco
                        unfocusedIndicatorColor = Color(0xFF4CAF50), // Para remover a linha quando desfocado
                        disabledIndicatorColor = Color(0xFF4CAF50), // Para remover a linha quando desativado
                    )

                )
                Spacer(modifier = Modifier.height(10.dp))

                TextField(
                    value = "",
                    onValueChange = {},
                    placeholder = { Text("Criar Senha") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.baseline_lock_outline_24
                            ),
                            contentDescription = "logo de senha"
                        )
                    },
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier.width(350.dp),
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
            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Confirmar senha") },
                leadingIcon = {
                    Icon(
                        painter = painterResource(
                            id = R.drawable.baseline_lock_reset_24
                        ),
                        contentDescription = "Logo de confirmar senha"
                    )
                },
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier.width(350.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent, // Fundo transparente ao focar
                    unfocusedContainerColor = Color.Transparent, // Fundo transparente quando desfocado
                    disabledContainerColor = Color.Transparent, // Fundo transparente quando desativado
                    focusedIndicatorColor = Color(0xFF4CAF50), // Para remover a linha de foco
                    unfocusedIndicatorColor = Color(0xFF4CAF50), // Para remover a linha quando desfocado
                    disabledIndicatorColor = Color(0xFF4CAF50), // Para remover a linha quando desativado
                )
            )

            Spacer(modifier = Modifier.height(60.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { /* Ação de login */ },
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .padding(16.dp)
                        .size(width = 250.dp, height = 50.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF569e1e)),
                ) {
                    Text(
                        text = "Cadastrar",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Possuo cadastro",
                    color = Color(0xFF4CAF50),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline,
                    modifier = Modifier
                        .clickable {
                            navController.navigate("login_screen")
                        }
                        .padding(start = 3.dp),
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}