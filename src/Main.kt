//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

   /* println("¿Está balanceada? " + balanceada("{a + b [c] * (2x2)}}}}"))
    println("¿Está balanceada? " + balanceada("{ [ a * ( c + d ) ] - 5 }"))
    println("¿Está balanceada? " + balanceada("{ a * ( c + d ) ] - 5 }"))
    println("¿Está balanceada? " + balanceada("{a^4 + (((ax4)}"))
    println("¿Está balanceada? " + balanceada("{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }"))
    println("¿Está balanceada? " + balanceada("{{{{{{(}}}}}}"))
    println("¿Está balanceada? " + balanceada("(a"))*/
    val str = "FF"
   println(balanceada(str))


}

fun balanceada(str: String):Boolean {
    var balanceado= false
    var i=0
    val valor = arrayOf<Char>()

   while (i < valor.size){
       i++
       var j = valor.size
       while(j >=0)
           if (valor.get(i)==valor.get(j))
               balanceado=true
       j--
   }

return balanceado
}

