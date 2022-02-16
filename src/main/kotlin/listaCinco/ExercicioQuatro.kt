package listaCinco

import listaUm.capturarDados

fun main(){
    val qtdNumeros = capturarDados("Quantos números irá inserir?").nextInt()
    var contador = qtdNumeros
    var soma = 0.0
    while (contador > 0){
        soma += capturarDados("").nextDouble()
        contador--
    }
    println("A média desses números e ${soma / qtdNumeros}")
}