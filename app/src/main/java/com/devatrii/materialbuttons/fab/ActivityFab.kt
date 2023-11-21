package com.devatrii.materialbuttons.fab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.devatrii.materialbuttons.databinding.ActivityFabBinding

class ActivityFab : AppCompatActivity() {
    private val activity = this
    private val binding by lazy {
        ActivityFabBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {

            recyclerview.shrinkFabOnScroll(extendedFab)




            // recycler view
            val layoutManager = LinearLayoutManager(activity)
            recyclerview.layoutManager = layoutManager
            val data = mutableListOf<String>()
            repeat(100) {
                data.add("Item $it")
            }
            val adapter = MyAdapter(data)
            recyclerview.adapter = adapter

        }

    }
}