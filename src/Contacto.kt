class Contacto (val nombre: String, val telefono: String) {


    override fun toString(): String {
        if (this.nombre == "") {
            return ""
        } else {
            return "Nombre= $nombre - Telefono= $telefono"
        }
    }
}