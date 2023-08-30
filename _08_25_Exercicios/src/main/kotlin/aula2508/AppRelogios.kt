package aula2508

import javax.swing.JOptionPane

fun main() {
    val relogio1 = Relogio()

    relogio1.modelo = "digital e retangular"
    relogio1.preco = 850.95
    relogio1.segundos = 80
    relogio1.minutos = 2
    relogio1.horas = 5
    relogio1.validar()
    JOptionPane.showMessageDialog(null, "No seu relógio é ${relogio1.verHora()} ")

    val relogio2 = Relogio()
    val nome = JOptionPane.showInputDialog("Qual é o modelo do seu relógio?").toString()
    val valor = JOptionPane.showInputDialog("Qual é o valor do seu relógio?").toDouble()
    val hora = JOptionPane.showInputDialog("Que horas são?").toInt()
    val minuto = JOptionPane.showInputDialog("Que minutos são?").toInt()
    val segundo = JOptionPane.showInputDialog("Que segundos são?").toInt()

    relogio2.modelo = nome
    relogio2.preco = valor
    relogio2.segundos = hora
    relogio2.minutos = minuto
    relogio2.horas = segundo

    JOptionPane.showMessageDialog(null, "Seu relógio é um ${relogio2.modelo}, no preço de ${relogio2.preco}, o horário atual é:${relogio2.verHora()}")

    JOptionPane.showMessageDialog(null, relogio2.validar())
    JOptionPane.showMessageDialog(null, "Hora no 2º relógio: ${relogio2.verHora()}")



}

