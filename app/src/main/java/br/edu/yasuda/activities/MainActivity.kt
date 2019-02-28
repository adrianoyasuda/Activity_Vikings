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
            abreSegundaTela()
        }

        img_Ragnar.setOnClickListener{
            telaRagnar()
        }

    }

    private fun telaRagnar() {
        val bundle = Bundle()
        bundle.putString("ragnar","Principal")

        val intent = Intent(this, RagnarActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun abreSegundaTela() {

        val bundle = Bundle()
        bundle.putString("nome","Yasuda")

        //Toast.makeText(this,"Abriu segunda Tela",Toast.LENGTH_SHORT).show()
        val intent = Intent (this, OtherActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)

    }

}
