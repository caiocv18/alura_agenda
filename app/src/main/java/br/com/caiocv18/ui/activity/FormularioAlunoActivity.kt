package br.com.caiocv18.ui.activity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.com.caiocv18.R
import br.com.caiocv18.dao.AlunoDAO
import br.com.caiocv18.model.Aluno

class FormularioAlunoActivity : AppCompatActivity() {
    private lateinit var campoNome : EditText
    private lateinit var campoEmail : EditText
    private lateinit var campoTelefone : EditText
    private val dao = AlunoDAO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_aluno)

        setTitle("Novo aluno")
        inicializandoCampos()
        configuraBotaoSalvar()
    }

    private fun inicializandoCampos(){
        campoNome = findViewById(R.id.activity_formulario_aluno_nome)
        campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone)
        campoEmail = findViewById(R.id.activity_formulario_aluno_email)
    }

    private fun criaAluno() : Aluno{
        val nome : String = campoNome.text.toString()
        val telefone : String = campoTelefone.text.toString()
        val email : String = campoEmail.text.toString()

        return Aluno(nome, telefone, email)
    }

    private fun salva(alunoCriado : Aluno, dao : AlunoDAO){
        dao.salva(alunoCriado)
        finish()
    }

    private fun configuraBotaoSalvar(){
        val botaoSalvar = findViewById<Button>(R.id.activity_formulario_aluno_botao_salvar)

        botaoSalvar.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View?){
                var alunoCriado : Aluno = criaAluno()
                salva(alunoCriado, dao)
            }
        })
    }

}