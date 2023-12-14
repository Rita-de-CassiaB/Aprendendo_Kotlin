import javax.swing.JOptionPane

fun main() {
    val autor1 = Autor()
    autor1.nome="Kat Falls"
    autor1.idade=68

    val livro1 = Livro()
    livro1.titulo = "Dark Life"
    livro1.anoPublicacao =2011

    val livro2 = Livro()
    livro2.titulo = "A vida é bela"
    livro2.anoPublicacao =2016

    val livro3 = Livro()
    livro3.titulo = "Melhor que um só dois"
    livro3.anoPublicacao =2020

    autor1.NovoLivro(livro1)
    autor1.NovoLivro(livro2)


    autor1.livros.forEach() {
        JOptionPane.showMessageDialog(null, autor1.descCarreira(it, autor1))
    }
}





