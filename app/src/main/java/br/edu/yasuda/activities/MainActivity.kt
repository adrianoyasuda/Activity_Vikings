package br.edu.yasuda.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ref = "Você chegou através da Janela: Tela Principal"


        img_Ragnar.setOnClickListener{
            telaRagnar(ref)
        }
        img_Lagertha.setOnClickListener{
            telaLagertha(ref)
        }
        img_Rollo.setOnClickListener{
            telaRollo(ref)
        }
        img_Floki.setOnClickListener{
            telaFloki(ref)
        }
        img_Athelstan.setOnClickListener{
            telaAthelstan(ref)
        }
        img_Bjorn.setOnClickListener{
            telaBjorn(ref)
        }
    }



    private fun telaRagnar(b:String) {
        val bundle = Bundle()

        bundle.putString("nome",b)

        val intent = Intent(this, RagnarActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun telaLagertha(b:String){
        val bundle = Bundle()
        bundle.putString("nome",b)

        val intent = Intent(this, LagerthaActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun telaRollo(b:String){
        val bundle = Bundle()
        bundle.putString("nome",b)

        val intent = Intent(this, RolloActivity::class.java)
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

    private fun telaBjorn(b:String){
        val bundle = Bundle()
        bundle.putString("nome",b)

        val intent = Intent(this, BjornActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}

//Toast.makeText(this,"Abriu segunda Tela",Toast.LENGTH_SHORT).show()

