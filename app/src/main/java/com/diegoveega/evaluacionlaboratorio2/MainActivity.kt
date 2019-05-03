package com.diegoveega.evaluacionlaboratorio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.diegoveega.evaluacionlaboratorio2.Fragment.SlideFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentBasic=SlideFragment.newInstance("text","text")

        /*

        supportFragmentManager
                .beginTransaction()
                .add(R.id.activity_slide, fragmentBasic)
                .commit()

                */
    }
}
