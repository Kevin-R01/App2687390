class Arrays {

}

fun main(){

    val pets= arrayOf("dog","cat","canary")
    print(pets.contentToString())
    println()
    println(pets[1])
    pets[2]=("parrows")
    println()
    print(pets.contentToString())

    for (element in pets){
        println(" la mascota es  $element")
    }
    for ((index, element) in pets.withIndex()){
        println(" la mascota en la posicion $index es  $element")
    }

    val cosas = mutableListOf("trumpet", "piano", "violin")

    val instrumentos= listOf<String>("trumpet", "piano", "violin")
    println(instrumentos)

    println(cosas[1])
    cosas[2]=("guita")
    println(cosas)


    //reto
    //1.como obtener el primer y ultimo elemento de una lista

    val instrum = mutableListOf("trumpet", "piano", "violin")
    println(instrum.first())
    println(instrum.last())
    //2.como agregar elementos a una lista mutable
    instrum.add("trompeta")
    println(instrum)
    //3.como quitar elementos de una lista mutable
    instrum.removeAt(3)
    println(instrum)
    //4.como buscar elementos en una lista mutable
    val elementoBuscado = "piano"
    if (elementoBuscado in instrum) {
        println("$elementoBuscado está en la lista.")
    } else {
        println("$elementoBuscado no está en la lista.")
    }
    //5.que pasa si quitas un elemento que no existe
    //da error porque no existe
    //6.como quitar elementos de una lista atraves del index
      //instrum.removeAt(3)
    //7. como eliminar la lista completa
    instrum.clear()
    println(instrum)





}