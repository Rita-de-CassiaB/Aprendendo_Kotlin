import javax.swing.JOptionPane
import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate
import javax.swing.JOptionPane.*

fun main() {


    val dataSource = BasicDataSource() //estabelecendo a conexão
    dataSource.driverClassName = "org.h2.Driver" // classe driver de banco
    dataSource.url = "jdbc:h2:mem:sptech" // banco em memoria
    dataSource.username = "sa"//Realizando login padrão
    dataSource.password = ""
    val jdbcTemplate = JdbcTemplate(dataSource) //Criando o objeto que permite essa interação com o banco

    for (m in 1..2) {
        val musica = Musica()
        musica.interprete = showInputDialog(null, "Informe o intérprete da música")
        musica.acessosSpotify = showInputDialog(null, "Informe o acesso da musica").toInt()
        showMessageDialog(
            null,
            "A musica cantada por ${musica.interprete} teve ${musica.acessosSpotify} acesos"
        )

        val encerrado =
            showInputDialog(null, "O acesso ao spotify foi encerrado? \n Digite 1 para sim ou 2 para não")

        musica.acessoEncerrado = encerrado == "1"


    jdbcTemplate.execute(
        """ CREATE TABLE Musicas(
            id INT GENERATED BY DEFAULT AS IDENTITY primary key,
            interprete varchar(50),
            acessosSpotify INT,
            acessoEncerrado BOOLEAN
            )
            """
    ) //Execução no SQL

    val inserindoDados = jdbcTemplate.update(
        """
        insert into Musicas (interprete, acessosSpotify, acessoEncerrado) values 
        '${musica.interprete}', ${musica.acessosSpotify}, ${musica.acessoEncerrado})
    """
    )
    println("$inserindoDados")
}
}