package br.com.caiocv18.model

class Aluno(nome: String, telefone: String, email: String) {
    val nome = "$nome\n".also(::println)
    val telefone = "$telefone\n".also(::println)
    val email = "$email\n".also(::println)

    override fun toString(): String {
        return nome
    }
}
