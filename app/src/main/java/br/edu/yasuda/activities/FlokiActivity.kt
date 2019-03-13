package br.edu.yasuda.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_floki.*

class FlokiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floki)

        tv_FlokiPath.text = if(savedInstanceState == null){
            intent.extras.getString("nome")
        }
        else{
            savedInstanceState.getString("nome")
        }

        val ref = "Você chegou neste personagem através do personagem: Floki"

        tv_Flokif.setOnClickListener{
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
