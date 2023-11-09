
import javax.swing.JOptionPane
class Carro (
    val modelo: String = "",
    private var ligado: Boolean = false,
    private var velocidade: Double = 0.0
){
   fun ligar(){
       ligado = true
    }

    fun desligar(){
        if (velocidade == 0.0){
        ligado = false
    }
    }

    fun acelerar():Double {
        if (true.also { ligado = it }) {
            if (velocidade == 0.0) {
                velocidade = 10.0
            } else if (velocidade < 175.0){
                velocidade *= 1.25
            } else {
                velocidade = 180.0
            }
        }
        return velocidade
    }

    fun freiar():Double{
      if (true.also { ligado = it })  {
          if (velocidade >= 3.0){
          velocidade -= 3
          }
      }
        return velocidade
    }

    fun getVelocidade(): Double{
        return velocidade
    }
}