class Atendente:Funcionario() {
    var setor:String = ""

    override fun exibirDados(): String {
        return """
          Nome: $nome
          Setor: $setor
          Salário: ${"%.2f".format(salario)}
        """.trimIndent()
    }

}