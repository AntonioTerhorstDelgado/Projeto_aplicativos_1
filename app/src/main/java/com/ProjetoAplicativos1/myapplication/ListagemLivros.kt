package com.ProjetoAplicativos1.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun RegisteredBooksUI(books: List<Book>) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Livros Cadastrados", color = Color.Black, style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(books) { book ->
                BookItem(book)
            }
        }
    }
}

@Composable
fun BookItem(book: Book) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = 4.dp
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = book.coverImageId),
                contentDescription = "Book Cover",
                modifier = Modifier.size(60.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(book.name, color = Color.Black)
        }
    }
}

data class Book(
    val name: String,
    val coverImageId: Int
)

// Exemplo de uso:
@Composable
fun BookCatalogueScreen() {
    // Substitua com os IDs de recursos das imagens de capa dos livros
    val books = listOf(
        Book("Nome do livro 1", R.drawable./*id do livro escolhido*/),
        Book("Nome do livro 2", R.drawable./*id do livro escolhido*/),
        Book("Nome do livro 3", R.drawable./*id do livro escolhido*/),
        Book("Nome do livro 4", R.drawable./*id do livro escolhido*/)
    )
    RegisteredBooksUI(books)
}
