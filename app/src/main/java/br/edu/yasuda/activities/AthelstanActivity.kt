package br.edu.yasuda.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_athelstan.*

class AthelstanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_athelstan)

        tv_AthelstanPath.text = if(savedInstanceState == null){
            intent.extras.getString("nome")
        }
        else{
            savedInstanceState.getString("nome")
        }

        val ref = "Você chegou neste personagem através do personagem: Athelstan"

        tv_Atheltanf1.setOnClickListener{
            telaRagnar(ref)
        }
        tv_Atheltanf2.setOnClickListener{

            telaBjorn(ref)
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
