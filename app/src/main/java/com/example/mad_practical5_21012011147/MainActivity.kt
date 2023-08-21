package com.example.mad_practical5_21012011147

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browseButton:Button=findViewById(R.id.button)
        val editText:EditText=findViewById(R.id.editTextText)
        browseButton.setOnClickListener {
            openUrl(editText.text.toString())
            val callButton:Button=findViewById(R.id.button2)
            val editText1:EditText=findViewById(R.id.editTextPhone2)
            callButton.setOnClickListener {
              callNo(editText1.text.toString())
            }
        }
    }
    fun openUrl(str:String){
        Intent(Intent.ACTION_VIEW, Uri.parse(str)).also {
            startActivity(it)
        }
    }
    fun callNo (no:String){
        Intent(Intent.ACTION_DIAL, Uri.parse("tel:$no")).also {
            startActivity(it)
        }
    }
}