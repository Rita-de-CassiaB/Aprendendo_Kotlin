class AgenciaBancaria {
    var nome:String = ""
    var gerente = Gerente()
    var cliente = mutableListOf<Cliente>()

    fun adicionarCliente(cliente: Cliente){
        this.cliente.add(cliente)
    }

    fun detalhes(gerente: Gerente): String {
        return """
            Nome: $nome
            Gerente: ${gerente.nome}
            Quantidade de Clientes: ${cliente.size}
        """.trimIndent()

    }
}