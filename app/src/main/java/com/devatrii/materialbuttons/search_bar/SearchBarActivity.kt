package com.devatrii.materialbuttons.search_bar

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.devatrii.materialbuttons.R
import com.devatrii.materialbuttons.databinding.ActivitySearchBarBinding
import com.devatrii.materialbuttons.showToast

class SearchBarActivity : AppCompatActivity() {
    private val activity = this
    private val binding by lazy {
        ActivitySearchBarBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        searchBar()
        searchView()

    }

    private fun searchBar() {
        binding.apply {
            searchBar.setNavigationOnClickListener {
                showToast("Clicked on navigation item")
            }
            searchView.setupWithSearchBar(searchBar)

        }

    }

    private fun searchView() {
        binding.apply {
            searchView.inflateMenu(R.menu.search_view_menu)
            searchView.editText.setOnEditorActionListener { textView, i, keyEvent ->
                val queryText = textView.text.toString()
                searchBar.setText(queryText)
                showToast("You Entered: $queryText")
                searchView.hide()
                return@setOnEditorActionListener false
            }

        }

    }
}








