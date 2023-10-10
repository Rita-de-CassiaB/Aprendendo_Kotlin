import javax.swing.JOptionPane

fun main() {
    val pergunta = "Quantos gols?"
    val golsMarcados = JOptionPane.showInputDialog(pergunta).toInt()

    if (golsMarcados >= 0) {
        exibeMensagem(classificarAtacante(golsMarcados))
    }
}

fun classificarAtacante(gols: Int):String {
    return when (gols) {
        0 -> "Sem pontaria"
        in 1..2 -> "Pontaria meia boca"
        in 3..5 -> "Dá pro gasto"
        else -> "Artilheiro"
    }
}