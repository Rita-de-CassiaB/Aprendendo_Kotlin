import java.util.*
import javax.swing.JOptionPane

fun main() {
    //Como captar inputs de usuário da maneira "roots"
        //    val sn = Scanner(System.`in`)
        //
        //    print("Digite seu nome:")
        //    val texto = sn.next()
        //
        //    println("\r\nO seu nome é $texto")
        //

    val nomeUsuario = JOptionPane.showInputDialog("Digite seu nome!")
        //    println("Seu nome é $nomeUsuario")
    JOptionPane.showMessageDialog(null, "O seu nome é $nomeUsuario")

}