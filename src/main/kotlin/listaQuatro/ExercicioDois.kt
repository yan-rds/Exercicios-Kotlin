package listaQuatro

import listaUm.capturarDados
import java.lang.RuntimeException

fun main() {
    val litros = capturarDados("Insira a quantidade de litros de combustível").nextDouble()
    val tipo = capturarDados("A-Álcool\nG-Gasolina").next()
    println("O valor total será ${calculaPreco(litros, tipo)}")

}

fun calculaPreco(litros: Double, tipo: String):Double {
    val total = when (tipo) {
        "A" -> alcool(litros)
        "G" -> gasolina(litros)
        else -> throw RuntimeException("Utilize A ou G")
    }
    return total

}

fun gasolina(litros: Double): Double {
    val preco = 2.50
    val total = litros * preco
    val desconto = if (litros <= 20)
        litros * 0.04
    else
        litros * 0.06

    return total * desconto

}

fun alcool(litros: Double): Double {
    val preco = 1.90
    val total = litros * preco
    val desconto = if (litros <= 20)
        litros * 0.03
    else
        litros * 0.05

    return total * desconto

}