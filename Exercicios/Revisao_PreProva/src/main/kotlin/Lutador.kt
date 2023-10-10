
class Lutador (
    var nome:String,
    var forcaAtaque: Double,
    var forcaDefesa: Double,
    var vidaAtual: Double
){
    var golpesSofridos = mutableListOf<Int>()

    fun concentrar(): Double{
        return vidaAtual * 1.05
    }

    fun treinarLeve(semanas:Int){
        forcaAtaque += semanas
    }

    fun treinarForte(semanas:Int){
        forcaAtaque += (semanas * 3)
    }

    fun apanhar(quemBate:Lutador){

        if (quemBate.forcaAtaque > forcaDefesa){
            vidaAtual -= (quemBate.forcaAtaque - forcaDefesa)}
                if ( vidaAtual < 0.0) {
                    vidaAtual = 0.0
            }
        golpesSofridos.add(quemBate.forcaAtaque.toInt())

        }


    fun descrever():String {
        return "O Lutador $nome tem ${vidaAtual} de vida e já recebeu ${golpesSofridos.size} golpes"
    }
}


