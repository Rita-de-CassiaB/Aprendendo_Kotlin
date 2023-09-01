import java.text.DecimalFormat
import javax.swing.JOptionPane

class Empregado {

    var nome:String = ""
    var cargo:String = "Estagiário"
    var salario: Double = 700.00
    var opcao: Int = 0
    var decimal = DecimalFormat("0.00")

    fun reajustarSalario(){
        salario = salario * 1.10
    }

    fun aumentarCargo() {
        when (cargo) {
            "Estagiário" -> {
                salario = salario * 1.20
                cargo = "Analista Junior"
            } "Analista Junior" -> {
                salario = salario * 1.30
                cargo = "Analista Pleno"
            } "Analista Pleno" -> {
                salario = salario * 1.40
                cargo = "Analista Senior"
            } "Analista Senior" -> {
                salario = salario * 1.50
                cargo = "Tech Lead"
            }
        }
    }

    fun tirarFerias(): Double{
        return salario * 2
    }

    fun escolhas(){
        if (opcao != 4 ){
            if (opcao == 1) {
                aumentarCargo()
               JOptionPane.showMessageDialog(null,"Parabéns, você subiu de cargo e agora o seu salário é R$${decimal.format(salario)}")
            }else if (opcao == 2){
                reajustarSalario()
                JOptionPane.showMessageDialog(null,"Parabéns, você recebeu um aumento e agora o seu salário é R$${decimal.format(salario)}")
            }else if(opcao == 3){
                tirarFerias()
                JOptionPane.showMessageDialog(null,"Parabéns, você tirou férias e tem direito a R$${decimal.format(salario)} de salário mais 13º")
            }
        } else {
            JOptionPane.showMessageDialog(null,"Parabéns, você saiu")
        }
    }
   }