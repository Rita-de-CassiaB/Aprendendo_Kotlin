import javax.swing.JOptionPane
import kotlin.math.max

fun main() {
    var salario: Double = JOptionPane.showInputDialog("Insira seu salário"). toDouble()

    if (salario in 0 .. 1000 ){
        exibirMensagem("Classe C")
    } else if (salario in 1000.01 .. 2000.0) {
        exibirMensagem("Classe B")
    }else if (salario in 2000.01 .. 5000.0) {
        exibirMensagem("Classe A")
    }else if (salario in 5000.01 .. Double.MAX_VALUE) {
        exibirMensagem("Classe AA")
    } else {
        exibeMensagem("Salário Inválido")
    }



}