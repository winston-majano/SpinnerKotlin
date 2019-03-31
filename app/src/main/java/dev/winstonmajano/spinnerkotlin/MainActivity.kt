package dev.winstonmajano.spinnerkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //creamos una lista con las opreaciones a realizar
        val lista = arrayOf("sumar","restar","multiplicar","dividir")

        //creamos nuestro adaptador y le pasamos nuestra lista
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista)

        //seteamos el adaptador a nuestro spinner
        spinner.adapter = adaptador1


        //hacemos la funcionalizada del boton calcular
        btn1.setOnClickListener{

            when(spinner.selectedItem.toString()){
                "sumar" -> tv1.text = "Resultado: ${edt1.text.toString().toDouble() + edt2.text.toString().toDouble()}"
                "restar" -> tv1.text = "Resultado: ${edt1.text.toString().toDouble() - edt2.text.toString().toDouble()}"
                "multiplicar" -> tv1.text = "Resultado: ${edt1.text.toString().toDouble() * edt2.text.toString().toDouble()}"
                "dividir" -> tv1.text = "Resultado: ${edt1.text.toString().toDouble() / edt2.text.toString().toDouble()}"
            }
        }

    }
}
