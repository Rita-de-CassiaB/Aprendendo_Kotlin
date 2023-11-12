class CachorroRaça: Cachorro() {

    override fun getFatorDigestao(): Double {
        return 0.5
    }

    override fun correAoVerMoto(): Boolean {
        return true
    }

    override fun getPrecoMedio (): Double {
        return 2000.00
    }

}