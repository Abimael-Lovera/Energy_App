package com.example.energyapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.energyapp.R

@Composable
fun LoginScreen( navController: NavHostController) {
//    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//        Text(text = "Login Screen")
//    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0B1202))
            .padding(top = 90.dp)
    ) {
        Column (modifier = Modifier
            .background(
                Color(0xFFF5F5E6),
                shape = RoundedCornerShape(topEnd = 90.dp)
            )
            .fillMaxSize()
            .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Image(
                painter = painterResource(id = R.drawable.placa_solar),
                contentDescription = "",
                modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Login",
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Sign in to continue",
                    fontSize = 14.sp,
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
                    placeholder = { Text("Digite seu E-mail") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.baseline_mail_outline_24
                            ),
                            contentDescription = ""
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
                    placeholder = { Text("Digite sua Senha") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(
                                id = R.drawable.baseline_lock_outline_24
                            ),
                            contentDescription = ""
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
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp),
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = "Esqueceu a senha?",
                    color = Color(0xFF4CAF50),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline,
                    modifier = Modifier.clickable {},

                    )
            }
            Spacer(modifier = Modifier.height(20.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .padding(16.dp)
                        .size(width = 250.dp, height = 50.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF569e1e)),
                ) {
                    Text(
                        text = "Login",
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
                Row {
                    Text(
                        text = "Não tenho conta!",
                        color = Color(0xFF4CAF50),
                        fontSize = 16.sp,
                    )
                    Text(
                        text = "Cadastrar",
                        color = Color(0xFF4CAF50),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        textDecoration = TextDecoration.Underline,
                        modifier = Modifier
                            .clickable {
                                navController.navigate("cadastro_screen")
                            }
                            .padding(start = 3.dp),
                    )

                }

            }
            Spacer(modifier = Modifier.height(5.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "OU",
                    color = Color(0xFF4CAF50),
                    fontSize = 16.sp,
                )
                Divider(
                    color = Color(0xFF4CAF50),
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 110.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = { /* TODO: Ação para login com Gmail */ },
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.gmail),
                            contentDescription = "Login com Gmail",
                            contentScale = ContentScale.Crop, // Faz a imagem preencher todo o botão
                            modifier = Modifier.fillMaxSize() // A imagem ocupa todo o espaço disponível do botão
                        )
                    }
                    Button(
                        onClick = { /* TODO: Ação para login com Facebook */ },
                        modifier = Modifier
                            .size(60.dp) // Define o tamanho do botão
                            .clip(CircleShape), // Faz o botão ter uma forma circular
                        contentPadding = PaddingValues(0.dp), // Remove o padding para maximizar o espaço da imagem
                        colors = ButtonDefaults.buttonColors(Color(0xFFFFFFFF))
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.facebook), // Use o recurso de imagem do Facebook
                            contentDescription = "Login com Facebook",
                            contentScale = ContentScale.Crop, // Faz a imagem preencher todo o botão, cortando se necessário
                            modifier = Modifier.fillMaxSize() // A imagem ocupa todo o espaço disponível do botão
                        )
                    }
                }
            }
        }
    }
}