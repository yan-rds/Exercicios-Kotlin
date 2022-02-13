package listaUm

import java.util.*

fun main(){
    val leitor = Scanner(System.`in`)
    println("Conversor de Fahrenheit em Celsius")
    println("Digite a temperatura em ºF")
    val f:Double = leitor.nextDouble()

    println("$f ºF equivale a %.2fºC".format(conversorTemperatura(f)))
}

fun conversorTemperatura(f:Double): Double{
    return (f-32)/1.8
}