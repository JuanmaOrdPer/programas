//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
val atleta1 = arrayOf("correr", "saltar", "correr", "saltar", "correr")
val pista = "_|_|_"
    competicion(atleta1, pista)

}

fun competicion(atleta: Array<String>, pista: String){
    val mapa = mapOf("correr" to "_", "pista" to "|")
    var carrera = mutableListOf<String>()
    for (suelo in  pista) {
        carrera.add(suelo.toString())
    }

}






