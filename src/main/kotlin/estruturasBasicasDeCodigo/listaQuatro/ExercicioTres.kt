package estruturasBasicasDeCodigo.listaQuatro

import estruturasBasicasDeCodigo.listaUm.capturarDados
import java.util.stream.Collectors

fun main (){
    analisaRespostas(interrogatorio())

}

fun interrogatorio():ArrayList<Boolean>{
    val respostas:ArrayList<Boolean> = ArrayList()

    respostas.add(capturarDados("Telefonou para a vítima?").nextBoolean())
    respostas.add(capturarDados("Esteve no local do crime?").nextBoolean())
    respostas.add(capturarDados("Mora perto da vítima?").nextBoolean())
    respostas.add(capturarDados("Devia para a vítima?").nextBoolean())
    respostas.add(capturarDados("Já trabalhou com a vítima?").nextBoolean())

    return respostas

}

fun analisaRespostas(respostas:ArrayList<Boolean>){
    val listaFiltrada:List<Boolean> = respostas.stream().filter { it == true }.collect(Collectors.toList())

    when(listaFiltrada.size){
        2 -> println("Suspeita")
        3 -> println("Cumplice")
        4 -> println("Cumplice")
        5 -> println("Assassino")
        else -> println("Inocente")
    }

}