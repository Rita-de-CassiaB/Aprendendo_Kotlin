import javax.swing.JOptionPane

fun main() {

    val  lutador1 = Lutador("", 0.0, 0.0, 100.00)

        lutador1.nome = JOptionPane.showInputDialog("Vamos começar a Luta! Nome do 1º lutador")
        lutador1.forcaAtaque = JOptionPane.showInputDialog("Força de Ataque do 1º lutador").toDouble()
        lutador1.forcaDefesa = JOptionPane.showInputDialog("Força de Defesa do 1º lutador").toDouble()

    val  lutador2 = Lutador("", 0.0, 0.0,100.00)

        lutador2.nome = JOptionPane.showInputDialog("Vamos começar a Luta! Nome do 2º lutador")
        lutador2.forcaAtaque = JOptionPane.showInputDialog("Força de Ataque do 2º lutador").toDouble()
        lutador2.forcaDefesa = JOptionPane.showInputDialog("Força de Defesa do 2º lutador").toDouble()

    for (contador in 0..2) {
        val opcao = JOptionPane.showInputDialog(
            "1 - Lutador 1 bate no Lutador 2\n" +
            "2 - Lutador 2 bate no Lutador 1").toInt()
        when (opcao) {
            1 -> {
                lutador2.apanhar( quemBate = lutador1 )
            } 2 -> {
                lutador1.apanhar( quemBate = lutador2 )
            }
        }

        JOptionPane.showMessageDialog(null, "${lutador1.descrever()}")
        JOptionPane.showMessageDialog(null, "${lutador2.descrever()}")

        val opcaos = JOptionPane.showInputDialog(
            "1 - Lutador 1 se concentra\n" +
                    "2 - Lutador 2 se concentra\n" +
                    "3 - Ninguém se concentra").toInt()
        when (opcaos) {
            1 -> {
                lutador1.concentrar()
            } 2 -> {
            lutador2.concentrar()
            }
        }
        JOptionPane.showMessageDialog(null, lutador1.descrever())
        JOptionPane.showMessageDialog(null, lutador2.descrever())
    }

    JOptionPane.showMessageDialog(null, lutador1.descrever())
    JOptionPane.showMessageDialog(null, lutador2.descrever())
    JOptionPane.showMessageDialog(null, vencer(lutador1,lutador2))

}

fun vencer(lutador1:Lutador, lutador2:Lutador) :String{
    if (lutador1.vidaAtual > lutador2.vidaAtual) {
        return "O vencedor é o lutador ${lutador1.nome}"
    }else if (lutador2.vidaAtual < lutador1.vidaAtual) {
        return "O vencedor é o lutador ${lutador2.nome}"
    }else {
        return "Deu empate entre ${lutador2.nome} e ${lutador1.nome} "

    }

}



// análise de código, objeto e tipagem
// PRovas: LP + calculo e LP + AR
// SO:Calculos e AR

