package com.nuu.gittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nuu.a104library.My104Data

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        My104Data()
    }
}