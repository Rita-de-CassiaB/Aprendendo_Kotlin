class CarroLuxo : Carro() {

    override fun getReacaoPessoas(): String {
        //velocidade -= 3.0 // conseguimos acessar velocidade, pois ela é protected
        return "Nooooosaaa! Que carrão esse $fabricante $modelo"
    }

    override fun getVelocidadeAceleracao(): Double {
        return 25.0
    }

    override fun getVelocidadeFrear(): Double {
        return 15.0
    }

    override fun velocidadeNormalizarMax(): Double {
        return 260.0
    }
}