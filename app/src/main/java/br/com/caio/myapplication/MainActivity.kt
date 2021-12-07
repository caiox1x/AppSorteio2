package br.com.caio.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import br.com.caio.myapplication.R.id.buttonMain
import br.com.caio.myapplication.R.id.textMain
import java.lang.Math.random
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (this.supportActionBar != null) {
            this.supportActionBar!!.hide()
        }
        val button: Button = findViewById(R.id.buttonMain)
        val texto: TextView = findViewById(R.id.textMain)


        button.setOnClickListener(this)
        texto.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v?.id == buttonMain || v?.id == textMain) {
            val texto: TextView = findViewById(R.id.textMain)
            texto.text = random().toString()

        }
    }

    fun random(): Int {
        return Random.nextInt (999) + 1
    }


}

