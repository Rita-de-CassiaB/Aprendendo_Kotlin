package Agregação

class Turma {
    var nome:String = ""
    var alunos = mutableListOf<Aluno>()

    fun adicionarAluno(aluno:Aluno){
        alunos.add(aluno)
    }

    fun descTurma (turma:Turma):String{
        var mensagem:String = """
            Nome da turma: ${turma.nome}
            Quantidade de alunos: ${turma.alunos.size}
        """.trimIndent()
        return mensagem
    }

    fun getAluno(posicao:Int,turma:Turma):String{
        var mensagem:String = """
            Nome da Turma: ${turma.nome}
            Nome do aluno: ${turma.alunos[posicao].nome}
            Matricula: ${alunos[posicao].matricula}
        """.trimIndent()
        return mensagem
    }
}