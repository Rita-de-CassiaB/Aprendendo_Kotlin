import javax.swing.JOptionPane

fun main() {
    val idade = JOptionPane.showInputDialog("Qual sua idade?").toInt()

    if (idade >= 16) {
        exibeMensagem("Você já pode votar")
    } else {
        exibeMensagem("Ainda não pode votar")
    }
}