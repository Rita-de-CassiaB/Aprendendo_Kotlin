package aula2508.segundaparte

import javax.swing.JOptionPane

fun main() {
    val Pedido1 = PedidoPizza()

    val nome = JOptionPane.showInputDialog("Qual é o modelo do seu relógio?").toString()
    val valor = JOptionPane.showInputDialog("Qual é o valor do seu relógio?").toDouble()
    val hora = JOptionPane.showInputDialog("Que horas são?").toInt()
    val minuto = JOptionPane.showInputDialog("Que minutos são?").toInt()
    val segundo = JOptionPane.showInputDialog("Que segundos são?").toInt()
}