package com.example.robi.bevasarlolista

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val contentTxtClick = View.OnClickListener {
            view -> when (view.getId()){
                R.id.contentTxt->openNote()
            }
        }

        val titleTxtClick = View.OnClickListener {
            view -> when (view.getId()){
            R.id.titleTxt->openNote()
            }
        }
      //  contentTxt.setOnClickListener(contentTxtClick)
      //  titleTxt.setOnClickListener(titleTxtClick)

        }

    fun openNote(){
        val builder = AlertDialog.Builder(this@MainActivity)
        builder.setTitle("App background color")
        builder.setMessage("Are you want to set the app background color to RED?")
        builder.setPositiveButton("YES"){dialog, which ->
            Toast.makeText(applicationContext,"Ok, we change the app background.",Toast.LENGTH_SHORT).show()
        }
        builder.setNegativeButton("No"){dialog,which ->
            Toast.makeText(applicationContext,"You are not agree.",Toast.LENGTH_SHORT).show()
        }
        builder.setNeutralButton("Cancel"){_,_ ->
            Toast.makeText(applicationContext,"You cancelled the dialog.",Toast.LENGTH_SHORT).show()
        }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}
