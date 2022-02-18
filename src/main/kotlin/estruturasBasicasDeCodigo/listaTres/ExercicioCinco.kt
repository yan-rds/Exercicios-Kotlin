package estruturasBasicasDeCodigo.listaTres

import estruturasBasicasDeCodigo.listaUm.capturarDados

fun main(){
    val numero = capturarDados("Insira um número inteiro entre 1 e 7").nextInt()
    identificaDia(numero)

}

fun identificaDia(numero:Int){
    when (numero){
        1 -> println("1 - Domingo")
        2 -> println("2 - Segunda-Feira")
        3 -> println("3 - Terça-Feira")
        4 -> println("4 - Quarta-Feira")
        5 -> println("5 - Quinta-Feira")
        6 -> println("6 - Sexta-Feira")
        7 -> println("7 - Sábado")
        else -> println("Tem que ser de 1 a 7")
    }

}