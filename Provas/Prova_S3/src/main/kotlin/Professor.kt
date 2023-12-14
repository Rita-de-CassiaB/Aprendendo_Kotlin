class Professor:Pessoa() {

    var especialidade:String = ""

    override fun exibirInformacoes(): String {
        return """
${super.exibirInformacoes()}
Especialidade: $especialidade
        """
    }
}