fun main() {
    repetirComFor()
}

fun repetirComWhile() {
    var contador = 0
    while (contador < 7) {
        exibeMensagem("Eu amo mamão")
        contador++
    }
}


fun repetirComFor() {
    /*for (i in 1..7) { // 1,2,3,4,5,6,7
        exibeMensagem("Eu amo mamão")
    }*/
/*
    for (contador in 1..7) { // 1,2,3,4,5,6,7
        exibeMensagem("Eu amo mamão")
    }*/

    for (contador in 0..6) { // 0,1,2,3,4,5,6
        exibeMensagem("Eu amo mamão")
    }
}