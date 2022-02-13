package listaUm

import java.util.*

fun main() {

    val leitor = Scanner(System.`in`)
    val salarioHora: Double
    val horasTrabalhadas: Double

    println("Digite seu salário por hora")
    salarioHora = leitor.nextDouble()
    println("Digite as horas trabalhadas este mês")
    horasTrabalhadas = leitor.nextDouble()
    println("Seu salário será de R$${calculaSalario(salarioHora, horasTrabalhadas)}")

}

fun calculaSalario(salarioHora: Double, horasTrabalhadas: Double): Double {

    return salarioHora * horasTrabalhadas

}