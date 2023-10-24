import javax.swing.JOptionPane

fun main() {
    Conexao.criarTabelas()
    val repositorio = FilmeRepositorio()
    repositorio.iniciar()

    while (true){
        val resposta: Int = JOptionPane.showInputDialog("O que deseja fazer? \n 1 - Adicionar Filme.\n" +
                "2 - Consultar Filme.\n" +
                "3 - Excluir Filme.\n" +
                "4 - Sair").toInt()
        if (resposta == 4){
            break
        }else if (resposta == 1){

            val novoFilme = Filme()

            novoFilme.nome = JOptionPane.showInputDialog("Qual é o nome do filme?")
            novoFilme.diretor = JOptionPane.showInputDialog("Qual é o nome do diretor do filme?")
            novoFilme.indicadoOscar = JOptionPane.showInputDialog("Foi indicado ao oscar? \n 1-sim \n 2-não").toBoolean()
            novoFilme.custoProducao = JOptionPane.showInputDialog( "Quanto foi o custo de produção?").toDouble()

            repositorio.adicionarFilme(novoFilme)

        }else if (resposta == 2){

            var ultimo = repositorio.buscarCodigo()
            var codigo = JOptionPane.showInputDialog("Insira um id entre 0 e $ultimo").toInt()

            if (codigo <= ultimo ){
                var filme = repositorio.consultarFilme(codigo)
            JOptionPane.showMessageDialog(null, "Filme com o id:${filme.id} "+
                    "Nome: ${filme.nome} \n "+
                    "Diretor: ${filme.diretor} \n " +
                    "Indicado ao Oscar: ${filme.indicadoOscar} \n "+
                    "Custo de produção: R$ ${filme.custoProducao} \n ")
            }
        }else{
            var ultimo = repositorio.buscarCodigo()

            var codigoFilmeExcluir = JOptionPane.showInputDialog("Insira o id de um filme entre 0 e $ultimo para excluir").toInt()

            var lalala = repositorio.atualizarFilmes(codigoFilmeExcluir)
        val mensagem = "Linhas afetadas $lalala filme excluido"
            JOptionPane.showMessageDialog(null, mensagem)

        }


    }
}