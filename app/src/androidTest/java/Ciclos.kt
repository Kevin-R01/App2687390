package com.KevinR01.app2687390

class Ciclos {



}


fun main(){
var con1:Int=0
    var con2:Int=0
    var numero: Int=0
    var acum: Int=0
    var acumulador:Int=0


    while (numero>=0) {
        print("digite su numero")
        var cont: Int = readLine()!!.toInt();
        if (cont <= 0) {
            continue

        } else {
            var fu:Int=cont%2
            if(fu==0) {
                println("el numero es par $numero")
                con1 = con1 + 1
                acumulador = acumulador + cont
            }
            else {
                println("el numero no es par$numero")
                con2 = con2 + 1
                acum = acum + cont
            }
        }


    }
    if (con1!=0 || con2!=0) {
        print("Hay esta cantidad de numero pares: $con1 y suman  $acumulador")
        println()
        print("Hay esa cantidad de numeros impares:  $con2 y suman  $acum")

    }
    else{

        print("Sin numero negativos o 0")
    }
}


