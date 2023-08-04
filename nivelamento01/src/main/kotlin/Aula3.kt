    fun main() {
        var xicara = "Café"

        println("\r\nVocê tem uma xicara com $xicara")
        println(entregarParaAlguem(xicara))

    }

    fun entregarParaAlguem (xicara: String): String {
        println("Você entregou o seu $xicara para fulano esquentar e ele levou para o microondas")
        return esquentar(xicara)
    }

    fun esquentar (xicara: String):String {
        println("\r\nEsquentando xicara com $xicara...")
        println("Vrumm Vrumm Vrumm...")
        return "$xicara está quente!"
    }