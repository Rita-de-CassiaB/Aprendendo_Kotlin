import javax.swing.JOptionPane

fun main() {

    val produto1 = Produto()

     produto1.nome = JOptionPane.showInputDialog("Insira o nome do produto").toString()

     produto1.preco = JOptionPane.showInputDialog("Insira o preco do produto").toDouble()

     produto1.brinde = JOptionPane.showInputDialog("É brinde?\n 1 - É brinde\n  2 - Não é brinde").toBoolean()

    JOptionPane.showMessageDialog(null,"O produto ${produto1.nome} custa R$${produto1.preco}")
}