import java.util.Scanner
import javax.swing.JOptionPane

fun main() {
    val sn = Scanner(System.`in`)


    var confirmacao0: Int = JOptionPane.showInputDialog(null,"Seja bem vindo, deseja cadastrar?\"+\n" +
            "            1 - Sim, continuar \n" +
            "            2 - Não").toInt()


    if (confirmacao0 == 1){

            print("Digite o nome da empresa: \n")
            val empresa = sn.next()
            print("Digite o CNPJ: \n")
            val cnpj = sn.next()
            print("Digite a sua senha de acesso: \n")
            val senha = sn.next()

            println(
                "Confirme as informações\n" +
                        "Empresa: $empresa\n" +
                        "CNPJ: $cnpj\n" +
                        "Senha de Acesso $senha\n"
            )
        }

            print("Digite o seu nome: \n")
            val nome = sn.next()
            print("Digite seu sobrenome: \n")
            val sobrenome = sn.next()
            print("Digite seu CPF: \n")
            val cpf = sn.next()
            print("Digite seu email corporativo: \n")
            val ecorporativo = sn.next()
            print("Digite seu cargo: \n")
            val cargo = sn.next()
            print("Digite seu departamento: \n")
            val departamento = sn.next()

            println(
                "Confirme suas informações\n" +
                        "Nome Completo: $nome\n $sobrenome\n" +
                        "CPF: $cpf\n" +
                        "Email Corporativo: $ecorporativo\n" +
                        "Cargo: $cargo\n" +
                        "Departamento: $departamento"
            )
        }
