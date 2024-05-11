package com.example.checkboxnew

//import android.widget.Toast.

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    lateinit var male: CheckBox
    lateinit var female: CheckBox
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        male = findViewById(R.id.editcheckbox)
        female = findViewById(R.id.editcheckbox2)
        textView=findViewById(R.id.editText)
        //val textView=TextView(this)
        male.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (male.isClickable)
                if (male.isChecked()) {
                    // this doesn't work
                    Toast.makeText(
                        this@MainActivity,
                        "isChecked - " + male.isChecked(),
                        Toast.LENGTH_SHORT
                    ).show()
                    textView.setText("You clicked male")

                }
//Toast.makeText(
  //              this@MainActivity,
    //            "isChecked - " + male.isChecked(),
      //          Toast.LENGTH_SHORT
        //    ).show()
            female.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
                if (female.isChecked()) {
                    Toast.makeText(
                        this@MainActivity,
                        "isChecked - " + female.isChecked(),
                        Toast.LENGTH_SHORT
                    ).show()
                    textView.setText("You clicked female")


                }
            })

        })
    }
}



