package com.example.ejerciciosclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usuario("Fatima", 15.00, 50, 5)
        tablasdemultiplicar(numero = 5)
        Empleado("Fatima", 450.0, "Ingeniera", "asesora", 12).sueldo()
        Dato(4).lanzar()
    }

    fun usuario(nombre: String, pagoxHora: Double, horasLaboradas: Int, horasExtras: Int) {
        var SalarioNormal = (horasLaboradas *pagoxHora)
        var SalarioExtra = (horasExtras * pagoxHora)*2

        var SalarioTotal:Double = (SalarioNormal + SalarioExtra)

        println("Nombre del cliente: $nombre  , su sueldo devengado es: $SalarioNormal, su salario por horas extra es " + " " +
                "de $SalarioExtra y su salario total es $SalarioTotal ")
    }
    fun tablasdemultiplicar(numero:Int){
        val termino:Int = 10 ;

        for (x in 1..10){
            println("$numero x $x = ${numero*x}")
        }
    }
}