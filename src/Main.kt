//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

   println("¿Está balanceada? " + balanceada("{a + b [c] * (2x2)}}}}"))
    println("¿Está balanceada? " + balanceada("{ [ a * ( c + d ) ] - 5 }"))
    println("¿Está balanceada? " + balanceada("{ a * ( c + d ) ] - 5 }"))
    println("¿Está balanceada? " + balanceada("{a^4 + (((ax4)}"))
    println("¿Está balanceada? " + balanceada("{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }"))
    println("¿Está balanceada? " + balanceada("{{{{{{(}}}}}}"))
    println("¿Está balanceada? " + balanceada("(a"))



}

fun balanceada(str: String):Boolean {
    val simbolos = mapOf("{" to "}" ,"[" to "]","(" to ")")
    val lista = mutableListOf<String>()


    str.forEach {
        val simbolo = it.toString()
        val apertura = simbolos.containsKey(simbolo)

        if (apertura) {
            lista.add(simbolo)
        } else if (simbolos.containsValue(simbolo)) {
            if (lista.isEmpty()) {
                return false
            }
            val ultimoSimbolo = lista.removeAt(lista.size - 1)
            if (simbolos[ultimoSimbolo] != simbolo) {
                return false
            }
        }
    }
    return lista.isEmpty()
}

