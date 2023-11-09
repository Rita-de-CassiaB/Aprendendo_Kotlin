import javax.swing.JOptionPane

fun main() {
    val cachorro1 = Cachorro()

    cachorro1.nome = JOptionPane.showInputDialog("Nome:")

    var comida:String = JOptionPane.showInputDialog("Qual é a comida?")
    cachorro1.getComida()
    cachorro1.comer(comida = )




}