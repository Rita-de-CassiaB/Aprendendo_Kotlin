import javax.swing.JOptionPane

fun main() {
    val carro1 = Carro()
    JOptionPane.showMessageDialog(null,"O  1º carro é um ${carro1.modelo} e está na marcha ${carro1.marcha}")

    if (carro1.ligado == false ) {
        JOptionPane.showMessageDialog(null, "O 1º carro está desligado")
    } else {
        JOptionPane.showMessageDialog(null, "O 1º carro está ligado")
    }

    JOptionPane.showMessageDialog(null, "Ligue seu carro")

    carro1.ligar()
    carro1.aumentarMarcha()
    carro1.aumentarMarcha()

    JOptionPane.showMessageDialog(null,"O  1º carro é um ${carro1.modelo} e está na marcha ${carro1.marcha}")

    if (carro1.ligado == false ) {
        JOptionPane.showMessageDialog(null, "O 1º carro está desligado")
    } else {
        JOptionPane.showMessageDialog(null, "O 1º carro está ligado")
    }


    val carro2 = Carro()
    val nome: String = JOptionPane.showInputDialog(null, "Insira o modelo do seu carro")
    carro2.modelo = nome
    val kms: Int = JOptionPane.showInputDialog (null, "Quantos km você quer rodar?").toInt()
    JOptionPane.showMessageDialog(null,"O  seu carro é um modelo ${carro2.modelo}, está na marcha ${carro2.marcha} e já tem ${carro2.kmt} de km rodados")
    carro2.kmt += kms
    JOptionPane.showMessageDialog(null, "Ligue seu carro")
    carro2.ligar()
    carro2.aumentarMarcha()
    carro2.fazerViagemCurta()
    JOptionPane.showMessageDialog(null,"O  seu carro é um modelo ${carro2.modelo}, está na marcha ${carro2.marcha} e já tem ${carro2.kmt} de km rodados")
    carro2.aumentarMarcha()
    carro2.aumentarMarcha()
    JOptionPane.showMessageDialog(null,"O  seu carro é um modelo ${carro2.modelo}, está na marcha ${carro2.marcha} e já tem ${carro2.kmt} de km rodados")
    carro2.fazerViagemCurta()
    carro2.fazerViagemCurta()
    carro2.reduzirMarcha()
    carro2.fazerViagemCurta()
    JOptionPane.showMessageDialog(null, "Você queria rodar ${kms} e rodou ${carro2.kmt} ")

    }



