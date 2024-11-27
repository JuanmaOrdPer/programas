//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
<<<<<<< HEAD
<<<<<<< HEAD

        for (i in 1 .. 100){
            if (i % 3 == 0 && i % 5 == 0)
                println("triqui")
            else if(i % 5 == 0)
                println("qui")
            else if(i % 3 == 0)
                println("tri")
            else
                println(i)
        }
    }
=======
    println("Introduzca una palabra")
    val palabra1 = readln()
    println("Introduce otra palabra")
    val palabra2 = readln()
    println("Las palabras $palabra1 y $palabra2 con un anagrama? = " + anagrama(palabra1,palabra2))


}
fun anagrama( palabra1:String, palabra2: String): Boolean{
    val reves = palabra1.reversed() //esta funcion la saque de https://www.develou.com/funcion-reversed-en-kotlin/
    return  (reves==palabra2)
}
>>>>>>> 5f426882fe6620670764712b22b31399b99a59e6
=======

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

>>>>>>> 00e38590ef5b47d1e41d5ee4f167c9e2b6931415
