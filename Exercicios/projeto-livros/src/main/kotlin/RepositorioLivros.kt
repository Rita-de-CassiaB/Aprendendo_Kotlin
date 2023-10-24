import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate

class RepositorioLivros{

    lateinit var JdbcTemplate: JdbcTemplate

    fun iniciar(){
        JdbcTemplate = Conexao.JdbcTemplate!!
    }

    fun adicionarLivro(novoLivro:Livro){
        JdbcTemplate.update("""
            insert into livros (titulo, autor, dataCriacao) values ('${novoLivro.titulo}', '${novoLivro.autor}', '${novoLivro.dataCriacao}')
            
        """)
    }

    fun buscarCodUl():Int{
        var ultimo = JdbcTemplate.queryForObject(""" 
            select max(id) from livros            
                """,Int::class.java
        )
        return ultimo}

    fun buscarCodPr():Int{
        var primeiro = JdbcTemplate.queryForObject(""" 
            select min(id) from livros            
                """,Int::class.java
        )
        return  primeiro
    }

    fun consultarLivro(codigo: Int):Livro{
        val  livro = JdbcTemplate.queryForObject("""
        select * from livros where id = $codigo
        """, BeanPropertyRowMapper (Livro::class.java)
        )
        return livro
    }
}