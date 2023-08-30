import java.math.BigDecimal

class Empregado {

    val nome:String = ""
    var cargo:String = "Estagiário"
    var salario: BigDecimal = 700.00

    fun reajustarSalario(): BigDecimal = salario = salario+(salario * 0.10)

    fun aumentarCargo(){
        if (cargo == "Estagiário"){
            cargo = "Analista Junior"
            salario += (salario * 02)
        }else if (cargo == "Analista Junior") {
            cargo = "Analista Pleno"
            salario += (salario * 0.3)
        } else if (cargo == "Analista Pleno")
            cargo = "Analista Senior"
            salario += (salario * 0.4)
    }

}