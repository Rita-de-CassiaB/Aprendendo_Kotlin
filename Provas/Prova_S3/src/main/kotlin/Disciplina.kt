class Disciplina {
    var nomeDisciplina: String = ""
    var anoSemestre: String = ""
    var professor = Professor()
    var alunos = mutableListOf<Aluno>()

    fun adicionarAluno(aluno: Aluno){
        this.alunos.add(aluno)
    }

    fun detalhes():String{
        return """
            Nome: $nomeDisciplina
            Ano/Semestre: $anoSemestre
            Professor: ${professor.nome}
            Quantidade de alunos: ${alunos.size}
        """.trimIndent()
    }
}