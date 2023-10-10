class Cofrinho (
    var objetivo: String,
    var meta: Double,
) {
    var depositos: Int = 0
    var saldo: Double = 0.0

    fun depositar(valorDeposito:Double){
        if (valorDeposito > 0){
            saldo += valorDeposito
        }
    }

    fun retirar(valorRetirada:Double){
        if (valorRetirada > 0){
            saldo -= valorRetirada
        }
    }

    fun porcentagemAteMeta():Double{
        return (saldo / meta) * 100
    }

    fun descrever():String{
        if (meta > saldo) {
        return "O cofrinho de objetivo ${objetivo} está com R$${saldo} de saldo, estando a ${porcentagemAteMeta()}% de R$${meta}"
        } else  {
            return  "O cofrinho de objetivo ${objetivo} está com R\$${saldo} de saldo. Já chegou na meta, estando em ${porcentagemAteMeta()}% dela!"
        }
    }

}