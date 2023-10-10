import Filme.id
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

        if (resposta == 1){
            Filme.nome = JOptionPane.showInputDialog("Qual é o nome do filme?")
            Filme.diretor = JOptionPane.showInputDialog("Qual é o nome do diretor do filme?")
            Filme.indicadoOscar = JOptionPane.showInputDialog("Foi indicado ao oscar? \n 1-sim \n 2-não").toBoolean()
            Filme.custoProducao = JOptionPane.showInputDialog( "Quanto foi o custo de produção?").toDouble()

            repositorio.adicionarFilme(novoFilme = Filme)

        }else if (resposta == 2){

            var ultimo = repositorio.buscarCodigo()
            var codigo = ("Insira um id entre 0 e $ultimo").toInt()

            if (codigo <= ultimo ){
                repositorio.consultarFilme(codigo = id)
            JOptionPane.showMessageDialog(null, "Filme com o id:${id} "+
                    "Nome: ${Filme.nome}"+
                    "Diretor: ${Filme.diretor}" +
                    "Indicado ao Oscar: ${Filme.indicadoOscar}"+
                    "Custo de produção: R$ ${Filme.custoProducao}")
            }


        }



    }
}