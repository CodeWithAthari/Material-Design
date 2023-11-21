package com.devatrii.materialbuttons.text_fields

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.devatrii.materialbuttons.databinding.ActivityTextFieldsBinding

class ActivityTextFields : AppCompatActivity() {
    private val activity = this
    private val binding by lazy {
        ActivityTextFieldsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {

        }

    }
}