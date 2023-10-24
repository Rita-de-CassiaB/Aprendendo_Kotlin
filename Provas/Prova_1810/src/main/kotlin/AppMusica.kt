import java.time.LocalDate
import java.time.format.DateTimeFormatter
import javax.swing.JOptionPane

fun main() {

    Conexao.criarTabelas()
    val repositorio = RepositorioMusicas()
    repositorio.iniciar()

    while (true){
        val inicio = JOptionPane.showInputDialog(null,"Escolha uma das opções:\n 1- Adicionar nova música\n 2- Buscar por id\n 3- Excluir música por id\n 4- Sair").toInt()

        when (inicio) {
            1 -> {
                val novaMusica = Musica()
                val dataAtual = LocalDate.now()

                JOptionPane.showMessageDialog(null, "Insira as informações da Musica")

                novaMusica.titulo = JOptionPane.showInputDialog("Titulo:")
                novaMusica.artista = JOptionPane.showInputDialog("Artista:")
                novaMusica.dataCriacao = dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))

                repositorio.adicionarMusica(novaMusica)
            }
            2 -> {
                val primeiro = repositorio.buscarIdPri()
                val ultimo = repositorio.buscarIdUlt()

            val id = JOptionPane.showInputDialog(null, "Insira um id entre o $primeiro e $ultimo").toInt()

                if (id >= primeiro && id <= ultimo){
                    var musica = repositorio.consultarMusica(id)
                    JOptionPane.showMessageDialog(null, "Musica com o Id: $id\n Titulo: ${musica.titulo}\n Artista: ${musica.artista}\n Data de criação: ${musica.dataCriacao}")
                } else{
                    JOptionPane.showMessageDialog(null, "Insira um id válido (entre $primeiro e $ultimo)")
                }

            }
            3 -> {
                val primeiro = repositorio.buscarIdPri()
                val ultimo = repositorio.buscarIdUlt()

                val id = JOptionPane.showInputDialog(null, "Insira o id de uma música para excluir (entre $primeiro e $ultimo)").toInt()

                var excluir = repositorio.excluirId(id)

                val mensagem = JOptionPane.showMessageDialog(null, "Linhas afetadas $excluir, a musica foi excluída ")

            }
            4 -> {
                JOptionPane.showMessageDialog(null, "Parabéns, você saiu!\nVolte Sempre")
                break
            }
            else -> {
                JOptionPane.showMessageDialog(null, "Insira uma alternativa válida")
            }
        }
    }
}