package com.ProjetoAplicativos1.myapplication
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BookCatalogueUI() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Placeholder for book cover image
        Image(
            painter = painterResource(id = R.drawable.placeholder_image),
            contentDescription = "Book Cover Placeholder",
            modifier = Modifier.size(100.dp).padding(16.dp)
        )
        Text("Seja bem-vindo ao seu catálogo de livros!", color = Color.Black)
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = { /* TODO: Handle book registration */ },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp)
        ) {
            Text("Cadastrar Livro")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /* TODO: Handle view registered books */ },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp)
        ) {
            Text("Livros Cadastrados")
        }
    }
}
