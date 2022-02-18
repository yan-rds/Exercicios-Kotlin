package orientacaoAObjetos.listaUm.exercicioUm

fun main(){
    val bola = Bola(20.0, "amarelo", "marca cara", 23.0)
    val bola2 = Bola(13.0, "roxo", "adidas", 11.2)
    println(bola)
    println(bola.marca)
    bola.marca = "Marca Barata"
    println(bola)
    println(bola.marca)
    bola.cor = bola2.cor
    println(bola)
    println(bola.cor)
}