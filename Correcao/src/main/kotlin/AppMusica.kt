import javax.swing.JOptionPane
import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate

fun main() {
    //Como chegar no banco de dados, estamos usando o banco em memória, ele nasce e morre com a aplicação
    val dataSource = null
    dataSource.url = "jdbc:h2:mem:musicas" //banco em memória

    //login (por padrão, H2, é "sa")
    dataSource.username = "sa"
    dataSource.password = ""

    //criando o objeto que permite interagir com o banco
    val jdbcTemplate = JdbcTemplate(dataSource)

    //Aqui pedimos para executar uma conexão SQL
    jdbcTemplate.execute ("""
        create table musica (
        id int primary key,
        nome varchar(20) not null
        )
    """)

    //Aqui usamos o "update()", que executa uma instrução DML (Insert, Delete ou Update)
    // ao ser executado, ele retorna um numero inteiro de quantas linhas foram afetadas
    val linhasAfetadas = jdbcTemplate.update("""
        insert into musica (id, nome) values 
        (1, 'aaa'),(2, 'bbb'),(3, 'ccc')
    """)
    println("$linhasAfetadas linhas inseridas")
    //O resultado é uma lista
    // executa uma consulta (select)
    val musicas = jdbcTemplate.queryForList("select * from musica")
    println(musicas)

    // query executa uma consulta(select), o resultado é mapeado em uma lista de objetos
    // do tipo que informamos no BeanPropertyRowMApper
    // val listaMusicas = jdbcTemplate.query()
    val listaMusicas:List<Musica> = jdbcTemplate.query(
        "select * from musica",
        BeanPropertyRowMapper(Musica::class.java)
    )

    listaMusicas.forEach{
        println("Música ${it.id} - ${it.nome}")
    }
}
}