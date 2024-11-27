//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val atleta1 = arrayOf("correr", "saltar", "correr", "saltar", "correr")
    val pista = "_|_|_"
    println(competicion(atleta1, pista))

    val atleta2= arrayOf("correr", "correr", "correr", "saltar", "correr")
    val pista2  = "_|_|_"
    println(competicion(atleta2, pista2))

    val atleta3= arrayOf("correr", "correr", "saltar", "saltar", "correr")
    val pista3  = "_|_|_"
    println(competicion(atleta3, pista3))

    val atleta4= arrayOf("correr", "correr", "saltar", "saltar", "correr")
    val pista4  = "_|_|_|_"
    println(competicion(atleta4, pista4))




}

fun competicion(atleta: Array<String>, pista: String):Boolean {
    val mapa = mapOf("correr" to "_", "saltar" to "|")
    var carrera = mutableListOf<String>()
    var totalAcciones = atleta.size
    if (pista.length>atleta.size)
        totalAcciones = pista.length


    for (suelo in  pista) {
        carrera.add(suelo.toString())
    }
        var pistaAtleta = ""
        for (i in 0 until totalAcciones){
            pistaAtleta += when {
                i >= carrera.size -> "?"
                i >= atleta.size -> "?"
                else -> {
                    val segmento = carrera[i].toString()
                    val estado = atleta[i]
                    when (estado) {
                        "correr" -> if (segmento.toString() == mapa["correr"]) mapa["correr"] else "/"
                        "saltar" -> if (segmento.toString() == mapa["saltar"]) mapa["saltar"] else "x"
                        else -> "?"
                    }
                }
            }
        }

    print(pistaAtleta + "  ")
    return (pista==pistaAtleta)

}






