package aula2508.segundaparte

import javax.swing.JOptionPane

fun main() {
    val PedidoPizza = PedidoPizza()

    val PedidoPizza.sabor:String = JOptionPane.showInputDialog("Qual é o sabor da sua pizza?")
    var PedidoPizza.preco:Double = JOptionPane.showInputDialog("Qual é o valor da sua pizza").toDouble()
    val PedidoPizza.qntamigos:Int = JOptionPane.showInputDialog("São quantos amigos?").toInt()
}