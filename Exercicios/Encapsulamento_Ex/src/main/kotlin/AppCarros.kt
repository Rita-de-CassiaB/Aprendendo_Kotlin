import javax.swing.JOptionPane

fun main() {
    val carro1 = Carro("Uno com Escada", false, 0.0)

    carro1.ligar()
    
    JOptionPane.showMessageDialog(null, "Seu carro está ligado e você está com ${carro1.getVelocidade()} Km/h, acelere mais ")

    carro1.acelerar()
    carro1.acelerar()
    carro1.acelerar()
    carro1.freiar()
    carro1.freiar()

    JOptionPane.showMessageDialog(null, "Você está com ${carro1.getVelocidade()} Km/h, acelere mais ")

    for (i in 1..15) {
        carro1.acelerar()
        JOptionPane.showMessageDialog(null, "$i - Você está com ${carro1.getVelocidade()} Km/h, acelere mais ")
    }
    JOptionPane.showMessageDialog(null, "Você está com ${carro1.getVelocidade()} Km/h, acelere mais ")

    while (true) {
        val velocidade = carro1.getVelocidade()

        if (velocidade < 0.1) {
            break
        } else {

            carro1.freiar()
            JOptionPane.showMessageDialog(null, "Você está com ${carro1.getVelocidade()} Km/h, freie mais")
        }
    }
    carro1.desligar()
    JOptionPane.showMessageDialog(null, "Esse é de firma!")
}
