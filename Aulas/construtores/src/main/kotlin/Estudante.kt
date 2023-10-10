
//Classe com um construtor

class Estudante(
    var nome: String,
    var media: Double,
    var frequencia: Double
) {
    var listaAtividades = mutableListOf<String>()

    fun aprovou():Boolean{
        return media>=6 && frequencia >= 75.0
    }


    fun registrarEstudante(nomeAtividade: String){
        if (listaAtividades.size < 3) {
            media + 0.15
            listaAtividades.add(nomeAtividade)
        }

    }


}
 /* Na classe estudante, crie um método "regitrarAtividade()"
 ele NÃO tem retorno e recebe um argumento do tipo texto ao ser invocado,
 ele PODE aumentar a média em 0,15 (para isso, mude a média para var)
 Ele aumenta a média só nas 3 primeiras vezes que é invocado.
 Da quarta vez em diante ele simplesmente não faz nada.

 No appEstudante teste esse novo método criando um novo estudante e invocando esse método 4x
  e exibindo sua nova média

 Vamos melhorar o registroAtividade():
 Toda vez que for invocado ele usa o valor do argumento
 para alimentar uma lista (portanto, crie um novo atributo "listaAtividades"
 que so aceita texto).

 Porém, o valor do argumento só entra na lista se houve pontuação, ou seja,
 se os 0.15 foram adicionados à media
 No AppEstudantes invoque esse método no mesmo objeto que usou antes para exibir o conteúdo deessa lista
 após fazer os registros das 4 atividades
  */