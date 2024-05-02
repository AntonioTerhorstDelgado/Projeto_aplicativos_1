package com.ProjetoAplicativos1.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun BookRegistrationForm() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Cadastro de Livro", style = MaterialTheme.typography.h5)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Nome do livro") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Escritor") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Editora") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Data de lançamento") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Gênero") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /* TODO: Handle the register action */ },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Cadastrar")
        }
    }
}
