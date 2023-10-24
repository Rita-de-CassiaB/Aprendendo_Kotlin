import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.queryForObject

class RepositorioMusicas {

    lateinit var JdbcTemplate: JdbcTemplate

    fun iniciar(){
        JdbcTemplate = Conexao.JdbcTemplate!!
    }

    fun adicionarMusica(novaMusica:Musica){

        JdbcTemplate.update("""
            insert into musicas (titulo, artista, dataCriacao) values ('${novaMusica.titulo}', '${novaMusica.artista}', '${novaMusica.dataCriacao}')
        """)
    }

    fun buscarIdPri():Int{
        val primeiro = JdbcTemplate.queryForObject("""
            select min(id) from musicas
        """,Int :: class.java
        )
        return primeiro
    }

    fun buscarIdUlt():Int{
        val ultimo = JdbcTemplate.queryForObject("""
            select max(id) from musicas
        """,Int :: class.java
        )
        return ultimo
    }


    fun consultarMusica(id:Int):Musica{
        val musica = JdbcTemplate.queryForObject("""
            select * from musicas where id = $id
        """, BeanPropertyRowMapper (Musica::class.java)
        )
        return musica
    }

    fun excluirId(id:Int): Int{
            val retorno = JdbcTemplate.update("""
                delete from musicas where id = $id
            """)
        return retorno








    }

}