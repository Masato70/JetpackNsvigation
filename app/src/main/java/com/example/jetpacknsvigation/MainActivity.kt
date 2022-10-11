package com.example.jetpacknsvigation

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.navigation_activity)



        findViewById<BottomNavigationView>(R.id.bottom_navigation).setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home_icon -> {
                    Log.d(TAG, "home_iconをクリックしました")
                    // Respond to navigation item 1 click
                    true
                }
                R.id.celebration_icon-> {
                    // Respond to navigation item 2 click
                    Log.d(TAG, "celebration_iconをクリックしました")

//                    findNavController().navigate(R.id.actionToRightFragment)
                    true
                }
                else -> false
            }
        }

    }
}