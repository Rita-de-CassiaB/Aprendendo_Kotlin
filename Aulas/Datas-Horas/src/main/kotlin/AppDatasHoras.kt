import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Period
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import javax.swing.JOptionPane

// LocalDate -> somente data
// LocaDateTime -> data e hora com milissegundos
fun main() {
    //data atual
     val hoje = LocalDate.now()
     println("1. A data de hoje sem ser convertida é $hoje")

    // data e hora atuais
     val agora = LocalDateTime.now()
     println("2. Agora é $agora")

    // formatando localDate em String no formato dd/MM/yyyy
    // convertendo texto não iso para iso (buscar do usuário e enviar para o banco)
      val hojeBrasil = hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
    println("3. A data de hoje convertida para o usuário é $hojeBrasil")

    // apresentando a data por extenso
      val hojeBrasildata = hoje.format(DateTimeFormatter.ofPattern("EEEE', 'dd' de 'MMMM' de 'yyyy"))
      println("4. Hoje é $hojeBrasildata")

    // pegar do banco e mostrar p usuário
    //convertendo texto em data (se a data etstiver em aaaa-mm-dd formato ISO)
      val dataDoUsuario = "31/12/2000" // poderia ser JOptionPane
      val dataConvertida = LocalDate.parse(dataDoUsuario, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
      println("5. A data convertida para o banco de dados é $dataConvertida")

    // operações com datas
    val amanha = hoje.plusDays(1) //adicionando dias (amanhã é hoje +1)
    println("6. Amanhã será $amanha")

    println("7. Hoje é $hoje")
    val ontem = hoje.minusDays(1) //diminuindo dias (ontem é hoje 1-)
    println("8. Ontem foi $ontem")

    val ha5anos = hoje.minusYears(5) //diminuindo anos
    println("9. 5 anos atrás foi $ha5anos")

    val daquiMeiaHora = agora.plusMinutes(30)
    val ha15segundos = agora.minusSeconds(15)
    println("10. Daqui a meia hora será $daquiMeiaHora")
    println("11. Daqui a 15 segundos será $ha15segundos")

    // A data deve ser inserido AAAA-MM-DD
    // Pegando valor do usuário
    val  nascimentoTexto = "2004-06-08"
    val dataNascimento = LocalDate.parse(nascimentoTexto)
    println("12. A data de nascimento do usuário é $dataNascimento")


println("-------------------------------------------------------------")

    val dataNasc = JOptionPane.showInputDialog("Insira sua data de nascimento")
    println("Exercicio1. A data original é $dataNasc")
    val dataConvertida2 = LocalDate.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
    println("Exercicio1. A data convertida para o banco de dados é $dataConvertida2")

    val anos = ChronoUnit.YEARS.between(dataConvertida2, hoje)
    val meses = ChronoUnit.MONTHS.between(dataConvertida2, hoje)
    val dias = ChronoUnit.DAYS.between(dataConvertida2, hoje)

    println("Exercicio1. Você tem ao total $anos anos, $meses meses e $dias dias de vida")

    val periodo = Period.between(dataConvertida2, hoje)
    val periodoAnos = periodo.years
    val periodoMeses = periodo.months
    val periododias = periodo.days
    println("Exercicio1. Você tem um periodo de vida de $periodoAnos anos, $periodoMeses meses e $periododias dias")


}