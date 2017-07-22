package com.example.zerosx.geekybase

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .replace(R.id.container,MainFragment.newInstance())
                .commit()
    }

    fun changeFragment(fragment: android.support.v4.app.Fragment){
        supportFragmentManager.beginTransaction()
                .replace(R.id.container,fragment)
                .addToBackStack(null)
                .commit()
    }
}
