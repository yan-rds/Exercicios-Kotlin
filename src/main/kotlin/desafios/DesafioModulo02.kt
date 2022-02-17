package desafios

import listaUm.capturarDados
import java.lang.RuntimeException

fun main(){
    menu()
}

fun menu(){
    val listaDeFuncionarios = HashMap<String, String>()
    var repetir= true
    while (repetir) {
        println("Gerenciamento de funcionários")
        println("1 - Cadastrar Funcionário")
        println("2 - Exibir a lista de todos os funcionários cadastrados")
        println("3 - Remover um funcionário")
        val escolha = capturarDados("4 - Encerrar o programa").nextInt()

        when (escolha) {
            1 -> listaDeFuncionarios.putAll(cadastrarFuncionario(listaDeFuncionarios))
            2 -> exibirFuncionarios(listaDeFuncionarios)
            3 -> removerFuncionario(listaDeFuncionarios)
            4 -> repetir = false
        }
    }
}

fun cadastrarFuncionario(listaDeFuncionarios:HashMap<String, String>):HashMap<String, String>{
    val cpf = capturarDados("Insira o CPF do funcionário").next()
    verificarCpf(listaDeFuncionarios, cpf)
    val dados = capturarDados("Insira nome, telefone e email").nextLine()
    listaDeFuncionarios[cpf] = dados
    return listaDeFuncionarios
}

fun exibirFuncionarios(listaDeFuncionarios: HashMap<String, String>){
    for (funcionario in listaDeFuncionarios){
        println(funcionario.value)
    }
}

fun removerFuncionario(listaDeFuncionarios: HashMap<String, String>){
    val cpf = capturarDados("Digite o CPF do funcionário que deseja remover").next()
    if (listaDeFuncionarios[cpf] == null){
        throw RuntimeException("Este CPF não foi cadastrado")
    }
    listaDeFuncionarios.remove(cpf)
}

fun verificarCpf(listaDeFuncionarios: HashMap<String, String>, cpf:String){
    if (listaDeFuncionarios.containsKey(cpf)){
        throw RuntimeException("CPF já cadastrado")
    }
}