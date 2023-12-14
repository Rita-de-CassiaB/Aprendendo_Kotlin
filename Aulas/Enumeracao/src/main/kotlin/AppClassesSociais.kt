import javax.swing.JOptionPane

fun main() {
    val rendaEstagiario = 2_200.0
    val rendaX= JOptionPane.showInputDialog("Qual é a sua renda").toDouble()
    try {
        val classeEstagiario = ClasseSocial.aPartirDaRenda(rendaEstagiario)
        println("A classe social de estagiário é ${classeEstagiario.descricao} ")
        val classeX = ClasseSocial.aPartirDaRenda(rendaX)
        println("A classe social de estagiário é ${classeX.descricao} ")
    }catch (excecao:Exception){
        println(excecao.message)
    }
}