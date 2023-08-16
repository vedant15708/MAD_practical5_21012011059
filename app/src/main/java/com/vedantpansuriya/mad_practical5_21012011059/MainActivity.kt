package com.vedantpansuriya.mad_practical5_21012011059

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
        val browseButton = findViewById<Button>(R.id.browse_btn)
        val editText: EditText = findViewById(R.id.url)
        browseButton.setOnClickListener {
            openBrowser(editText.text.toString())
        }
        val callButton=findViewById<Button>(R.id.call_btn)
        val dialno:EditText=findViewById(R.id.Phone)
        callButton.setOnClickListener{
            call(editText.text.toString())
        }
    }
    fun openBrowser(string: String){
        Intent(Intent.ACTION_VIEW, Uri.parse(string)).also { startActivity(it) }
    }
    fun call(number:String){
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$number")).also { startActivity(it) }
    }

    fun callLog(){

    }

    fun gallery(){

    }

    fun camera(){

    }

    fun alarm(){

    }
}

