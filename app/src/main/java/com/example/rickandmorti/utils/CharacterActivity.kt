package com.example.rickandmorti.utils

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rickandmorti.databinding.ActivityCharacterBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CharacterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCharacterBinding
    private val viewModel by lazy {
        ViewModelProvider(this)[CharacterViewModel::class.java]
    }
    private val cartoonAdapter =
        CartoonAdapter(this::onClickItem)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCharacterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setpRecycler()

        viewModel.getCaracters().observe(this) { characters ->
            cartoonAdapter.setCharacters(characters)
        }

    }

    private fun setpRecycler() = with(binding.rvRick) {
        layoutManager = LinearLayoutManager(
            this@CharacterActivity,
            LinearLayoutManager.VERTICAL,
            false
        )
        adapter=cartoonAdapter
    }

    private fun onClickItem(characterId: Int) {
        startActivity(Intent(this, DetailsActivity::class.java).apply {
            putExtra(DetailsActivity.CHARACTER_ID_ARG,characterId)
        })
    }
}