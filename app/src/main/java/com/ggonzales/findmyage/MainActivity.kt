package com.ggonzales.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getMyAgeBtn.setOnClickListener {
            buttonClick()
        }


    }

    fun buttonClick(){
        val userYOB = (birthYearEditTxt.text.toString()).toInt()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)

        val diffYears = currentYear - userYOB
        yearCalculationTxtView.text = "You are $diffYears years old"
        Log.d("LogsMe", "You are $diffYears years old")
    }

}
