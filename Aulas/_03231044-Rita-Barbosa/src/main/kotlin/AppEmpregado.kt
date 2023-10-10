import javax.swing.JOptionPane

fun main() {
val empregado1 = Empregado()

    empregado1.nome = JOptionPane.showInputDialog("Insira o nome do usuário")
    empregado1.cargo = JOptionPane.showInputDialog("Insira o cargo do usuário")
    empregado1.salario = JOptionPane.showInputDialog("Insira o salário do usuário").toDouble()

    JOptionPane.showMessageDialog(null, "Nome:${empregado1.nome}\n"+"Cargo: ${empregado1.cargo}\n" +
            "Salário: ${empregado1.salario}")

    while (empregado1.opcao != 4) {
    empregado1.opcao = JOptionPane.showInputDialog("Escolha uma das opções:\r\n"+
            "Opção 1 Aumentar Cargo\r\n" +
            "Opção 2 Reajustar Salario\r\n" +
            "Opção 3 Tirar Ferias\r\n" +
            "Opção 4 Sair\r\n").toInt()

        empregado1.escolhas()

    } }