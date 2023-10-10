import javax.swing.JOptionPane

fun main() {
    // Exercício 2 -- Linha de Onibus
    val linha: String = JOptionPane.showInputDialog("Insira o nome de uma linha").toString()
    val matempo: Int = JOptionPane.showInputDialog("Insira o maior tempo gasto em sua volta em minutos").toInt()
    val metempo: Int = JOptionPane.showInputDialog("Insira o menor tempo gasto em sua volta em minutos").toInt()
    val media: Int = (matempo + metempo) / 2

    exibirMensagem("A linha ${linha} leva em média ${media} minutos/volta")
}