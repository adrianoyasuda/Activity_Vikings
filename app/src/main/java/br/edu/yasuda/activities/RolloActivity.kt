package br.edu.yasuda.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rollo.*

class RolloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rollo)

        tv_RolloPath.text = if(savedInstanceState == null){
            intent.extras.getString("nome")
        }
        else{
            savedInstanceState.getString("nome")
        }

        val ref = "Você chegou através da Janela: Rollo"

        tv_Rollof.setOnClickListener{
            telaRagnar(ref)
        }
    }
    private fun telaRagnar(b:String){
        val bundle = Bundle()
        bundle.putString("nome",b)

        val intent = Intent(this, RagnarActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}
