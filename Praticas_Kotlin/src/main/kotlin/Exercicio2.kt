import javax.swing.JOptionPane

fun main() {
    var nome:String = JOptionPane.showInputDialog("Insira seu nome")
    var bairro:String = JOptionPane.showInputDialog("Insira seu bairro")

    JOptionPane.showMessageDialog(null,"Olá $nome, o nome do seu bairro é $bairro")

    var linhaOni: String = JOptionPane.showInputDialog("Insira o nome de uma linha de ônibus")
    var tempoOnimenor: Int = JOptionPane.showInputDialog("Insira o menor tempo em minutos que essa linha de ônibus faz uma volta").toInt()
    var tempoOnimaior: Int = JOptionPane.showInputDialog("Insira o maior tempo em minutos que essa linha de ônibus faz uma volta").toInt()

    JOptionPane.showMessageDialog(/* parentComponent = */ null,/* message = */
        "$nome, o nome do seu bairro é $bairro e a linha $linhaOni leva em média ${media(tempoOnimenor, tempoOnimaior)} minutos/volta")
}

fun media(tempoOnimenor:Int, tempoOnimaior:Int ): Int {
   return (tempoOnimenor+tempoOnimaior)/2
}