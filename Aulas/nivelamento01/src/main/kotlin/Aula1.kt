import kotlin.math.pow

fun main() {
    println("É nóis no Kotlin!")
    println("\nÉ nóis \nno Código!")
    println("")
    println("Onde estou??")
    println("\r\nSerá que é mesmo? \r\nNunca saberemos")
    println()
    // Formas de quebrar linha

// Criando variáveis

    var bairro = "Bela Vista"
    // variável string (texto)

    var populacao = "50000"
    // variável int (número inteiro)

    var ligado = false
    // variável boolean (booleana)

    var altura = 1.88
    // variável doble (número real)

    println("No bairro $bairro moram $populacao pessoas")
    println("No bairro ${bairro} moram ${populacao} pessoas")
    println("No bairro ${bairro.uppercase()} o IDH é ${(10+9)/3}")
    /*
    Na interpolação (String Template) são usados aspas duplas e apenas o cifrão, caso queira o valor das variáveis
    caixa alta é feita utilizando o uppercase
    contas são feitas utilizando as chaves
    */

    val soma = 5 + 4
    val multi = 3 * 3
    val divisao = 90 / 2
    val subtracao = 8 - 3
    val potencia = Math.pow(2.0, 3.0)
    val potencia2 = 2.0.pow(3)

    println("Potência 01: $potencia")
    println("Potência 02: $potencia2")

    //operações matemáticas básicas

    var endereco = "rua loka, 10"
    endereco = "rua dahora, 90"

    /*
    Varáveis criadas com "var" podem ter o valor alterado
    As variáveis criadas com "val" não podem ser alteradas nunca, ou seja, é um valor imutável
     */

    val cpf = "123456789"
    // cpf = "999999"

    var idade = 12

    if (idade >= 18) {
        println("Maior de idade")
    }else {
        println("vai jogar PS!")
    }

    /* As estruturas if; if-else e if-else if funcionam como no JavaScript

    Os operadores de comparação numérica de JS são os mesmos
     */

    var contador = 0
    while (contador < 4) {
        println("100 querer 20 amar")
        contador++ // ++ e -- funciona da mesma forma
    }

    idade = 15
        when (idade) {
            in 0..7 -> println("bebê")

            in 7..10 -> {
                println("criancinha")
                println("não deixe o samba morrer")
            }
            in 10..22 -> {
                println("adolescente")
                println("Ensine sobre DSTs")
            }
            in 22..50 -> println("adulto")
            in 50..130 -> println("melhor idade")
            in 130..Int.MAX_VALUE -> println("Matusalém")
            else -> println("Idade inválida")

            // Para executar mais de uma linha abra chaves

        }
        var salario = 2500
        var classeSocial = when (salario) {
            in 0..500 -> "Classe D"
            in 501..1500 -> "Classe C"
            in 1500..5000 -> "Classe B"
            in 5001..50000 -> "Classe A"
            else -> "Inválida" //else é obrigatório p when com atribuição

        }
        println("Você é da $classeSocial")
    }

