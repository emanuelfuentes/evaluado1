package me.nelsoncastro.pdm0119_labo4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.text.Layout
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    fun fetchEditText(v: EditText): String = if (v.text.isEmpty()) "N/A" else v.text.toString()


    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)


        sendbutton.setOnClickListener {

            val senderjson: String = """
            |{
            |"username":"${fetchEditText(eusuario)}"

            """.trimMargin()

            val sendIntent = Intent(this, ViewerActivity::class.java)
            sendIntent.putExtra("username",fetchEditText(eusuario))
            sendIntent.putExtra("email",fetchEditText(ecorreo))
            sendIntent.putExtra("password",fetchEditText(ePassw))
            sendIntent.putExtra("edad",fetchEditText(eEdad))
            startActivity(sendIntent)

        }
    }

}
