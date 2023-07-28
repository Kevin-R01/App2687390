import kotlin.random.Random

fun main() {
    println("¡Bienvenido a Craps!")

    do {
        println("Presiona enter para tirar los dados...")
        readLine()

        val dado1 = tirarDado()
        val dado2 = tirarDado()
        val totalDados = dado1 + dado2

        println("Resultado del lanzamiento: $dado1 y $dado2 (Total: $totalDados)")

        when (totalDados) {
            2, 12 -> println("Has ganado con dos o doce en los dados!")
            3 -> println("Has ganado con un total de tres en los dados!")
            11 -> println("Has ganado con un total de once en los dados!")
            7 -> println("Has ganado con un total de siete en los dados!")
            else -> println("no has ganado,perdiste")
        }

        println("¿Quieres jugar otra vez? (si/no)")
    } while (readLine()?.toLowerCase() == "si")
}

fun tirarDado(): Int {
    return Random.nextInt(1, 7)
}
