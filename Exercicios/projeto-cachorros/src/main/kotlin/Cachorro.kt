import javax.swing.JOptionPane

open class Cachorro {
    var nome: String = ""
    protected var peso: Double = 0.0
    private var idade: Int = 0


    fun getComida(): String {
        return comida
    }

    fun getQuantidadeGramas(): Double {
        var quantidadeGramas = JOptionPane.showInputDialog("Quanto de comida?").toDouble()
        return quantidadeGramas
    }

    fun comer(comida: String, quantidadeGramas: Double): String {
        var quantidadeGramas: Double = getQuantidadeGramas()
        peso += quantidadeGramas
        return "Cachorro comendo ${getComida()}"
    }
}