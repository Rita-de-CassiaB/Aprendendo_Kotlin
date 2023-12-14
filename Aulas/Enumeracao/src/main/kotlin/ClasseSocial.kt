
enum class ClasseSocial (val descricao:String, val minimo:Double, val maximo:Double) {
    A ("Classe dos Ricos", 30_000.0,Double.MAX_VALUE),
    B ("Classe média alta", 20_000.0, 30_000.0),
    C ("Classe média baixa", 7_500.0, 20_000.0),
    D ("Classe dos Pobres", 1_500.0, 7_500.0),
    E ("Abaixo da linha da pobreza", 0.0, 1_500.0);

    companion object{
    fun aPartirDaRenda(renda:Double): ClasseSocial {
        values().forEach {
            if (renda >= it.minimo && renda < it.maximo){
                return it
            }
        }
        throw IllegalArgumentException(
            "$renda não existe em nenhuma classe"
        )
    }
}
}