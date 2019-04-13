package me.nelsoncastro.pdm0119_labo4

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_viewer.*
import org.json.JSONObject

class ViewerActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewer)




        vusuario.text = intent.getStringExtra("username")
        vcorreo.text = intent.getStringExtra("email")
        vpassword.text = intent.getStringExtra("password")
        vedad.text = intent.getStringExtra("edad")




        sharebutton.setOnClickListener {
            val factura =
                    "Resumen del Boton" +

                        "Cliente: ${vusuario.text}"+
                        "Correo: ${vcorreo.text}"

                    """""".trimMargin()

            val shareIntent = Intent()
            shareIntent.action = Intent.ACTION_SEND
            shareIntent.putExtra(Intent.EXTRA_TEXT, factura)
            shareIntent.type= "text/plain"
            if (shareIntent.resolveActivity(packageManager) != null) startActivity(shareIntent)
        }
    }

}