package br.com.caiocv18.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.com.caiocv18.R
import br.com.caiocv18.dao.AlunoDAO
import br.com.caiocv18.model.Aluno

class FormularioAlunoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_aluno)

        val dao = AlunoDAO()

        val campoNome = findViewById<EditText>(R.id.activity_formulario_aluno_nome)
        val campoTelefone = findViewById<EditText>(R.id.activity_formulario_aluno_telefone)
        val campoEmail = findViewById<EditText>(R.id.activity_formulario_aluno_email)

        val botaoSalvar = findViewById<Button>(R.id.activity_formulario_aluno_botao_salvar)

        botaoSalvar.setOnClickListener(object: View.OnClickListener {

            override fun onClick(view: View?){
                val nome : String = campoNome.text.toString()
                val telefone : String = campoTelefone.text.toString()
                val email : String = campoEmail.text.toString()

                val alunoCriado = Aluno(nome, telefone, email)

                dao.salva(alunoCriado)

                Toast.makeText(this@FormularioAlunoActivity, alunoCriado.toString(), Toast.LENGTH_SHORT).show();
                /*val intent = Intent(this@FormularioAlunoActivity, ListaAlunosActivity::class.java)
                startActivity(intent)*/
            }
        })
    }
}