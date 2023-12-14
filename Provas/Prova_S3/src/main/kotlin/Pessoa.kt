import java.time.LocalDate
import java.time.Period

open class Pessoa {
    var nome:String = ""
    var email:String = ""
    var dataNascimento:LocalDate = LocalDate.of(2000, 1, 1)

    open fun getIdade():Int {
        val hoje:LocalDate = LocalDate.now()
        val idade = Period.between(dataNascimento, hoje)
        return idade.years
    }

   open fun exibirInformacoes():String{
        return """ Exibindo informações
Nome: $nome
Email: $email
Idade:  ${getIdade()}
        """.trimIndent()
    }
}