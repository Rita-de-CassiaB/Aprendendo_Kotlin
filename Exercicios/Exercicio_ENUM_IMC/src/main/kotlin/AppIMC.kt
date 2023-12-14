import javax.swing.JOptionPane

fun main() {
    val peso = JOptionPane.showInputDialog("Insira seu peso").toDouble()
    val altura = JOptionPane.showInputDialog("Insira sua altura").toDouble()
try {
    val calculo = peso/(altura*altura)
    val resultadoIMC = CalculoIMC.aPartirDoIMC(calculo)
    println("Seu IMC é ${resultadoIMC?.descricao} e a ação recomendada é ${resultadoIMC?.acao}")

} catch (excecao:ImcInvalidoException){
    JOptionPane.showMessageDialog(null, "O valor de Imc é invalido")
}

}