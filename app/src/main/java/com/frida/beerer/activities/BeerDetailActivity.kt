package com.frida.beerer.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.frida.beerer.R
import com.frida.beerer.domain.Beer

const val INTENT_EXTRA_BEER_KEY = "INTENT_EXTRA_BEER_KEY"

class BeerDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val beer: Beer = intent.getSerializableExtra(INTENT_EXTRA_BEER_KEY) as Beer

        initActivity(beer)
        Toast.makeText(this, beer.description, Toast.LENGTH_SHORT).show()
    }

    private fun initActivity(beer: Beer) {
        setContentView(R.layout.activity_beer_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        title = beer.name
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
