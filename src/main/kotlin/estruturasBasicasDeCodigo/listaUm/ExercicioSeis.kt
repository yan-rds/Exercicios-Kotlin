package estruturasBasicasDeCodigo.listaUm

import java.util.*
import kotlin.collections.ArrayList

fun capturarDados(mensagem:String) : Scanner{
    println(mensagem)
    return Scanner(System.`in`)

}

fun main(){
    println("Demonstrativo de pagamento")
    val salarioHora = capturarDados("Informe seu salário por hora").nextDouble()
    val horasTrabalhadas = capturarDados("Informe a quantidade de horas trabalhadas").nextDouble()
    val valores = calcularSalario(salarioHora, horasTrabalhadas)
    println("Salario bruto: R$ %.2f".format(valores[0]))
    println("Desconto INSS: R$ %.2f".format(valores[1]))
    println("Desconto sindicato: R$ %.2f".format(valores[2]))
    println("Salario liquido R$ %.2f".format(valores[3]))

}

fun calcularSalario(salarioHora:Double, horasTrabalhadas:Double) : ArrayList<Double>{
    val salarioBruto:Double = salarioHora*horasTrabalhadas
    val descontoINSS = salarioBruto * 0.08
    val sindicato = salarioBruto * 0.05
    val impostoDeRenda = salarioBruto * 0.11
    val salarioLiquido = salarioBruto - descontoINSS - sindicato - impostoDeRenda
    val valores:ArrayList<Double> = ArrayList()
    valores.add(salarioBruto)
    valores.add(descontoINSS)
    valores.add(sindicato)
    valores.add(salarioLiquido)
    return valores

}