import javax.swing.JOptionPane

fun main() {

    //Aqui estanciamos (criamos) um Estudante usando o contrutor

    val estudante1 = Estudante( "Ritinha", 4.5, 60.0 )
    println("E1: ${estudante1.nome}, ${estudante1.media}, ${estudante1.frequencia}")

    estudante1.nome = "Rite"
    estudante1.media = 9.0

    println("${estudante1.nome}, ${estudante1.media}, ${estudante1.frequencia}")

    // Quando os atributos no Estudante são definifos como val, não se pode editá-los novamente

    //cadastrando varios estudantes
    // criando uma lista que só aceita estudantes
    val estudantes = mutableListOf<Estudante>()

    for (contador in 0.. 4){
        val nome = JOptionPane.showInputDialog("Digite o nome")
        val media = JOptionPane.showInputDialog("Digite a media").toDouble()
        val freq = JOptionPane.showInputDialog("Digite a frequencia").toDouble()

        //criando um Estudante com os valores recém coletados
        val novoEstudante = Estudante(nome, media, freq)

        //incluindo o novoEstudante na lista
        estudantes.add(novoEstudante)

    }
    estudantes.forEach {
        val resultado = if (it.aprovou()) "Passou!" else "Não passou"

        JOptionPane.showMessageDialog(null, "${it.nome} - Resultado: ${resultado}")
    }

//    val estudantes = mutableListOf<Estudante>()


    val simpatico = Estudante("Fulano", 8.0, 70.0)
    simpatico.registrarEstudante("Atividade1")
    simpatico.registrarEstudante("Atividade2")
    simpatico.registrarEstudante("Atividade3")

    println("Nova média ${"%2f". format(simpatico.media)}")
    println("Atividades: ${simpatico.listaAtividades}")

}
