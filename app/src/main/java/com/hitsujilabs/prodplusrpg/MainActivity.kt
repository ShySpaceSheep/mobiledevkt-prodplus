package com.hitsujilabs.prodplusrpg

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.ActionBar
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavView : BottomNavigationView
    private lateinit var sidebarNavView : DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set action bar display here by modifying the action bar object:
        val actionBar : ActionBar? = supportActionBar
        actionBar?.title = "ProdPlus-RPG"
        actionBar?.subtitle = "You currently have 0 tasks!"
    }
}