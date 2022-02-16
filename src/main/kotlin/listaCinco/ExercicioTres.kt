package listaCinco

import listaUm.capturarDados

fun main(){
    var contador = 1
    var soma = 0.0

    while (contador <= 5){
        soma +=capturarDados("").nextDouble()
        contador++
    }
    println(soma / 5)
}