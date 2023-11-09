import javax.swing.JOptionPane

fun main() {
    val carro1 = Carro()
    carro1.fabricante = JOptionPane.showInputDialog("Fabricante?")
    carro1.modelo = JOptionPane.showInputDialog("Modelo")

    JOptionPane.showMessageDialog(null, carro1.getReacaoPessoas())
    JOptionPane.showMessageDialog(null, carro1.getDescricao())

    carro1.acelerar()
    JOptionPane.showMessageDialog(null, carro1.getDescricao())

    carro1.ligar()
    carro1.acelerar()
    JOptionPane.showMessageDialog(null, carro1.getDescricao())

    val carro2 = CarroLuxo()
    carro2.fabricante = JOptionPane.showInputDialog("Fabricante?")
    carro2.modelo = JOptionPane.showInputDialog("Modelo")

    JOptionPane.showMessageDialog(null, carro2.getReacaoPessoas())
    carro2.ligar()
    carro2.acelerar()
    JOptionPane.showMessageDialog(null, carro2.getDescricao())
    carro2.frear()
    JOptionPane.showMessageDialog(null, carro2.getDescricao())

    val carro3 = CarroPobre()
    carro3.fabricante = JOptionPane.showInputDialog("Fabricante?")
    carro3.modelo = JOptionPane.showInputDialog("Modelo")

    JOptionPane.showMessageDialog(null, carro3.getReacaoPessoas())
    carro3.ligar()
    carro3.acelerar()
    JOptionPane.showMessageDialog(null, carro3.getDescricao())
    carro3.frear()
    JOptionPane.showMessageDialog(null, carro3.getDescricao())

}

