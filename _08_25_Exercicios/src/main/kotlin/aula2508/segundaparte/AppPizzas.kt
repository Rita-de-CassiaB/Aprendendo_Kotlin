package aula2508.segundaparte

import javax.swing.JOptionPane

fun main() {
    val primeiroPedido = PedidoPizza();

    primeiroPedido.sabor = JOptionPane.showInputDialog("Qual é o sabor da sua pizza?");
    primeiroPedido.preco  = JOptionPane.showInputDialog("Qual é o valor da sua pizza").toDouble();
    primeiroPedido.qntamigos = JOptionPane.showInputDialog("São quantos amigos?").toInt();

}