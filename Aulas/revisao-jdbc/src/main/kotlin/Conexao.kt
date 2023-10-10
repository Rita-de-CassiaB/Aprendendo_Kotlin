import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.JdbcTemplate

class Conexao {

    fun conectar(): JdbcTemplate {
        val dataSource = BasicDataSource()
        // Classe di driver de banco/
        dataSource.driverClassName = "org.h2.Driver"

        //Como chegar no banco de dados, estamos usando o banco em memória, ele nasce e morre com a aplicação
        dataSource.url = "jdbc:h2:mem:sptech" //banco em memória

        //login (por padrão, H2, é "sa")
        dataSource.username = "sa"
        dataSource.password = ""
    return JdbcTemplate()
}