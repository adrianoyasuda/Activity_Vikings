package br.edu.yasuda.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val txtHello = findViewById<TextView>(R.id.txt_Hello)
        txt_Hello.text = "Mudou"

        bt_Click.setOnClickListener {
            abreSegundaTela()
        }

        img_imagem.setOnClickListener{
            abreSegundaTela()
        }

        img_imagem.setOnLongClickListener{
            cliqueLongo()
        }


    }

    private fun cliqueLongo(): Boolean {
        Toast.makeText(this, "Toque Longo",Toast.LENGTH_SHORT).show()
        return true
    }


    private fun abreSegundaTela() {

        val bundle = Bundle()
        bundle.putString("nome","Yasuda")



        Toast.makeText(this,"Abriu segunda Tela",Toast.LENGTH_SHORT).show()
        val intent = Intent (this, OtherActivity::class.java)
        startActivity(intent)


    }

}
