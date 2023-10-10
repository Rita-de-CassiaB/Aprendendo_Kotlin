import javax.swing.JOptionPane

fun main() {
    var transf = 0
    var nome: Int = JOptionPane.showInputDialog("Insira o nome do seu Sayajin").toInt()
    var vbase: Int = JOptionPane.showInputDialog("Insira o ki (força) base do seu Sayajin.").toInt()
    while (true){
    var resposta:Int = JOptionPane.showInputDialog("Selecione uma das transformações \n 1 - SSJ,\n 2- SSJ2, \n 3- SSJ3, \n 4- God, 5- Sair").toInt()
        when (resposta){
            1 -> {
                return vbase *= 50
            }
            2 -> {
                return vbase *= 100
            }
            3 -> {
                return vbase *= 200
            }
            4 -> {
                return vbase *= 300
            }
            5 -> {
                JOptionPane.showMessageDialog(null, "Parabéns $nome você saiu")
                break
            }

        }
        JOptionPane.showMessageDialog(null, "O sayajin $nome agora tem $transf de ki (força)")
        }
    }
}