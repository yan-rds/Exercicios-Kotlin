package estruturasBasicasDeCodigo.listaTres

import estruturasBasicasDeCodigo.listaUm.capturarDados

fun main(){
    val a = capturarDados("Primeira nota").nextDouble()
    val b = capturarDados("Segunda nota").nextDouble()
    val media = calculaMedia(a, b)
    verificaAprovacao(media)

}

fun calculaMedia(a:Double, b:Double):Double{
    return (a + b) /2
}

fun verificaAprovacao(media:Double){
    if (media >= 7 && media < 10)
        println("Aprovado")
    else if (media == 10.0)
        println("Aprovado com distinção")
    else
        println("Reprovado")
}