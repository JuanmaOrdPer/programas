//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var agenda = Agenda()
    var nombre=""
    var telefono =""

    do {
        println("MENÚ")
        println("1. Añadir contacto")
        println("2. Listar contactos")
        println("3. Buscar contacto")
        println("4. Existe contacto")
        println("5. Eliminar contacto")
        println("6. Contactos disponibles")
        println("7. Agenda llena")
        println("8. Salir")
        println("Escribe una de las opciones")
        var opcion = readln().toInt()


        when (opcion) {
            1 -> {
                println("Escribe un nombre")
                nombre = readln()
                println("Escribe un telefono")
                telefono = readln()
                val contacto = Contacto(nombre, telefono)
                agenda.agregarContacto(contacto)
            }

            2 -> agenda.listarContactos()

            3 -> {
                println("Escribe un nombre")
                nombre = readln()
                if(agenda.buscar(nombre)){
                    println(agenda.toString())
                }else{
                    println("No hay contactos que mostrar")
                }
            }

            4 -> {
                println("Escribe un nombre")
                nombre = readln()
                if(agenda.buscar(nombre)){
                    println("Existe el contacto")
                }else{
                    println("No existe el contacto")
                }
            }

            5 -> {
                println("Escribe un nombre")
                nombre = readln()
                agenda.eliminarContacto(nombre)
            }

            6 -> agenda.contactosDisponibles()
            7 -> println("llena")
            8 -> return
            else -> {
                println("Opción incorrecta")
            }
        }
    }while(opcion!=8)



}






