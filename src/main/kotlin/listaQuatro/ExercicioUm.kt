package listaQuatro

import listaUm.capturarDados

fun main(){
    val salarioHora = capturarDados("Informe seu salário hora").nextDouble()
    val horasTrabalhadas = capturarDados("Informe as horas trabalhadas").nextDouble()
    simulaHolerite(salarioHora, horasTrabalhadas)
}

fun simulaHolerite(salarioHora:Double, horasTrabalhadas:Double){
    val salarioBruto = salarioHora*horasTrabalhadas
    val imposto = calculaIr(salarioBruto).first
    val porcentagem = calculaIr(salarioBruto).second
    val inss = (salarioBruto * 0.1)
    val fgts = (salarioBruto * 0.11)
    val totalDescontos = imposto + inss
    val salarioLiquido = salarioBruto - totalDescontos

    println(imposto)
    println(porcentagem)

    println("Salário Bruto: ($salarioHora * $horasTrabalhadas)\t: R$ $salarioBruto")
    println("(-) IR ($porcentagem%)\t\t\t\t\t: R$ $imposto")
    println("(-) INSS (10%)\t\t\t\t\t: R& $inss")
    println("FGTS (11%)\t\t\t\t\t\t: R$ $fgts")
    println("Total de descontos\t\t\t\t: R$ $totalDescontos")
    println("Salário Liquido\t\t\t\t\t: R$ $salarioLiquido")
}

fun calculaIr(salarioBruto:Double): Pair<Double, Int> {
    val (valorImposto, porcentagem) = when{
        salarioBruto <= 900 -> salarioBruto * 0 to 0
        salarioBruto > 900 && salarioBruto <= 1500 -> salarioBruto * 0.05 to 5
        salarioBruto > 1500 && salarioBruto <= 2500 -> salarioBruto * 0.1 to 10
        else -> salarioBruto * 0.2 to 20
    }

    return Pair(valorImposto, porcentagem)

}



