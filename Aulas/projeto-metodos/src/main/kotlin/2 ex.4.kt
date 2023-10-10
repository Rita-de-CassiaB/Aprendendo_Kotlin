import javax.swing.JOptionPane

fun main() {
    val altura: Float = JOptionPane.showInputDialog("Insira a sua altura").toFloat()

    if (altura >= 1.80) {
        exibirMensagem("Você pode jogar basquete")
    } else {
        exibirMensagem("Você não pode jogar basquete")
    }
}
