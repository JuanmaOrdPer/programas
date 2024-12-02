class Agenda(var agenda: Array<Contacto?> = arrayOfNulls(5)){




    fun agregarContacto (contacto: Contacto): Boolean{
        if (contacto != null){
            if (buscar(contacto.nombre)){
                println("El contacto con ese nombre ya existe")
                return false
            }
        }
        for (i in agenda.indices){
            if (agenda[i] == null){
                agenda[i] = contacto
                println("Se ha añadido el contacto")
                return true
            }
        }
        println("No hay espacio en la agenda")
        return false
    }

    fun listarContactos(){
        if(agenda.isEmpty()){
            println("No hay contactos en la agenda")
        }
        for (contacto in agenda){
            println(contacto.toString())
        }
    }



    fun buscar(nombre: String): Boolean{
        for (contacto in agenda){
            if (contacto?.nombre == nombre) {
                return true
            }
        }
        return false
    }

    fun eliminarContacto(nombre: String) {
        for (i in agenda.indices) {
            if (agenda[i]?.nombre == nombre) {
                agenda[i] = null
                println("Se ha eliminado el contacto")
            } else {
                println("No se ha eliminado el contacto")
            }
        }
    }

    fun contactosDisponibles() {
        if (agenda.last() != null) {
            "Hay 0 contactos libres"
        } else {
            val hueco = agenda.isNullOrEmpty()
            println("Hay $hueco disponbles en la agenda")

        }
    }

    fun agendaLlena() {
        if (agenda.isNotEmpty()) {
            println("La agenda está llena")
        }
        println("Aun se pueden meter contactos")
    }


}


