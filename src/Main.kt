//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
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
