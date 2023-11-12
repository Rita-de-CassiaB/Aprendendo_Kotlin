import javax.swing.JOptionPane

class Gerente:Funcionario() {
    var departamento:String = ""

    override fun exibirDados(): String {
        return """
            Nome: $nome
            Departamento: $departamento
            Salário: ${"%.2f".format(salario)}
        """.trimIndent()
    }

}