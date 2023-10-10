fun main() {
    val herois = listOf("Batman", "Mulher Maravilha", "Thor")

    println(herois)

    println("Primeiro: ${herois[0]}")
    println("Terceiro: ${herois[2]}")
    println("Último: ${herois[herois.size-1]}")

    println("Primeiro: ${herois.first()}")
    println("Último: ${herois.last()}")

    //herois.add("Saitama") ListoO cria uma lista imutavel ou somente leitura, nenhum elemento pode entrar ou sair delas

    val paises = mutableListOf("Brasil", "México", "Peru")

    paises.add("Colombia")

    println(paises)

    paises.remove("México") //Remove pelo VALOR
    paises.removeAt(0) //Remove pela POSIÇÂO
    println(paises)

    paises.addAll(listOf("Cubá", "Panamá", "Panamá"))//incluindo mais de um elemento por vez

    println(paises)

    paises.remove("Panamá")
    println(paises)

    paises.add(2,"Brasil")
    println(paises)

    paises.set(3,"EUA")

    // A mutableListOf se pode incluir ou retirar elementos - em caso de dúvida crie uma listOf por precaução
    println(paises)

    println("Os países estão vazios? ${paises.isEmpty()}")
    println("Há países? ${paises.isNotEmpty()}")

    // isEmpty - está vazio isNotEmpty - Não está vazio

    paises.sort()
    println(paises)

    val numeros =  mutableListOf(222, 59, 6,
        -98, -2, 14, 33, 9, 1)
    numeros.sort()
    println(numeros)

    // short() ordena a lista usando uma ordem natural (alfabética, numérica, data)

    numeros.reverse()
    println(numeros)

    val bla = mutableListOf(2, 8, 9, 42, 3, 589)
    bla.sortDescending()
    println(bla)

    val bichos = listOf("gato", "rato", "cachorro")
    println(bichos.sorted())
    println(bichos)

    paises.forEach {
        println("Ja fui no pais $it")
    }

    // it é o objeto de iteration, ou seja, cada país tera uma frase especifica, de acordo com a quantidade de elementos "Para todos", lembrando que se começa as posições no 0

    paises.forEachIndexed { indice, pais ->
        println("O país na posição $indice é $pais")
    }
    val paisesFiltrados = paises.filter {it.contains("m")}
    println(paisesFiltrados)

    val paisespequenos = paises.filter { it.length < 6 }
     println(paisespequenos)

}