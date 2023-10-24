import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.queryForObject

class FilmeRepositorio {
    lateinit var JdbcTemplate:JdbcTemplate

    fun iniciar(){
        JdbcTemplate = Conexao.JdbcTemplate!!
    }

    fun adicionarFilme(novoFilme:Filme){
        JdbcTemplate.update("""
            insert into filmes(nome, diretor, indicadoOscar, custoProducao) values
            ('${novoFilme.nome}', '${novoFilme.diretor}', ${novoFilme.indicadoOscar}, ${novoFilme.custoProducao})
            
        """)
    }

    fun buscarCodigo():Int {
        val ultimoCodigo = JdbcTemplate.queryForObject("""
           select max(id) from filmes   
                """, Int::class.java
        )
        return ultimoCodigo
    }

    fun consultarFilme(codigo: Int): Filme{
        val filme = JdbcTemplate.queryForObject("""
            select * from filmes where id = $codigo
        """, BeanPropertyRowMapper (Filme::class.java))
     return filme
    }

    fun atualizarFilmes(codigo: Int): Int {
        val excluidos = JdbcTemplate.update("""
            delete from filmes where id = $codigo
        """)
        return excluidos

    }
}