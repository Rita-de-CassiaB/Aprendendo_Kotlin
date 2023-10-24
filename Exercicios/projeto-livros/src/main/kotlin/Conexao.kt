import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.JdbcTemplate

object Conexao {
    var JdbcTemplate:JdbcTemplate? = null

        get() {
            if (field == null){
                val dataSource = BasicDataSource()
                dataSource.driverClassName = "org.h2.Driver"
                dataSource.url = "jdbc:h2:mem:livraria"
                dataSource.username = "sa"
                dataSource.password = ""

                val novoJdbcTemplate = JdbcTemplate(dataSource)
                field = novoJdbcTemplate
            }
            return field
        }

    fun criarTabelas(){
        JdbcTemplate!!.execute(
            """
               create table livros (
               id int GENERATED BY DEFAULT AS IDENTITY primary key,
               titulo varchar(50),
               autor varchar(30),
               dataCriacao varchar(50)
               );
           """
        )
    }}
