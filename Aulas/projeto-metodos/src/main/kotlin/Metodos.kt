import javax.swing.JOptionPane

fun main() {
    val n: String = JOptionPane.showInputDialog("Insira seu nome").toString()
    val n1: Int = JOptionPane.showInputDialog("Digite o primeiro número").toInt()
    val n2 = JOptionPane.showInputDialog("Digite o segundo número").toInt()

    exibeMensagem( "Olá ${abertura(n)}")
    exibeMensagem( "A subtração dos dois números é: ${subtrair(n1,n2)}")
    exibeMensagem("A soma dos dois números é: ${somar(n1,n2)}")

    exibeMensagem( "A divisão dos dois números é: ${divisao(n1,n2)}")
    exibeMensagem("A multiplicação dos dois números é: ${multiplicar(n1,n2)}")
}
fun exibeMensagem(frase:String) {
    JOptionPane.showMessageDialog(null, frase)
}

 fun abertura(n: String):String {
   return n
}

fun somar(n1: Int, n2: Int):Int {
    return n1 + n2
}

fun subtrair(n1:Int, n2:Int):Int {
    return n1 - n2
}

fun divisao(n1: Int, n2: Int):Int {
    return n1 / n2
}

fun multiplicar(n1: Int, n2: Int):Int {
    return n1 * n2
}

