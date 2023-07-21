class Auto {
}

fun main() {
    val autos = mutableListOf("chevrolet", "buggati")
    print("digite 1. registar 2. mostrar auto 3. buscar auto 4. modificar auto 5. eliminar auto 6. borrar lista: ")
    var funciones: Int = readLine()!!.toInt()

    when (funciones) {
        1 -> {
            print("digite la marca del carro: ")
            val marca = readLine()
            val revisar = autos.any { it == marca }
            if (revisar) {
                println("No se puede registrar algo que ya existe.")
            } else {
                autos.add(marca.toString())
                println("Se registró el auto exitosamente.")
            }
        }
        2 -> {
            println(autos)
        }
        3 -> {
            print("Digite la marca del carro que desea buscar: ")
            val marca = readLine()
            val revisar = autos.any { it == marca }
            if (revisar) {
                println("El auto que busca es $marca y sí existe.")
            } else {
                println("El auto $marca no existe.")
            }
        }
        4 -> {
            print("Digite la marca del carro que desea modificar: ")
            val marca = readLine()
            val index = autos.indexOfFirst { it == marca }
            if (index != -1) {
                print("Digite la nueva marca del carro: ")
                val nuevaMarca = readLine()
                autos[index] = nuevaMarca.toString()
                println("El auto se modificó exitosamente.")
            }
        }
        5 -> {
            print("Digite la marca del carro que desea eliminar: ")
            val marca = readLine()
            val eliminado = autos.remove(marca)
            if (eliminado) {
                println("El auto se eliminó exitosamente.")
            }
        }
        6 -> {
            autos.clear()
            println("La lista de autos se borró exitosamente.")
        }
    }
}

