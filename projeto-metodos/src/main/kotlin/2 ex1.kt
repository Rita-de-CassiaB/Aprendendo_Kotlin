import javax.swing.JOptionPane

fun main() {
    //Exercício 1 -- Bairro e Nome
    val nome: String = JOptionPane.showInputDialog("Insira seu nome")
    val bairro: String = JOptionPane.showInputDialog("Insira seu bairro")

    exibirMensagem("Você se chama ${nome} e mora no bairro ${bairro}")


}
