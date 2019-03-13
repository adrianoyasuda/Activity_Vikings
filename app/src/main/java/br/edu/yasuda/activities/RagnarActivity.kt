package br.edu.yasuda.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_ragnar.*

class RagnarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ragnar)

        tv_Ragnarpath.text = if(savedInstanceState == null){
            intent.extras.getString("nome")
        }
        else{
            savedInstanceState.getString("nome")
        }
        val ref = "Você chegou através da Janela: Ragnar"

        tv_Ragnarf1.setOnClickListener{
            telaLagertha(ref)
        }
        tv_ragnarf2.setOnClickListener{
            telaBjorn(ref)
        }
        tv_Ragnarf3.setOnClickListener{
            telaFloki(ref)
        }

    }


    private fun telaLagertha(b:String){
        val bundle = Bundle()
        bundle.putString("nome",b)

        val intent = Intent(this, LagerthaActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun telaBjorn(b:String){
        val bundle = Bundle()
        bundle.putString("nome",b)

        val intent = Intent(this, BjornActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun telaFloki(b:String){
        val bundle = Bundle()
        bundle.putString("nome",b)

        val intent = Intent(this, FlokiActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}
