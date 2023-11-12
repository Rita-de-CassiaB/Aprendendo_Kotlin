import javax.swing.JOptionPane
import javax.swing.JOptionPane.*

fun main() {

    val dog1 = Cachorro()
    val dog2 = CachorroRaça()
    val dog3 = CachorroViraLata()

    val cachorros = listOf(dog1, dog2, dog3)

    cachorros.forEachIndexed {contador, cachorros ->
        val ordem = contador +1
        cachorros.nome = showInputDialog(null, "Qual o nome do cachorro").toString()
        cachorros.peso = showInputDialog(null, "Qual o peso do cachorro").toDouble()
        cachorros.idade = showInputDialog(null, "Qual a idade do cachorro").toInt()
    }

    cachorros.forEach { cachorro ->
        showMessageDialog(null, cachorro.getDescricao())
        showMessageDialog(null, cachorro.getAcaoQuandoVerMoro())
    }
    cachorros[0].comer("Ração Comum", 200.00)
    cachorros[1].comer("Ração Premium", 300.00)
    cachorros[3].comer("Resto do almoço", 100.00)


}