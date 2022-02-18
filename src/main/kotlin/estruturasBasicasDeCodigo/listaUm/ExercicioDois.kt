package estruturasBasicasDeCodigo.listaUm

import java.util.*
import kotlin.collections.ArrayList


    fun main(){
        val notas:ArrayList<Double> = ArrayList()
        val scan = Scanner(System.`in`)
        var contador = 1

        while (contador <= 4) {
            notas.add(scan.nextDouble())
            contador++
        }

        println("Sua média é de ${getMedia(notas)}")
    }

    fun getMedia(notas:ArrayList<Double>) : Double{
        var total = 0.0
        for (nota in notas)
            total += nota
        val media = total / 4;
        return media
    }



