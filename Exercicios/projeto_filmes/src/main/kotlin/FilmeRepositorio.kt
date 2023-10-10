import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.queryForObject

class FilmeRepositorio {
    lateinit var JdbcTemplate:JdbcTemplate

    fun iniciar(){
        JdbcTemplate = Conexao.JdbcTemplate!!
    }

    fun buscarCodigo():Int {
        val ultimoCodigo = JdbcTemplate.queryForObject("""
            select max(codigo) from filmes
        """, Int::class.java
        )
        return ultimoCodigo
    }

    fun adicionarFilme(novoFilme:Filme){
        JdbcTemplate.update("""
            insert into filmes(nome, diretor, indicadoOscar, custoProducao) values
            ('${novoFilme.nome}', '${novoFilme.diretor}', ${novoFilme.indicadoOscar}, ${novoFilme.custoProducao})
            
        """)
    }

    fun consultarFilme(codigo: Int): Filme{
        val filme = JdbcTemplate.queryForObject("""
            select * from filmes where codigo = $codigo
        """, BeanPropertyRowMapper
            (Filme::class.java))
     return Filme
    }

    fun excluirFilme(codigo: Int){
        val excluidos = JdbcTemplate.update("""
            de
        """.trimIndent())

    }


}