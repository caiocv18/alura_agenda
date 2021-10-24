package br.com.caiocv18.model

class Aluno(nome: String, telefone: String, email: String) {
    val nome = "$nome".also(::println)
    val telefone = "$\ntelefone\n".also(::println)
    val email = "$email\n".also(::println)

    override fun toString(): String {
        return nome
    }
}
