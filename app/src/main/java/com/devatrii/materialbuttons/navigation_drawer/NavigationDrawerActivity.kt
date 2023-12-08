package com.devatrii.materialbuttons.navigation_drawer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devatrii.materialbuttons.R
import com.devatrii.materialbuttons.databinding.ActivityNavigationDrawerBinding
import com.devatrii.materialbuttons.showToast


class NavigationDrawerActivity : AppCompatActivity() {
    private val activity = this
    private val binding by lazy {
        ActivityNavigationDrawerBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {


            toolbar.setNavigationOnClickListener {
                drawerLayout.open()
            }

            navigationView.setNavigationItemSelectedListener { menuItem ->
                menuItem.isChecked = true
                drawerLayout.close()
                when (menuItem.itemId) {
                    R.id.nav_menu_home -> showToast("Home Clicked")
                    R.id.nav_menu_explore -> showToast("Explore Clicked")
                    R.id.nav_menu_subscription -> showToast("Subscription Clicked")
                    R.id.nav_menu_video_library -> showToast("Video Library Clicked")
                }

                return@setNavigationItemSelectedListener true
            }

        }
    }
}












