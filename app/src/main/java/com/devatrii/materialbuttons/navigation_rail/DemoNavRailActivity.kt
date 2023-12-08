package com.devatrii.materialbuttons.navigation_rail

import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import com.devatrii.materialbuttons.R
import com.devatrii.materialbuttons.afterTextChangeListener
import com.devatrii.materialbuttons.databinding.ActivityDemoNavRailBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlin.random.Random

class DemoNavRailActivity : AppCompatActivity() {
    private val activity = this
    private val binding by lazy {
        ActivityDemoNavRailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        config()
        badges()
        clickListeners()
        binding.apply {


        }

    }

    private fun config() {
        binding.apply {
            autoGravity.afterTextChangeListener { value ->
                when (value.lowercase()) {
                    "top" -> navigationRail.menuGravity = Gravity.TOP
                    "center" -> navigationRail.menuGravity = Gravity.CENTER
                    "bottom" -> navigationRail.menuGravity = Gravity.BOTTOM
                }
            }

            val floatingButton =
                navigationRail.headerView?.findViewById<FloatingActionButton>(R.id.floating_button_rail)
            switchFab.setOnCheckedChangeListener { compoundButton, value ->
                if (value)
                    floatingButton?.show()
                else
                    floatingButton?.hide()
            }
            switchBadge.setOnCheckedChangeListener { _, value ->
                val badge = navigationRail.getOrCreateBadge(R.id.nav_menu_subscription)
                if (value) {
                    badge.isVisible = true
                    badge.apply {
                        number = Random.nextInt(20, 100)
                        maxNumber = 99
                    }
                } else {
                    badge.isVisible = false
                }
            }
            switchSimpleBadge.setOnCheckedChangeListener { _, value ->
                val badge = navigationRail.getOrCreateBadge(R.id.nav_menu_video_library)
                if (value) {
                    badge.isVisible = true
                    badge.clearNumber()
                } else {
                    badge.isVisible = false
                }
            }

        }
    }

    private fun clickListeners() {
        binding.apply {
            navigationRail.setOnItemSelectedListener {
                txtContent.text = "Selected=> ${it.title}"
                return@setOnItemSelectedListener true
            }
            navigationRail.setOnItemReselectedListener {
                txtContent.text = "ReSelected=> ${it.title}"

            }

            val floatingButton =
                navigationRail.headerView?.findViewById<FloatingActionButton>(R.id.floating_button_rail)
            floatingButton?.setOnClickListener {
                txtContent.text = "Selected=> Header FAB"
            }


        }
    }

    private fun badges() {
        binding.navigationRail.getOrCreateBadge(R.id.nav_menu_subscription).apply {
            number = 100
            maxNumber = 99
        }
    }
}






