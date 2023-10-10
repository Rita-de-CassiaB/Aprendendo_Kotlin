import javax.swing.JOptionPane

fun main() {

    //    Criando um objeto do tipo conexao e invocamos o metodo criar tabelas
    Conexao.criarTabelas()
    val repositorio = PizzaRepositorio()
    repositorio.iniciar()

    while (true){
        val cadastrar = JOptionPane.showInputDialog(
            "Quer cadastrar uma nova pizza?S para sim ou qualquer coisa para não")
        if (cadastrar.uppercase() != "S"){
            break
        }

        val novaPizza  = Pizza()
        novaPizza.sabor = JOptionPane.showInputDialog("Qual sabor?")
        novaPizza.preco = JOptionPane.showInputDialog("Qual preço?").toDouble()
        novaPizza.quantidade = JOptionPane.showInputDialog("Qual a quantidade?").toInt()

        repositorio.cadastrar(novaPizza)
    }
    var ultimo = repositorio.getUltimoCodigo()
    var codigo: Int = JOptionPane.showInputDialog(
        "Qual pizza quer vender? Digite de 1 a $ultimo"
    ).toInt()

    if (codigo >= 1 && codigo <= ultimo){
        val vendeu = repositorio.vender(codigo)
        val pizza = repositorio.recuperar(codigo)
        if (vendeu){
            JOptionPane.showMessageDialog(null,"Quantidade da pizza de ${pizza.sabor} atualizada para ${pizza.quantidade}")
        }else{
            JOptionPane.showMessageDialog(null, "A pizza de ${pizza.sabor} está zerada")
        }
    }
        ultimo = repositorio.getUltimoCodigo()
        codigo = JOptionPane.showInputDialog(
            "De qual pizza quer alterar o valor? Digite de 1 a $ultimo"
         ).toInt()

    if (codigo >= 1 && codigo <= ultimo){
        var novopreco = JOptionPane.showInputDialog("Insira o valor da pizza").toDouble()
        val alterar = repositorio.alterarpreco(codigo, novopreco)
        val pizzaAtualizada = repositorio.recuperar(codigo)
        val mensagem = if (alterar)
            JOptionPane.showMessageDialog(null,"O valor da pizza de ${pizzaAtualizada.sabor} foi atualizada para ${pizzaAtualizada.preco}")
         else JOptionPane.showMessageDialog(null, "pizza não encontrada")

    }

}