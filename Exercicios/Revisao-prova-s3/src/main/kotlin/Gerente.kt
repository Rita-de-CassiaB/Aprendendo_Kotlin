class Gerente: PessoaFisica(){
    var agencia:String = ""

    override fun exibirInformacoes():String {
        return """
            ${super.exibirInformacoes()}
            Agencia: $agencia
        """.trimIndent()

    }
}