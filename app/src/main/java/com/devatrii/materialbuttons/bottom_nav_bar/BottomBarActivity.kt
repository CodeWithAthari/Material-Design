package com.devatrii.materialbuttons.bottom_nav_bar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devatrii.materialbuttons.R
import com.devatrii.materialbuttons.databinding.ActivityBottomBarBinding
import com.devatrii.materialbuttons.showToast

class BottomBarActivity : AppCompatActivity() {
    private val activity = this
    private val binding by lazy {
        ActivityBottomBarBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        clickListeners()
         badges()
    }

    private fun badges() {
        binding.bottomNavigation.getOrCreateBadge(R.id.nav_menu_subscription).apply {
            number = 100
            maxNumber = 99
        }
    }

    private fun clickListeners() {
        binding.bottomNavigation.setOnItemSelectedListener {menuItem->
            when(menuItem.itemId){
                R.id.nav_menu_home->showToast("Home Item")
                R.id.nav_menu_explore->showToast("Explore Item")
                R.id.nav_menu_subscription->showToast("Subscription Item")
                R.id.nav_menu_video_library->showToast("Video Library Item")
            }


            return@setOnItemSelectedListener true
        }
    }
}












