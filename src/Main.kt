//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println(evaluarJuego(arrayOf(
        arrayOf("X", "O", "X"),
        arrayOf("O", "X", "O"),
        arrayOf("O", "O", "X"))
    ))

    println(evaluarJuego(arrayOf(
        arrayOf("", "O", "X"),
        arrayOf("", "X", "O"),
        arrayOf("", "O", "X"))
    ))

    println(evaluarJuego(arrayOf(
        arrayOf("O", "O", "O"),
        arrayOf("O", "X", "X"),
        arrayOf("O", "X", "X"))
    ))

    println(evaluarJuego(arrayOf(
        arrayOf("X", "O", "X"),
        arrayOf("X", "X", "O"),
        arrayOf("X", "X", "X",))
    ))

    println(evaluarJuego(arrayOf(
        arrayOf("X", "O", "X"),
        arrayOf("X", "O", "O"),
        arrayOf("X", "O", "X",))
    ))

}

private fun evaluarJuego(juego: Array<Array<String>>): String {
    if (juego.size != 3 || juego[0].size != 3 || juego[1].size != 3 || juego[2].size != 3) {
        return "NULL"
    }
    var contarX = 0
    var contarO = 0

    for (fila in juego) {
        for (col in fila) {
            when (col) {
                "X" -> contarX++
                "O" -> contarO++
                "" -> continue
                else -> return "NULL"
            }
        }
    }
    if (contarX > 6 || contarO > 6)
        return "NULL"

    var resultado =""

    for (i in 0..2) {

        if (juego[i][0] == juego[i][1] && juego[i][1] == juego[i][2] && juego[i][0] != "") {
            resultado= juego[i][0]
        }

        if (juego[0][i] == juego[1][i] && juego[1][i] == juego[2][i] && juego[0][i] != "") {
            resultado= juego[0][i]
        }
    }

    if (juego[0][0] == juego[1][1] && juego[1][1] == juego[2][2] && juego[0][0] != "") {
        resultado= juego[0][0]
    }
    if (juego[0][2] == juego[1][1] && juego[1][1] == juego[2][0] && juego[0][2] != "") {
        resultado=  juego[0][2]
    }
    if (contarX == contarO )
        resultado="EMPATE"

    return  resultado
}











