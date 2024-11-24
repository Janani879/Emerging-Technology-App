package com.example.fullyfunctionalapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btncall=findViewById<Button>(R.id.callbutton)
        val app=findViewById<CardView>(R.id.mobileapp)
        btncall.setOnClickListener{
            val intent=Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:9740221391")
            startActivity(intent)
        }
        app.setOnClickListener{
            intent=Intent(applicationContext,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}
