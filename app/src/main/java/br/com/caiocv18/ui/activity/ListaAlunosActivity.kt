package br.com.caiocv18.ui.activity

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import br.com.caiocv18.R
import br.com.caiocv18.dao.AlunoDAO
import br.com.caiocv18.model.Aluno
import java.util.*
import kotlin.collections.ArrayList

class ListaAlunosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_alunos)

        lateinit var dao : AlunoDAO

        setTitle("Lista de Alunos")

        val listaDeAlunos : ListView = findViewById(R.id.activity_lista_de_alunos_listview)
        listaDeAlunos.setAdapter(ArrayAdapter(this, android.R.layout.simple_list_item_1,dao.todos()))

    }
}