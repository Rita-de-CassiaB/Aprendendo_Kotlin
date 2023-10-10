import javax.swing.JOptionPane

fun main() {
    val kibase: Int = JOptionPane.showInputDialog("Insira o ki (força) base de um Sayajin"). toInt()

    exibeMensagem( "Seu Ki atual é ${kibase}")
    exibeMensagem( "Seu ki após a tranformação para SSJ é ${transfSSJ(kibase)}")
    exibeMensagem( "Seu ki após a tranformação para SSJ2 é ${transfSSJ2(kibase)}")
    exibeMensagem( "Seu ki após a tranformação para SSJ3 é ${transfSSJ3(kibase)}")
    exibeMensagem( "Seu ki após a tranformação para God é ${transfGod(kibase)}")
}

fun transfSSJ (kibase: Int): Int {
    return  kibase * 50
}

fun transfSSJ2(kibase: Int): Int {
    return kibase * 100
}

fun transfSSJ3(kibase: Int): Int {
    return kibase * 200
}

fun transfGod(kibase: Int): Int {
    return kibase * 500
}