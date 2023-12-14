class Autor {
    var nome: String = ""
    var idade: Int = 0
    val livros = mutableListOf<Livro>()

    fun NovoLivro(livro: Livro) {
        livros.add(livro)
    }

    fun descCarreira(livro: Livro, autor: Autor): String {
        val resposta = """
            Título do livro: ${livro.titulo} 
            Ano: ${livro.anoPublicacao}
            Nome do autor: ${autor.nome}
        """.trimIndent()

        return resposta
    }

}