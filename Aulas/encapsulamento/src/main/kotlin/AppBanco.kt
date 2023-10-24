
fun main() {
    val banco = Banco("Reis", 150000.02)
    banco.depositar(2.0)
    println("Saldo:${banco.getSaldo()}")

    println("Retirando R$100000.00")
    val saldoAposRetirada = banco.retirar(100000.0)
    println("Saldo: ${"%.2f".format(saldoAposRetirada)}")

}
