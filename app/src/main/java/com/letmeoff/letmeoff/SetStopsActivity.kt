package com.letmeoff.letmeoff

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.letmeoff.letmeoff.ui.setstops.SetStopsFragment

class SetStopsActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.set_stops_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, SetStopsFragment.newInstance())
                    .commitNow()
        }
    }

}
