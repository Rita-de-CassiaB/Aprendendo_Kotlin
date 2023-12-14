package app

import DadosRepositorios
import LoginRepositorio
import Usuario
import com.github.britooo.looca.api.core.Looca
import java.util.concurrent.TimeUnit
import javax.swing.JOptionPane

open class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            Conexao.criarTabelas()

            val looca = Looca()
            val login = Usuario()
            val dadoslogin = LoginRepositorio()

            login.email = JOptionPane.showInputDialog("Digite o seu email:").toString()
            login.senha = JOptionPane.showInputDialog("Digite a sua senha:").toString()

            dadoslogin.iniciar()
            if (dadoslogin.validarLogin(login)) {
                JOptionPane.showMessageDialog(null, dadoslogin.comprimentar(login))

                var fk_empresa = dadoslogin.verificarEmpresa(login)
                var listaDeMaquinas = dadoslogin.mostrarMaquina(fk_empresa)
                var id_maquina =
                    JOptionPane.showInputDialog("Digite o ID da máquina que você deseja monitorar:\n\r $listaDeMaquinas")
                        .toInt()

                val repositorio = DadosRepositorios()
                repositorio.iniciar()

                JOptionPane.showConfirmDialog(null, "O monitoramento irá inicializar agora!")
                while (true) {
                    //CAPTURA DE PROCESSOS
                    val novoProcesso = repositorio.capturarDadosP(looca)
                    repositorio.cadastrarProcesso(novoProcesso, id_maquina, fk_empresa)

                    // CAPTURA DE JANELAS
                    val novaJanela = repositorio.capturarDadosJ(looca)
                    repositorio.cadastrarJanela(novaJanela, id_maquina, fk_empresa)

                    //CAPTURA DE REDE
                    val novaRede = repositorio.capturarDadosR(looca)
                    repositorio.cadastrarRede(novaRede, id_maquina, fk_empresa)

                    TimeUnit.SECONDS.sleep(60)
                }
            } else {
                JOptionPane.showMessageDialog(
                    null, """
                Não conseguimos validar seu login dentro da nossa plataforma, caso você ache que isso é um erro, por favor, entre em contato conosco!
                """.trimIndent()
                )
            }
        }
    }
}
