import java.time.LocalDate
import java.time.format.DateTimeFormatter
import javax.swing.JOptionPane

fun main() {
    Conexao.criarTabelas()
    val repositorio = RepositorioLivros()
    repositorio.iniciar()

    while (true){
    val busca = JOptionPane.showInputDialog(null,"O que deseja fazer?\n 1- Adicionar Novo Livro\n 2- Buscar por id ").toInt()

    if (busca ==1){
        val novoLivro = Livro()
        val hoje = LocalDate.now()

        JOptionPane.showMessageDialog(null,"Insira as informações do livro")

        novoLivro.titulo = JOptionPane.showInputDialog("Titulo:")
        novoLivro.autor = JOptionPane.showInputDialog("Autor:")
        novoLivro.dataCriacao = hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        repositorio.adicionarLivro(novoLivro)

    }else if (busca == 2){
        val ultimo = repositorio.buscarCodUl()
        val primeiro = repositorio.buscarCodPr()

        val codigo = JOptionPane.showInputDialog        (null,"Insira um código entre $primeiro e $ultimo Código:").toInt()

        if (codigo >= primeiro && codigo <= ultimo){
            var livro = repositorio.consultarLivro(codigo)
            JOptionPane.showMessageDialog(null,"Nome: ${livro.titulo} \n" +
                    "Autor: ${livro.autor}\n" +
                    "Data de criação: ${livro.dataCriacao} ")
        }



    }else   {
        JOptionPane.showMessageDialog(null, "Insira uma resposta válida")
    }



}}