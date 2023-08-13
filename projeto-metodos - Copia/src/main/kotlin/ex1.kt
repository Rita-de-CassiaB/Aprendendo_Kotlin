import javax.swing.JOptionPane

fun main() {
    val altura = JOptionPane.showInputDialog("Insira sua altura").toFloat()
    val peso= JOptionPane.showInputDialog("Insira seu peso").toFloat()
    val altura2:Float = altura * altura

    exibirMensagem("Seu IMC é de: ${"%.2f".format(IMC(peso, altura2))}")
    println("Seu IMC é ${"%.2f".format(IMC(peso, altura2))}")
}

fun exibirMensagem(frase:String) {
    JOptionPane.showMessageDialog(null,frase)
}

fun IMC(peso:Float, altura2:Float):Float {
    return peso / altura2
}
