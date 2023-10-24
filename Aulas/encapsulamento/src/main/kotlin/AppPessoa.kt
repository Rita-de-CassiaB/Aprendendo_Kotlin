fun main() {
    val pessoa1 = Pessoa("Rafael", 22)

    pessoa1.nome = "Reis"
    println(
        """
            Seu nome é ${pessoa1.nome}
            e você tem ${pessoa1.getIdade()}
        """.trimIndent()
    )
    pessoa1.fazerAniversario()

    println(
        """
        Seu nome é ${pessoa1.nome}
        e você tem ${pessoa1.getIdade()}
    """.trimIndent())
}