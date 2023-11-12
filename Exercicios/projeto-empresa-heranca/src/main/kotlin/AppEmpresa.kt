import javax.swing.JOptionPane

fun main() {

    val gerente = Gerente()
    val atendente = Atendente()
    val funcionarios = listOf(gerente, atendente)

    val resposta = JOptionPane.showInputDialog(null, "Deseja cadastrar? \n\r 1-sim 2-não").toInt()

    if (resposta == 1) {
        JOptionPane.showMessageDialog(null, "Olá, vamos realizar o cadastro de gerente e funcionario")
        for (i in 0..funcionarios.size) {

            funcionarios[i].nome = JOptionPane.showInputDialog("Qual o nome?")

            funcionarios[i].idade = JOptionPane.showInputDialog("Qual a idade de ${funcionarios[i].nome}?").toInt()

            gerente.departamento = "TI"
            atendente.setor = "TI"

            funcionarios[i].salario =
                JOptionPane.showInputDialog(null, "Qual o salario de ${funcionarios[i].nome} ?").toDouble()

            JOptionPane.showMessageDialog(null, funcionarios[i].exibirDados())

            while (true) {
                val resposta2 =
                    JOptionPane.showInputDialog("Você deseja aumentar o salario de ${funcionarios[i].nome} \n 1-sim \n 2-não")
                        .toInt()
                if (resposta2 == 1) {
                    funcionarios[i].aumentarSalario()
                    JOptionPane.showMessageDialog(null, funcionarios[i].exibirDados())
                } else if (resposta2 == 2) {
                    JOptionPane.showMessageDialog(null, funcionarios[i].exibirDados())
                    JOptionPane.showMessageDialog(null, "Parabéns você saiu")
                    break
                } else {
                    JOptionPane.showMessageDialog(null, "Resposta inválida")
                }
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Parabéns você saiu do cadastro")
    }
}