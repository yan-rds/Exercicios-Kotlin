package listaTres

import listaUm.capturarDados

fun main(){
    val a = capturarDados("Primeiro número").nextDouble()
    val b = capturarDados("Segundo número").nextDouble()
    println("O maior número entre $a e $b é ${maiorNumero(a, b)}")
}

fun maiorNumero (a:Double, b:Double):Double = if (a > b) a else b
