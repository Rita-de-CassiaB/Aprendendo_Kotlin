import javax.swing.JOptionPane

fun main() {
    val cofrinhos = mutableListOf<Cofrinho>()

    for (contador in 0..2) {
        val objetivo = JOptionPane.showInputDialog(null, "Digite o objetivo").toString()
        val meta = JOptionPane.showInputDialog(null, "Digite a meta").toDouble()

        val novoCofre = Cofrinho(objetivo, meta)

        cofrinhos.add(novoCofre) }
    while (true) {
        val pergunta = JOptionPane.showInputDialog(
            null, "Em qual cofre quer mexer? \r\n" +
                    "1,2 ou 3? Nenhum deles para encerrar o app"
        ).toInt()

        if (pergunta == 1 || pergunta == 2 || pergunta == 3) {
            val valorDeposito =
                JOptionPane.showInputDialog(null, "Informe quanto vai depositar no cofre $pergunta").toDouble()
            cofrinhos[pergunta].depositar(valorDeposito = valorDeposito)

            val valorRetirada =
                JOptionPane.showInputDialog(null, "Informe quanto vai retirar do cofre $pergunta").toDouble()
            cofrinhos[pergunta].retirar(valorRetirada = valorRetirada)

            JOptionPane.showMessageDialog(null, cofrinhos[0].descrever())
            JOptionPane.showMessageDialog(null, cofrinhos[1].descrever())
            JOptionPane.showMessageDialog(null, cofrinhos[2].descrever())

        }else {
            JOptionPane.showMessageDialog(null, cofrinhos[0].descrever())
            JOptionPane.showMessageDialog(null, cofrinhos[1].descrever())
            JOptionPane.showMessageDialog(null, cofrinhos[2].descrever())
            }

    }
}