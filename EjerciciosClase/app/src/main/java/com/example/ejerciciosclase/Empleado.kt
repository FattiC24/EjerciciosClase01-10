package com.example.ejerciciosclase

class Empleado (var nombre:String, var sueldo:Double, var area:String, var cargo:String,var worktime:Int) {
    fun sueldo() {
        if (sueldo < 0) {
            println("No se permiten sueldos negativos")
        } else if (area.isEmpty() || cargo.isEmpty()) {
            println("Rellene todos los campos")
        }
        else{
            var SueldoExtra:Int = 25*(worktime/5)
            var SueldoTotal = SueldoExtra + sueldo

            println("Nombre $nombre, tiene $worktime a'os de trabajar, su sueldo base es $sueldo y el total por a'os trabjados es $SueldoTotal")

        }
    }
}