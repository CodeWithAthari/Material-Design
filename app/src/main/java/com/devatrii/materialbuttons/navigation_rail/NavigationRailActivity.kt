package com.devatrii.materialbuttons.navigation_rail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devatrii.materialbuttons.R
import com.devatrii.materialbuttons.databinding.ActivityNavigationRailBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NavigationRailActivity : AppCompatActivity() {
    private val activity = this
    private val binding by lazy {
        ActivityNavigationRailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        clickListeners()

    }

    private fun clickListeners() {
        binding.navigationRail.setOnItemSelectedListener {
            binding.txtContent.text = "Selected ${it.title}"
            return@setOnItemSelectedListener true
        }
        binding.navigationRail.setOnItemReselectedListener {
            binding.txtContent.text = "ReSelected ${it.title}"
        }

        val floatingActionButton =
            binding.navigationRail.headerView?.findViewById<FloatingActionButton>(
                R.id.floating_button_rail
            )

        floatingActionButton?.setOnClickListener {
            binding.txtContent.text = "Selected Home FAB"
        }


    }
}








