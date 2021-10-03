package com.example.ejerciciosclase

public class Dato (var numero:Int) {
    fun lanzar(){
    var const1 = 1
    var finalnumber = 0


    if(numero >=1 && numero <=6){
        var random = (1..40).random()
        finalnumber = random
        println("El numero es $finalnumber")
    }
    else{
        finalnumber = const1
        println("Su numero es mayor que 6, entonces $finalnumber")
    }
}
}