package br.com.caiocv18.dao

import br.com.caiocv18.model.Aluno

class AlunoDAO {

    companion object{
        private val alunos = ArrayList<Aluno>()
    }

    fun salva(aluno : Aluno) {
        alunos.add(aluno)
    }

    fun todos() : List<Aluno>{
        return ArrayList(alunos)
    }

}
