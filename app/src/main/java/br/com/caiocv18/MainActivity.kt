package br.com.caiocv18

import android.app.Activity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alunos : List<String> = ArrayList(Arrays.asList("Alex", "Fran", "Jose","Caio", "Iara"))

        val listaDeAlunos : ListView = findViewById(R.id.activity_main_lista_de_alunos)
        listaDeAlunos.setAdapter(ArrayAdapter(this, android.R.layout.simple_list_item_1,alunos))

    }
}