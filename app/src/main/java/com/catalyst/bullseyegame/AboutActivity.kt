package com.catalyst.bullseyegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.catalyst.bullseyegame.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)  // this is to connect it to the created xml layout so the fields in it can be accessed
        setContentView(binding.root)

        title = getString(R.string.about_page_title)

        binding.backButton?.setOnClickListener {
            finish() //this method means that you are done with this activity, so it closes it and takes it to the activity before it
        }
    }
}