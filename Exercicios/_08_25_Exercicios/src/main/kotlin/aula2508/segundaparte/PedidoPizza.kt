package aula2508.segundaparte

class PedidoPizza {
    var sabor: String = ""
    var preco: Double = 0.0
    var qntamigos: Int = 0

    fun descrever(): String {
        return "Pedido de Pizza de ${sabor}, que custa R$${preco}"
    }
    fun validarCupom (cupom:String){
        if (cupom == "#amopizza")
            preco = (preco * 0.90)
    }
    fun obterValorPorAmigo(): String {
        return "(${preco / qntamigos})"
    }
}
