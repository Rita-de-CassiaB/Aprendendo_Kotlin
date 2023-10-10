import java.math.BigDecimal

fun main() {

    val hora: Int = 9
    val minuto: Int = 9
    print("${hora.toString().padStart(2, '0')}:$minuto")

//    Exemplo de formatar o zero a esquerda na mão
//    var minutoFormatado: String
//    if (minuto.toString().length == 1) {
//        minutoFormatado = "0$minuto"
//    } else {
//        minutoFormatado = minuto.toString()
//    }


    // exemplo de valor monetário grandão
    // BigDecimal - 128 bytes - decimal(20, 7)
//    val preco: BigDecimal = BigDecimal.valueOf(20000.00)

    // Double - 32 bytes - 200000 - (20_000_000 = 20.E28)
    val preco: Double = 20.336
    print("você tem na conta: ${"%.2f".format(preco)}")
    // se eu passar %.3f quero indicar que terá 3 casas decimais depois do ponto
}