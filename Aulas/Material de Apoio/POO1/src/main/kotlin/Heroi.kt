class Heroi {
    var nome:String = ""
    var poderes: String = ""
    var vida: Double = 100.00
    var aposentado: Boolean = false

    fun usarPoder(){
        if (nome.isNotBlank() && poderes.isNotBlank()){
        println("Herói(na) $nome usando poderes de $poderes, atualmente sua vida é de $vida")
    }else {
        println("Heroi sem atributos")
        }

    }
    fun aposentar (){
        aposentado = true
    }

    fun apanhar(forca:Double){
        vida -= forca
        if (vida < 0) {
        vida = 0.0
        }
    }



}