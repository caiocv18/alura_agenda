package br.com.caiocv18.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.caiocv18.R
import br.com.caiocv18.dao.AlunoDAO
import br.com.caiocv18.model.Aluno
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*
import kotlin.collections.ArrayList

class ListaAlunosActivity : AppCompatActivity() {
    private var dao = AlunoDAO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_alunos)

        setTitle("Lista de Alunos")

        configuraNovoAluno()

    }

    override fun onResume() {
        super.onResume()

        configuraLista()
    }

    private fun configuraNovoAluno(){
        val botaoNovoAluno = findViewById<FloatingActionButton>(R.id.activity_lista_alunos_fab_novo_aluno)

        botaoNovoAluno.setOnClickListener(object: View.OnClickListener {

            override fun onClick(view: View){

                abreFormularioActivity()
            }
        })
    }

    private fun abreFormularioActivity(){
        val intent = Intent(this@ListaAlunosActivity, FormularioAlunoActivity::class.java )
        startActivity(intent)
    }

    private fun configuraLista(){
        val listaDeAlunos : ListView = findViewById(R.id.activity_lista_de_alunos_listview)
        listaDeAlunos.setAdapter(ArrayAdapter(this, android.R.layout.simple_list_item_1,dao.todos()))
    }
}