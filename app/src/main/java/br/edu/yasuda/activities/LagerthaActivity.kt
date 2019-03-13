package br.edu.yasuda.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lagertha.*

class LagerthaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lagertha)

        tv_LagerthaPath.text = if(savedInstanceState == null){
            intent.extras.getString("nome")
        }
        else{
            savedInstanceState.getString("nome")
        }

        val ref = "Você chegou neste personagem através do personagem: Lagertha"

        tv_Lagethaf1.setOnClickListener{
            telaBjorn(ref)
        }
        tv_Lagethaf2.setOnClickListener{
            telaRagnar(ref)
        }
    }

    private fun telaBjorn(b:String){
        val bundle = Bundle()
        bundle.putString("nome",b)

        val intent = Intent(this, BjornActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun telaRagnar(b:String){
        val bundle = Bundle()
        bundle.putString("nome",b)

        val intent = Intent(this, RagnarActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}
