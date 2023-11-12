import javax.swing.JOptionPane

open class Funcionario {
    var nome:String = ""
    var idade:Int = 0
    var salario:Double = 0.0

    open fun exibirDados():String {
        return """
            Nome: $nome
            Idade: $idade
            Salário: ${"%.2f".format(salario)}
        """.trimIndent()
    }


    open fun getAumentoSalario():Double{
       val valor =  JOptionPane.showInputDialog(null,"Quer aumentar o salário em quanto?").toDouble()
        return valor
    }

    fun aumentarSalario():Double{
        salario += getAumentoSalario()
        return salario
    }



}