fun main() {
    /* Aqui estamos CRIANDO ou INSTANCIANDO um objeto do tipo Heroi
    "faça-se um Heroi! seu nome em memória será "heroi"
     */
    val heroi1 = Heroi()
    println(heroi1.nome)
    println(heroi1.poderes)
    println(heroi1.vida)
    println(heroi1.aposentado)
// Definindo os Atributos de Instância
    heroi1.nome = "Lesgou"
    heroi1.poderes = "Voar, teletransportar e transformação de itens"
    heroi1.vida = 30.5
    println("Você  é o Heroi ${heroi1.nome}")
    println(heroi1.poderes)
    println("Você tem ${heroi1.vida} de vida")
    heroi1.usarPoder()

    val heroi2 = Heroi()
    println(heroi2.nome)
    println(heroi2.poderes)

    heroi2.nome = "Avuador"
    heroi2.poderes = "Andar e Comer Doritos"
    heroi2.usarPoder()

    println("O heroi1 está aposentado? ${heroi1.aposentado}")

    heroi1.aposentar()

    println("O heroi1 está aposentado? ${heroi1.aposentado}")

    println("Quanto de vida o heroi 2 tem? ${heroi2.vida}")
    heroi2.apanhar(5.0)
    println("Quanto de vida o heroi 2 tem? ${heroi2.vida}")
    heroi2.apanhar(15.0)
    println("Quanto de vida o heroi 2 tem? ${heroi2.vida}")
    heroi2.apanhar(33.0)
    println("Quanto de vida o heroi 2 tem? ${heroi2.vida}")

    println("Quanto de vida o herói 1 tem? ${heroi1.vida}")
    heroi1.apanhar(50.0)
    println("Quanto de vida o herói 1 tem? ${heroi1.vida}")






}