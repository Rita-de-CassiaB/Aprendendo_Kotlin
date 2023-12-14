package Agregação

import javax.swing.JOptionPane

fun main() {
    val turma1 = Turma()
    turma1.nome = "SIS1"

    val aluno1 = Aluno()
    aluno1.nome = "Aninha"
    aluno1.matricula = "03231065"
    turma1.adicionarAluno(aluno1)

    val aluno2 = Aluno()
    aluno2.nome = "Carlos"
    aluno2.matricula = "03231032"
    turma1.adicionarAluno(aluno2)

    val aluno3 = Aluno()
    aluno3.nome = "Rafael"
    aluno3.matricula = "03231033"
    turma1.adicionarAluno(aluno3)

    val aluno4 = Aluno()
    aluno4.nome = "Marie"
    aluno4.matricula = "03231035"
    turma1.adicionarAluno(aluno4)

    val aluno5 = Aluno()
    aluno4.nome = "Marina"
    aluno4.matricula = "03231085"
    turma1.adicionarAluno(aluno5)

    JOptionPane.showMessageDialog(null, turma1.descTurma(turma1))

    for (i in 0.. 4) {
        JOptionPane.showMessageDialog(null, turma1.getAluno(i, turma1))
    }
}