class Produto {
    var nome: String =""
        set(value) {
            if (value.length >= 4){
                field = value
            } else if (field.isBlank()){
            return "N/D"
        }}
        return field

    var preco: Double = 0.0
        set(value) {
            if (value >= 0.01){
                field = value
            }
        }

    var brinde: Boolean = false
        set(value) {
            if (value) {
                this.preco =  0.01
            }
            field = value
        }
}
