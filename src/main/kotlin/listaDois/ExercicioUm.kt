package listaDois

import java.util.*

fun capturaDados(mensagem:String): Scanner {
    println(mensagem)
    return Scanner(System.`in`)
}

fun main(){
    val limite = 50
    val quilos = capturaDados("Insira a quantidade total de quilos pescados").nextDouble()
    val excesso = quilos - limite
    println("Você pescou %.1f quilos além do limite, e pagará uma multa de R$ %.2f"
        .format(excesso, calculaMulta(excesso)))

}

fun calculaMulta(excesso:Double):Double{
    val multa = 4
    return excesso * multa
}