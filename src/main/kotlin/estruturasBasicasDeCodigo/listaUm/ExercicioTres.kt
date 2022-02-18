package estruturasBasicasDeCodigo.listaUm

import java.util.*


    fun main(){
        val leitor = Scanner(System.`in`)
        println("Conversor de metros em centímetros")
        val metros:Double = leitor.nextDouble()
        println("$metros metros equivale a ${conversor(metros)} centímetros")
    }

    fun conversor(metros:Double):Double{
        val centimetros:Double = metros * 100
        return centimetros
    }