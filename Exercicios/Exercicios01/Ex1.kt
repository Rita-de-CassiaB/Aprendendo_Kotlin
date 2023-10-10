import javax.swing.JOptionPane

fun main() {
    val altura = JOptionPane.showInputDialog("Insira sua altura").toInt()
    val peso= JOptionPane.showInputDialog("Insira seu peso").toInt()
    val altura2 = altura * altura

    exibirMensagem("Seu IMC é de: ${IMC(peso, altura2)}")
}

fun exibirMensagem(frase:String) {
    JOptionPane.showMessageDialog(null,frase)
}

fun IMC(peso:Int, altura2:Int):Int {
    return peso / altura2
}
