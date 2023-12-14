import java.time.LocalDate
import javax.swing.JOptionPane

fun main() {

    var agencia1 = AgenciaBancaria()
    agencia1.nome = "Itau"

    var gerente1 = Gerente()
    gerente1.nome = "Rita de Cássia"
    gerente1.agencia = agencia1.nome
    gerente1.email = "Rita.barbosa@gmail.com"
    gerente1.dataNascimento = LocalDate.of( 2004, 6, 10)

    var cliente1 = Cliente()
    cliente1.nome = "Paulo"
    cliente1.email = "Paulo.Cafasso@gmail.com"
    cliente1.numeroConta = "9901-5"
    cliente1.dataNascimento = LocalDate.of(2000, 10, 8)


    var cliente2 = Cliente()
    cliente2.nome = "Giovanna"
    cliente2.email = "Giovanna.Avila@gmail.com"
    cliente2.numeroConta = "9601-4"
    cliente2.dataNascimento = LocalDate.of(2002, 12, 26)


    JOptionPane.showMessageDialog(null, gerente1.exibirInformacoes())
    JOptionPane.showMessageDialog(null, cliente1.exibirInformacoes())
    JOptionPane.showMessageDialog(null, cliente2.exibirInformacoes())


    agencia1.gerente = gerente1
    agencia1.adicionarCliente(cliente1)
    agencia1.adicionarCliente(cliente2)
    JOptionPane.showMessageDialog(null, agencia1.detalhes())
}

