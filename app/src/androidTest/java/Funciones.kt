class Funciones {
}

/*funciones personalizadas*/

fun funPerimetroCirculo() {
    println("Digite el radio del círculo:")
    val radio: Double = readLine()!!.toDouble()
    val perimetro: Double = 2 * 3.1415 * radio
    println("El perímetro del círculo es $perimetro")
}

fun funAreaCirculo() {
    println("Digite el radio del círculo:")
    val radio: Double = readLine()!!.toDouble()
    val area: Double = 3.1415 * (radio * radio)
    println("El área del círculo es $area")
}

fun funPerimetroTriangulo(lado1: Double, lado2: Double, lado3: Double): Double {
    return lado1 + lado2 + lado3
}

fun funAreaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun esEquilatero(lado1: Double, lado2: Double, lado3: Double): Boolean {
    return lado1 == lado2 && lado2 == lado3
}

fun esIsoceles(lado1: Double, lado2: Double, lado3: Double): Boolean {
    return lado1 == lado2 || lado1 == lado3 || lado2 == lado3
}
fun main() {


    var numero: Int = 1

    while (numero == 1) {
        println("Digite: \n1. Perímetro círculo \n2. Área círculo \n3. Perímetro del triángulo \n4. Área del triángulo")
        val cont: Int = readLine()!!.toInt()

        if (cont == 1) {
            funPerimetroCirculo()
        } else if (cont == 2) {
            funAreaCirculo()
        } else if (cont == 3) {
            println("Digite el lado 1 del triángulo:")
            val lado1: Double = readLine()!!.toDouble()
            println("Digite el lado 2 del triángulo:")
            val lado2: Double = readLine()!!.toDouble()
            println("Digite el lado 3 del triángulo:")
            val lado3: Double = readLine()!!.toDouble()

            if (esEquilatero(lado1, lado2, lado3)) {
                val perimetro = 3 * lado1
                println("El perímetro del triángulo equilátero es $perimetro")
            } else if (esIsoceles(lado1, lado2, lado3)) {
                val perimetro = funPerimetroTriangulo(lado1, lado2, lado3)
                println("El perímetro del triángulo isósceles es $perimetro")
            } else {
                val perimetro = funPerimetroTriangulo(lado1, lado2, lado3)
                println("El perímetro del triángulo escaleno es $perimetro")
            }
        } else if (cont == 4) {
            println("Digite la base del triángulo:")
            val base: Double = readLine()!!.toDouble()
            println("Digite la altura del triángulo:")
            val altura: Double = readLine()!!.toDouble()
            val area = funAreaTriangulo(base, altura)
            println("El área del triángulo es $area")
        }

        println("¿Desea ejecutar otra vez? 1 si o 2 salir")
        numero = readLine()!!.toInt()
    }
}



















