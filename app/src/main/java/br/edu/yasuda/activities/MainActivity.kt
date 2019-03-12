package br.edu.yasuda.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img_imagem.setOnClickListener{
            telaLogo()
        }
        img_Ragnar.setOnClickListener{
            telaRagnar()
        }
        img_Lagertha.setOnClickListener{
            telaLagertha()
        }
        img_Rollo.setOnClickListener{
            telaRollo()
        }
        img_Floki.setOnClickListener{
            telaFloki()
        }
        img_Athelstan.setOnClickListener{
            telaAthelstan()
        }
        img_Bjorn.setOnClickListener{
            telaBjorn()
        }
    }

    private fun telaLogo() {
        val bundle = Bundle()
        bundle.putString("nome","Yasuda")

        //Toast.makeText(this,"Abriu segunda Tela",Toast.LENGTH_SHORT).show()
        val intent = Intent (this, OtherActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun telaRagnar() {
        val bundle = Bundle()
        bundle.putString("Ragnar","Principal")

        val intent = Intent(this, RagnarActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun telaLagertha(){
        val bundle = Bundle()
        bundle.putString("Lagertha","Principal para Lagertha")

        val intent = Intent(this, LagerthaActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun telaRollo(){
        val bundle = Bundle()
        bundle.putString("Rollo","Principal para Rollo")

        val intent = Intent(this, RolloActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun telaFloki(){
        val bundle = Bundle()
        bundle.putString("Floki","Principal para Floki")

        val intent = Intent(this, FlokiActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun telaAthelstan(){
        val bundle = Bundle()
        bundle.putString("Atheltan","Principal para Atheltan")

        val intent = Intent(this, AthelstanActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun telaBjorn(){
        val bundle = Bundle()
        bundle.putString("Bjorn","Principal para Bjorn")

        val intent = Intent(this, BjornActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }


}
