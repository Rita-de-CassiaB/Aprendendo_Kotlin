import java.time.LocalDate
import javax.swing.JOptionPane

fun main() {
    var professor1 = Professor()
    professor1.nome = "Carlos Mariano"
    professor1.email = "Mariano.Carlos@fatec.sp.gov"
    professor1.especialidade = "Arquitetura Computacional"
    professor1.dataNascimento = LocalDate.of(1998, 12, 10)

    val aluno1 = Aluno()
    aluno1.nome = "Maria Fernanda"
    aluno1.email = "Alves.Maria@fatec.sp.gov"
    aluno1.matricula = "03291065"
    aluno1.dataNascimento = LocalDate.of(2000,6,20)

    val aluno2 = Aluno()
    aluno2.nome = "Rafael Pellegrini"
    aluno2.email = "Pellegrini.Rafael@fatec.gov"
    aluno2.matricula = "03291082"
    aluno2.dataNascimento = LocalDate.of(2002,2,28)

    val disciplina1 = Disciplina()
    disciplina1.nomeDisciplina = "Arquitetura Computacional"
    disciplina1.anoSemestre = "2029/1"

    JOptionPane.showMessageDialog(null, professor1.exibirInformacoes())

    JOptionPane.showMessageDialog(null, aluno1.exibirInformacoes())
    JOptionPane.showMessageDialog(null, aluno2.exibirInformacoes())

    disciplina1.professor = professor1
    disciplina1.adicionarAluno(aluno1)
    disciplina1.adicionarAluno(aluno2)

    JOptionPane.showMessageDialog(null, disciplina1.detalhes())
}