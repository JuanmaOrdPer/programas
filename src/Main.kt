//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Introduzca una palabra")
    var palabra1 = readln()
    println("Introduce otra palabra")
    var palabra2 = readln()
    println("Las palabras $palabra1 y $palabra2 con un anagrama? = " + anagrama(palabra1,palabra2))


}
fun anagrama( palabra1:String, palabra2: String): Boolean{
    var reves = palabra1.reversed() //esta funcion la saque de https://www.develou.com/funcion-reversed-en-kotlin/
    return  (reves==palabra2)
}