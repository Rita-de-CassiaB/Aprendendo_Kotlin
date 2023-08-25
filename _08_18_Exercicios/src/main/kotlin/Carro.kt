import javax.swing.JOptionPane

class Carro {
    var modelo: String = ""
    var potencia: Double = 0.0
    var kmt: Int = 0
    var marcha: Int = 0
    var ligado: Boolean = false


    fun ligar() {
        if (ligado == false){
            ligado == true
        }
    }

    fun aumentarMarcha() {
        if (marcha < 6) {
            marcha++
        }
    }

    fun reduzirMarcha() {
        if (marcha > -1) {
            marcha--
        }

    }
    fun fazerViagemCurta(){

        when  (marcha) {
            in 1 .. 2 -> kmt += 10
            in 3 .. 5 -> kmt += 20
            6 -> kmt += 30
            in -1 .. 0 -> kmt
        }
    }
}