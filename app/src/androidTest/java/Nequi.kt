import java.util.*

class Nequi {
    private val validPhoneNumber = "1234567890"
    private val validPin = "1234"
    private var saldoDisponible = 4500

    fun iniciar() {
        println("Bienvenido a Nequi ")
        var intentos = 2

        while (intentos > 0) {
            println("Ingresa tu número de celular:")
            val phoneNumber = readLine()

            println("Ingresa tu clave de 4 dígitos:")
            val pin = readLine()

            if (phoneNumber == validPhoneNumber && pin == validPin) {
                println("¡Bienvenido! Has ingresado exitosamente.")
                mostrarSaldo()

                do {
                    mostrarMenu()
                } while (realizarAccion())
            } else {
                intentos--
                println("Parece que tus datos de acceso no son correctos.")
                if (intentos > 0) {
                    println("Tienes $intentos intentos más.")
                } else {
                    println(" has alcanzado el máximo número de intentos.")
                }
            }
        }
    }

    private fun mostrarSaldo() {
        println("Tu saldo disponible es: $saldoDisponible")
    }

    private fun mostrarMenu() {
        println("----------------------")
        println("1 Sacar")
        println("2 Envía")
        println("3 Recarga")
        println("4 Salir")
        println("                             ")
    }

    private fun realizarAccion(): Boolean {
        val opcion = readLine()?.toIntOrNull() ?: return false

        when (opcion) {
            1 -> sacar()
            2 -> enviarDinero()
            3 -> recargar()
            4 -> return false
            else -> println("Opción no válida. Por favor, intenta de nuevo.")
        }

        return true
    }

    private fun sacar() {
        println("Selecciona una opción:")
        println("1. Cajero")
        println("2. Punto físico")
        val opcion = readLine()?.toIntOrNull() ?: return

        if (saldoDisponible < 2000) {
            println("No te alcanza para hacer el retiro.")
        } else {
            println("Confirma el valor a retirar:")
            val valorRetiro = readLine()?.toIntOrNull() ?: return

            if (valorRetiro <= saldoDisponible) {
                saldoDisponible -= valorRetiro
                val codigoRetiro = generarCodigoRetiro()
                println("Retiro exitoso. Código de retiro: $codigoRetiro")
            } else {
                println("No tienes suficiente saldo para hacer el retiro.")
            }
        }
    }

    private fun generarCodigoRetiro(): Int {
        val random = Random()
        return 100_000 + random.nextInt(900_000)
    }

    private fun enviarDinero() {
        println("Ingresa el número de celular para enviar el dinero:")
        val phoneNumber = readLine()

        println("Ingresa el valor a enviar:")
        val valorEnviar = readLine()?.toIntOrNull() ?: return

        if (valorEnviar <= saldoDisponible) {
            saldoDisponible -= valorEnviar
            println("Envío exitoso. Has enviado $valorEnviar a $phoneNumber.")
        } else {
            println("No tienes suficiente saldo .")
        }
    }

    private fun recargar() {
        println("Ingresa el valor a recargar:")
        val valorRecarga = readLine()?.toIntOrNull() ?: return

        println("¿Confirmas la recarga de $valorRecarga? (si/n)")
        val confirmacion = readLine()

        if (confirmacion?.equals("si", ignoreCase = true) == true) {
            saldoDisponible += valorRecarga
            println("Recarga exitosa. Nuevo saldo disponible: $saldoDisponible")
        } else {
            println("Recarga cancelada.")

        }
    }
}

fun main() {
    val nequi = Nequi()
    nequi.iniciar()
}
