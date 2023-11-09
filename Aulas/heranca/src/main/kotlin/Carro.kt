// open indica que se pode herdar os itens dela
open class Carro {
    lateinit var fabricante: String
    lateinit var modelo: String
    private var ligado: Boolean = false
    // Impedindo que o carro seja ligado ou desligado sem chamar as funções ligar() e desligar()
    protected var velocidade: Double = 0.0
    // Impedindo que o carro aumente ou diminua de velocidade sem chamar as funções acelerar() frear()

    fun ligar(){
        ligado = true
    }

    fun getDescricao():String {
        return """
            Fabricante: $fabricante. Modelo: $modelo
            Está ligado? ${if (ligado) "Sim" else "Não"},
            Velocidade atual: $velocidade km/h
        """.trimIndent()
    }

    open fun getReacaoPessoas(): String {
        return "Olha só, um carro $fabricante $modelo"
    }

    fun desligar(){
        ligado = false
        velocidade = 0.0
    }

    open fun getVelocidadeAceleracao(): Double{
        return 7.5
    }

    fun acelerar(){
        if (!ligado){
            return
        }
        velocidade += getVelocidadeAceleracao()
        normalizarVelocidade()
    }
    // evitando o else -> Se !ligado ele retorna "nada" matando a função, se não, aumenta a velocidade e normaliza-lo

    open fun getVelocidadeFrear(): Double{
        return 10.0
    }

    fun frear(){
        if (!ligado){
            return
        }
        velocidade -= getVelocidadeFrear()
        normalizarVelocidade()
    }
    // evitando o else -> Se !ligado ele retorna "nada" matando a função, se não, diminui a velocidade e normaliza-lo

   open fun velocidadeNormalizarMax(): Double{
       return 140.0
   }

     fun normalizarVelocidade(){
        if (velocidade < 0.0){
            velocidade = 0.0
        }
        if (velocidade >velocidadeNormalizarMax()){
            velocidade = velocidadeNormalizarMax()
        }
    }
}