package com.devatrii.materialbuttons

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devatrii.materialbuttons.bottom_nav_bar.BottomBarActivity
import com.devatrii.materialbuttons.databinding.ActivityMainBinding
import com.devatrii.materialbuttons.navigation_drawer.NavigationDrawerActivity
import com.devatrii.materialbuttons.navigation_rail.DemoNavRailActivity
import com.devatrii.materialbuttons.navigation_rail.NavigationRailActivity
import com.devatrii.materialbuttons.search_bar.SearchBarActivity
import com.devatrii.materialbuttons.text_fields.ActivityTextFields

class MainActivity : AppCompatActivity() {
    private val activity = this
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        startActivity(Intent(activity, ActivityFab::class.java))
//        startActivity(Intent(activity, ActivityTextFields::class.java))
//        startActivity(Intent(activity, SearchBarActivity::class.java))
//        startActivity(Intent(activity, BottomBarActivity::class.java))
//        startActivity(Intent(activity, NavigationDrawerActivity::class.java))
        startActivity(Intent(activity, DemoNavRailActivity::class.java))
//        startActivity(Intent(activity, NavigationRailActivity::class.java))
        binding.apply {
            btnToggleFab.setOnClickListener {
                if (normalFloatingActionButton.isShown) {
                    normalFloatingActionButton.hide()
                } else {
                    normalFloatingActionButton.show()
                }
            }
            btnToggleExtendedFab.setOnClickListener {
                if (extendedFloatingActionButton.isExtended) {
                    extendedFloatingActionButton.shrink()
                } else {
                    extendedFloatingActionButton.extend()
                }
            }

        }

    }
}
















