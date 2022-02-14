package listaTres

import listaUm.capturarDados

fun main(){
    val valores = ArrayList<Double>()
    valores.add(capturarDados("Preço do primeiro produto").nextDouble())
    valores.add(capturarDados("Preço do segundo produto").nextDouble())
    valores.add(capturarDados("Preço do terceiro produto").nextDouble())

    println("O produto mais barato é o que custa R$ %.2f".format(descobreOMenor(valores)[0]))

}

fun descobreOMenor(valores:ArrayList<Double>):ArrayList<Double>{
    valores.sort()
    return valores
}