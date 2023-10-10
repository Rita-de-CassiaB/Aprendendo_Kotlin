

// PascalCase
class Carro {

    var modelo: String = ""
    var potencia: Double = 0.0
    var km: Int = 0
    var marcha: Int = 0
    var ligado: Boolean = false

    fun ligar() {
        ligado = true
    }

    fun desligar() {
        ligado = false
    }

    // camelCase
    fun aumentarMarcha() {
        if (marcha < 6) {
            marcha++
        }
    }

    fun reduzirMarcha() {
        if (marcha <= 6 && marcha > -1) {
            marcha--
        }
    }

    fun fazerViagemCurta() {
        if (ligado){
            when(marcha) {
                in 1..2 -> km += 10
                in 3..5 -> km += 20
                6 -> km += 30
            }
        }
    }

    // Exemplo de método que retorna formatado por instancia.
    fun verificaLigado(): String {
        if (ligado) {
            return "ligado"
        }
        return "desligado"
    }
}