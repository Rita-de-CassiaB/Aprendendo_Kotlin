import java.time.LocalDate
import java.time.Period


open class PessoaFisica{
    var nome:String = ""
    var email:String = ""
    var dataNascimento: LocalDate = LocalDate.of(2000, 11,20)

fun getIdade():Int {
    val hoje:LocalDate = LocalDate.now()
    val idade = Period.between(dataNascimento, hoje)
    return idade.years
}

open fun exibirInformacoes():String {
    return """
        Exibindo informações 
        Nome: $nome
        Email: $email
        Idade: ${getIdade()}
""".trimIndent()
}
}