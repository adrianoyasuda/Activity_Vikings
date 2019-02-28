package br.edu.yasuda.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        bt2_Segunda.text = if(savedInstanceState == null)
            intent.extras.getString("nome")
        else
            savedInstanceState.getString("nome")

        bt2_Segunda.setOnClickListener{bt2_Segunda.text = "CLICOU AQUI"}

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("nome", bt2_Segunda.text.toString())
    }

}
