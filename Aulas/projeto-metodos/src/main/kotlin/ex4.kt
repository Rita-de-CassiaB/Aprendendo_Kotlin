import javax.swing.JOptionPane

fun main() {
    val qnt: Int = JOptionPane.showInputDialog("Quantos gols o atacante tem?").toInt()

    when(qnt){

        0 -> print ("Sem pontaria!")
        in 1 .. 2 -> print("Pontaria meia boca")
        in 3 .. 5 -> print("Dá pro gasto")
        in 6 .. Int.MAX_VALUE -> print("Artilheiro") }

}