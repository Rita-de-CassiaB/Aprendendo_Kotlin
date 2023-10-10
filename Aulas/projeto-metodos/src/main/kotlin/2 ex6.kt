import javax.swing.JOptionPane

fun main() {
    val frase:String = JOptionPane.showInputDialog("Insira uma frase motivacional").toString()
    val qnt:Int = JOptionPane.showInputDialog("Insira q auntidade de vezes que você quer que ela apareça").toInt()

    exibirMensagem("${repetir(String)}")

}

fun repetir(qnt:Int, frase:String):String {
    return
    for (contador in 0..qnt)

}