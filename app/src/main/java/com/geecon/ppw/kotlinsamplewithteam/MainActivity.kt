package com.geecon.ppw.kotlinsamplewithteam

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for(i in 0..30) {
            if(i % 10 == 0) {
                Log.d("Divisible by 10 : ", i.toString())
            } else if(i % 3 == 0) {
                Log.d("Divisible by 3 : ", i.toString())
            } else if(i % 4 == 0) {
                Log.d("Divisible by 4 : ", i.toString())
            }

        }
    }
}
