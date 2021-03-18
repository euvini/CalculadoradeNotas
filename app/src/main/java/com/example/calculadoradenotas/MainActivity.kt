package com.example.calculadoradenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val retorno = retorno

        btCalcular.setOnClickListener {
            val  nota_1 = Integer.parseInt(nota_1.text.toString())
            val nota_2 = Integer.parseInt(Nota_2.text.toString())
            val media = (nota_1 + nota_2)/2

            val faltas = Integer.parseInt(Faltas.text.toString())

            if (media >=6 && faltas <=10) run {
            retorno.setText("Aluno foi APROVADO com média ${media} e ${faltas} faltas.")
        }else{
            retorno.setText("Aluno foi REPROVADO com média ${media} e ${faltas} faltas!")
            }


        }
    }
}