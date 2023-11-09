class CarroPobre : Carro() {

    override fun getReacaoPessoas(): String {
        return "Nossa, esse carro $fabricante $modelo é mó paia"
    }

    override fun getVelocidadeAceleracao(): Double {
        return 2.3
    }

    override fun getVelocidadeFrear(): Double {
        return 5.4
    }

    override fun velocidadeNormalizarMax(): Double {
        return 100.0
    }
}