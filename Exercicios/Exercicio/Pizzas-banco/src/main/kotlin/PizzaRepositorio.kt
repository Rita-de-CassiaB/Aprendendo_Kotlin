import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate

/* insert, delete, select, update
* Tudo que envolve banco, acesso a pizza*/

class PizzaRepositorio {

    lateinit var jdbcTemplate: JdbcTemplate

    fun iniciar(){
        // São usadas as exclamações por conta do? dentro da classe Conexao dentro da var jdbc Template
        jdbcTemplate = Conexao.jdbcTemplate!!
    }

    fun cadastrar(novaPizza: Pizza){
        jdbcTemplate.update("""
            insert into pizza (sabor, preco, quantidade) values
            ('${novaPizza.sabor}', ${novaPizza.preco}, ${novaPizza.quantidade})
        """.trimIndent())
    }
    fun getUltimoCodigo():Int{
        // queryForObject -> usamos para retornar uma e somente uma linha
        // Int::class.java -> indica que o resultado será convertido num objeto do tipo Int
        //::class.java -> Sempre que mencionamos uma classe, fazemos assim
        val ultimoCodigo = jdbcTemplate.queryForObject("""
            select max(codigo) from pizza
        """, Int::class.java
        )
        return ultimoCodigo
    }

    fun vender(codigo:Int):Boolean{
        val atualizados = jdbcTemplate.update(
        """
            update pizza set quantidade = quantidade -1 where codigo = $codigo and quantidade > 0
                    """)
        return atualizados == 1
    }


    fun recuperar(codigo: Int):Pizza{
        val pizza = jdbcTemplate.queryForObject("""
            select * from pizza where codigo = $codigo
        """, BeanPropertyRowMapper(Pizza::class.java))
        return pizza
    }

    fun alterarpreco(codigo:Int, preco: Double):Boolean{
        val atualizados = jdbcTemplate.update(
            """
            update pizza set preco = $preco where codigo = $codigo
                    """)
        return atualizados == 1
    }
}