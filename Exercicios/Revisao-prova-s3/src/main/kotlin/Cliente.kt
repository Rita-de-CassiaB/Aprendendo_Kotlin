class Cliente:PessoaFisica() {
    var numeroConta:String = ""

    override fun exibirInformacoes(): String {
        return """
            ${super.exibirInformacoes()}
            Numero da Conta:$numeroConta
        """.trimIndent()

    }
}