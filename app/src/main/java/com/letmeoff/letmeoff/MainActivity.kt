package com.letmeoff.letmeoff

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Add in Oncreate() funtion after setContentView()*/

    }

    val simpleSwitch = findViewById<View>(R.id.simpleSwitch) as Switch // initiate Switch

    simpleSwitch.textOn = "Time" // displayed text of the Switch whenever it is in checked or on state
    simpleSwitch.textOff = "Bus Stop"

}
