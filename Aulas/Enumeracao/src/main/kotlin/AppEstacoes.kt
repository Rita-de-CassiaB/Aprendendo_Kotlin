import java.lang.IllegalArgumentException
import javax.swing.JOptionPane
import javax.swing.JOptionPane.*

fun main (){
    println("Estações Disponíveis:")
    println(Estacao.entries)

    Estacao.values().forEach {
        println(it)
    }

    val menu = """
        Escolha uma das opções: 
        VERAO, OUTONO, INVERNO ou PRIMAVERA
    """.trimIndent()

    val escolha = showInputDialog(menu)

    try {
        val estacaoEscolhida:Estacao = Estacao.valueOf(escolha)
        showMessageDialog(null, "Você escolheu $estacaoEscolhida")
    } catch (excecao:IllegalArgumentException){
        showMessageDialog(null,"Estacao inválida ${excecao.message}")
    }

    showMessageDialog(null, "Aplicação executada com sucesso")

}