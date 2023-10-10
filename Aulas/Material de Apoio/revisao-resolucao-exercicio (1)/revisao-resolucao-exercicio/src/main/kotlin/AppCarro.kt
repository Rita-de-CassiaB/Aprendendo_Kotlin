import javax.swing.JOptionPane

fun pt1() {

    val carro = Carro()
    carro.modelo = "Uno com escada"

    JOptionPane.showMessageDialog(null, " 1º carro é um ${carro.modelo} e está na marcha ${carro.marcha}")

// Exemplos
//    var condicaoFormatada = if (carro.ligado) "ligado"  else "desligado"

    var condicaoFormatada = ""
    if (carro.ligado) {
        condicaoFormatada = "ligado"
    } else {
        condicaoFormatada = "desligado"
    }

    JOptionPane.showMessageDialog(null,
        "O 1º carro está $condicaoFormatada")

    carro.ligar()
    carro.aumentarMarcha()
    carro.aumentarMarcha()

    if (carro.ligado) {
        condicaoFormatada = "ligado"
    } else {
        condicaoFormatada = "desligado"
    }

    JOptionPane.showMessageDialog(null, " 1º carro é um ${carro.modelo} e está na marcha ${carro.marcha}")

    JOptionPane.showMessageDialog(null,
        "O 1º carro está $condicaoFormatada")


//    JOptionPane.showMessageDialog(null,
//        "O 1º carro está ${if (carro.ligado) "ligado" else "desligado"}")
//    JOptionPane.showMessageDialog(null,
//        "O 1º carro está ${carro.verificaLigado()}")


}

fun main() {
    var carro = Carro()
    carro.modelo = JOptionPane.showInputDialog("Digite o modelo do carro")

    val kmDesejado = JOptionPane.showInputDialog("Quantos km você quer rodar?")

    JOptionPane.showMessageDialog(null, "O seu carro é um ${carro.modelo}, está na marcha ${carro.marcha} e já tem ${carro.km} de km rodados")

    carro.ligar()
    carro.aumentarMarcha()
    carro.fazerViagemCurta()

    JOptionPane.showMessageDialog(null, "O seu carro é um ${carro.modelo}, está na marcha ${carro.marcha} e já tem ${carro.km} de km rodados")

    carro.aumentarMarcha()
    carro.aumentarMarcha()
    carro.fazerViagemCurta()
    carro.fazerViagemCurta()

    carro.reduzirMarcha()
    carro.fazerViagemCurta()

    JOptionPane.showMessageDialog(null, "Você queria rodar $kmDesejado km e rodou ${carro.km} km")

    JOptionPane.showMessageDialog(null, "O seu carro é um ${carro.modelo}, está na marcha ${carro.marcha} e já tem ${carro.km} de km rodados")

}