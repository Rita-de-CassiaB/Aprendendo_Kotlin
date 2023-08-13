import javax.swing.JOptionPane

fun main() {
    val nome: String = JOptionPane.showInputDialog("Insira seu nome").toString()
    val idade: Int = JOptionPane.showInputDialog("Insira sua idade").toInt()



    when (idade){

        in 0..16 -> println(" olá ${nome}, você ainda não pode votar")
        in 16..Int.MAX_VALUE -> println("olá ${nome}, você já pode votar")
        else -> println("olá ${nome}, a idade inserida é inválida insira um número positivo")
}
}