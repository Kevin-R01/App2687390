package com.KevinR01.app2687390

class condicionales{

    fun main(){
        print("digite su nombre")
        var nombre= readLine();
        print("digite su apellido")
        var apellido=readLine();
        print("digite su edad")
        var edad:Int=readLine()!!.toInt();
        var sumar:Int=edad+10;

        println("en 10 años ${nombre} ${apellido} tendra ${sumar} años");





        print("digite su primer numero")
        var num1:Int=readLine()!!.toInt();
        print("digite su segundo numero")
        var num2:Int=readLine()!!.toInt();

        if(num1>num2){
            println("su numero mayor es $num1")

        }
        else if(num1==num2){
            println("los numeros son iguales")

        }
        else{
            println("es numero menor es $num2")
        }




        var aleatorio=(0..50).random()
        when(aleatorio){

            0-> println("no hay coincidencias")
            in 1..10->println("hay 10 coincidencias")
            in 20..50->println("hay muchas coincidencias")

        }




        print("cual fue el valor de su compra")
        var venta:Int=readLine()!!.toInt();
        if(venta>=50000){
            var aleatorio(1..4).random()
        }
        if(aleatorio==1){
            var descuento:Int(venta*10)/100
            var valorFinal:int=venta-descuento
            print("has sacado la bola roja y has obtenido el 10% en tu compra")
        }
        if(aleatorio==2){
            var descuento:Int(venta*30)/100
            var valorFinal:int=venta-descuento
            print("has sacado la bola azul y has obtenido el 30% en tu compra")

        }
        if(aleatorio==3){
            var descuento:Int(venta*50)/100
            var valorFinal:int=venta-descuento
            print("has sacado la bola amarilla y has obtenido el 50% en tu compra")
        }
        if(aleatorio==4){

            print("has sacado la bola blaca, se lleva la compra gratis")
        }
        else{
            print("la compra fue menor a 50.000 y no obtuvo la promocion")
        }

    }
}
