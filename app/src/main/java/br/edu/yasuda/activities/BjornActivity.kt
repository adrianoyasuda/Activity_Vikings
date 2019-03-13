package br.edu.yasuda.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bjorn.*

class BjornActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjorn)

        tv_BjornPath.text = if(savedInstanceState == null){
            intent.extras.getString("nome")
        }
        else{
            savedInstanceState.getString("nome")
        }

        val ref = "Você chegou neste personagem através do personagem: Bjorn"

        tv_Bjornf1.setOnClickListener{
            telaLagertha(ref)
        }
        tv_Bjornf2.setOnClickListener{
            telaRagnar(ref)
        }
        tv_Bjornf3.setOnClickListener{
            telaFloki(ref)
        }
        tv_Bjornf4.setOnClickListener{
            telaAthelstan(ref)
        }
    }

    private fun telaLagertha(b:String){
        val bundle = Bundle()
        bundle.putString("nome",b)

        val intent = Intent(this, LagerthaActivity::class.java)
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

    private fun telaFloki(b:String){
        val bundle = Bundle()
        bundle.putString("nome",b)

        val intent = Intent(this, FlokiActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun telaAthelstan(b:String){
        val bundle = Bundle()
        bundle.putString("nome",b)

        val intent = Intent(this, AthelstanActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}
