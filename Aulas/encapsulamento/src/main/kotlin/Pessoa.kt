class Pessoa (var nome:String, private var idade:Int) {

    fun fazerAniversario(){
        idade += 1
    }

    fun getIdade():Int{
        return idade
    }

}