class Banco(
    val nome: String,
    private var saldo: Double
) {
    fun getSaldo(): Double {
        return saldo
    }

    // get + private -> usado para não alterar o valor original da conta
    fun depositar(valor: Double): Double {
        if (valor > 0.0) {
            saldo += valor
        }
        return saldo
    }

    fun retirar(valor: Double): Double {
        if (valor <= this.saldo) {
            this.saldo -= valor
        }
        return saldo
    }
}
