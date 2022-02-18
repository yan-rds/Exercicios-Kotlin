package estruturasBasicasDeCodigo.listaTres

import estruturasBasicasDeCodigo.listaUm.capturarDados

fun main(){
    val salario = capturarDados("Informe seu salário").nextDouble()
    println("Seu novo salário será ${verificaAumento(salario)}")

}

fun verificaAumento(salario: Double): Double {
    return if (salario <= 280)
        salario * 1.2
    else if (salario > 280 && salario <= 700)
        salario * 1.15
    else if (salario > 700 && salario <= 1500)
        salario * 1.10
    else
        salario * 1.05

}