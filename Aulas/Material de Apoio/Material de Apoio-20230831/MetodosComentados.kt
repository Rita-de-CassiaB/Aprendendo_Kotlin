import javax.swing.JOptionPane


fun main() {

    // Por padrão o inputDialog retorna uma String (texto)
    // Estou utilizando tipo declarativo informando que obrigatoriamente tem que ser um texto
    val primeiroNumero: Int = JOptionPane.showInputDialog("Digite o primeiro número").toInt()

    // Estou usando tipo inferido dizendo que o valor inicial dele pode ser de qualquer tipo
    val segundoNumero = JOptionPane.showInputDialog("Digite o segundo número").toInt()

    // É possível guardar o retorno em uma variável para não precisar ficar chamando o método toda hora.
    val somaDosNumeros = somar(primeiroNumero, segundoNumero)
    exibeMensagem("A soma é: ${somaDosNumeros}")

    exibeMensagem("A soma dos dois números é: ${somar(primeiroNumero, segundoNumero)}")

    // Não preciso mais ficar chamando o JOPtionPane, só passo a mensagem com a operação interpolada
    exibeMensagem("A subtração é: ${subtrair(primeiroNumero, segundoNumero)}")
    exibeMensagem("A divisão é: ${dividir(primeiroNumero, segundoNumero)}")
    exibeMensagem("A multiplicação é: ${multiplicar(primeiroNumero, segundoNumero)}")
}

fun exibeMensagem(mensagem: String) {
    JOptionPane.showMessageDialog(null, mensagem)
}

// A soma é responsável somente por somar os dois números e retornar o resultado
fun somar(primeiroNumero: Int, segundoNumero: Int): Int { // O tipo de retorno não necessariamente precisa ser o mesmo do tipo recebido (parâmetro)
    return primeiroNumero + segundoNumero
    /*
        Poderia ser uma equação mais complexa,
        por isso isolamos e deixamos disponivel para qualquer pessoa usar em qualquer contexto
     */
}


fun subtrair(primeiroNumero: Int, segundoNumero: Int): Int {
    return primeiroNumero - segundoNumero
}

fun dividir(primeiroNumero: Int, segundoNumero: Int): Int {
    return primeiroNumero / segundoNumero
}

fun multiplicar(primeiroNumero: Int, segundoNumero: Int): Int {
    return primeiroNumero * segundoNumero
}

// Exemplo de vários tipos
fun somarFrase(n1: Int, n2: Double) : String {
    return "Você tem dois números $n1 $n2"
}