enum class CalculoIMC ( val descricao:String, val minimo:Double, val maximo:Double, val acao:String) {
    PESO_BAIXO ("peso baixo",0.0, 18.4, "comer mais"),
    PESO_NORMAL ("peso normal",18.5, 24.9, "continuar assim"),
    EXCESSO_DE_PESO("excesso de peso", 25.0, 29.9 ,"tome cuidado"),
    OBESIDADE("obesidade", 30.0, 34.9, "coma um pouco menos de calorias"),
    OBESIDADE_EXTREMA ("obesidade extrema", 35.0, Double.MAX_VALUE, "coma menos calorias imediatamente");

    companion object{
        fun aPartirDoIMC(calculo:Double):CalculoIMC? {
            values().forEach {
                if (calculo >it.minimo && calculo <it.maximo){
                    return it
                }
            }
            throw ImcInvalidoException()
        }
    }
}