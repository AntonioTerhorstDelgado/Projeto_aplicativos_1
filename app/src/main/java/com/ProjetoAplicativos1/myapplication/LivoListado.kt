package com.ProjetoAplicativos1.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun BookDetailsUI() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Placeholder for book cover image
        Image(
            painter = painterResource(id = R.drawable.book_cover_placeholder),
            contentDescription = "Cover of 'O LIVRO DA PSICOLOGIA'",
            modifier = Modifier.size(150.dp).padding(16.dp)
        )
        Text("Nome do Livro: O LIVRO DA PSICOLOGIA", color = Color.Black)
        Spacer(modifier = Modifier.height(8.dp))
        Text("Escrito por Fulano", color = Color.Black)
        Spacer(modifier = Modifier.height(8.dp))
        Text("Publicado por editora Ciclana", color = Color.Black)
        Spacer(modifier = Modifier.height(8.dp))
        Text("Gênero: Tal", color = Color.Black)
        Spacer(modifier = Modifier.height(8.dp))
        Text("Data de Lançamento: 00/00/00", color = Color.Black)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut laoreet, lacus in dictum vulputate...",
            color = Color.Black
        )
    }
}

// Substitua 'R.drawable.book_cover_placeholder' pelo ID da imagem da capa do livro do nosso projeto.
