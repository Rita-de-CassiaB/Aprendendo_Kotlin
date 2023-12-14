import com.github.britooo.looca.api.core.Looca
import com.github.britooo.looca.api.group.discos.DiscoGrupo
import com.github.britooo.looca.api.group.janelas.Janela
import com.github.britooo.looca.api.group.memoria.Memoria
import com.github.britooo.looca.api.group.processador.Processador
import com.github.britooo.looca.api.group.processos.ProcessoGrupo
import com.github.britooo.looca.api.group.rede.Rede
import com.github.britooo.looca.api.group.servicos.ServicoGrupo
import com.github.britooo.looca.api.group.sistema.Sistema

fun main() {
    //Cria uma instância da classe `Looca`.
    val looca: Looca = Looca()

    //Declara duas variáveis do tipo `Janela` e `Rede`.
    val janela: Janela
    val rede: Rede

    //Obtém o objeto `dadosJanelas` da classe `Looca`.
    val dadosJanelas = looca.grupoDeJanelas

    //Obtém uma lista de janelas do objeto `dadosJanelas`.
    val listaJanelas = dadosJanelas.janelas

    //Obtém a quantidade de janelas na lista.
    val quantidadeJanelas = listaJanelas.size

    // Cria uma lista de nomes de janelas a partir da lista de janelas.
    // map -> é uma função que transforma uma lista em outra lista e a { it.getTitulo() } é uma função que é usada para transformar cada janela em seu nome.
    val nomesJanelas = listaJanelas.map { it.getTitulo() }

    //Imprime a quantidade de janelas e o nome de cada uma delas na saída do console.
    println("Quantidade de janelas: $quantidadeJanelas")
    println("Nomes das janelas: $nomesJanelas")

    //Obtém uma lista de interfaces de rede do objeto `rede`.
    val redes = looca.rede.grupoDeInterfaces.interfaces
    println(redes)
    // Declara duas variáveis do tipo `MutableList` para armazenar os bytes recebidos e enviados.
    // Long -> é o tipo de dados nativo do Kotlin para representar valores inteiros de 64 bits.
    val listaBytesRecebidos = mutableListOf<Long>()
    val listaBytesEnviados = mutableListOf<Long>()

    //Percorre a lista de interfaces de rede e adiciona os bytes recebidos e enviados a cada lista.
    /*  for (rede in redes) {
        listaBytesRecebidos.add(rede.getBytesRecebidos())
        listaBytesEnviados.add(rede.getBytesEnviados())
    }

    // Imprime os bytes recebidos e enviados na saída do console.

    println("Bytes recebidos: $listaBytesRecebidos bytes de ${redes}")
    println("Bytes enviados: $listaBytesEnviados bytes de ${redes}")

 val sistema = looca.sistema
   val sistema1: Sistema
//    val memoria: Memoria
//    val processador: Processador
//    val temperatura: Temperatura
//    val grupoDeDiscos: DiscoGrupo
//    val grupoDeServicos: ServicoGrupo
    // sistema.getPermissao();
    // sistema.getFabricante();
    // sistema.getArquitetura();
    // sistema.getInicializado();
    // sistema.getSistemaOperacional();
    // System.out.println(sistema);

    // val sistema = looca.sistema

     */
    val processos = looca.grupoDeProcessos

    var listaProcessos = processos.processos
    for (p in listaProcessos) {
        println("""
           nome ${p.nome}
           pid ${p.pid}
           uso ${p.usoCpu}
           memoria ${p.usoMemoria}
           bytes ${p.bytesUtilizados}
           memoria virtual ${p.memoriaVirtualUtilizada}
       """.trimIndent())
    }
}