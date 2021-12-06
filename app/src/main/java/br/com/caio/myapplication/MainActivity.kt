package br.com.caio.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import br.com.caio.myapplication.R.id.ButtonMain
import br.com.caio.myapplication.R.id.TextMain
import kotlin.random.Random

class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(this.supportActionBar != null
        ) this.supportActionBar!!.hide()

        val button: Button = findViewById(ButtonMain)
            button.setOnClickListener{
                button.text = random().toString()
        }
        val txt: TextView = findViewById(TextMain)
            txt.setOnClickListener{
                txt.text = random().toString()
        }

    }
    private fun random(): Int {
        return Random.nextInt (50) + 1
    }
}
