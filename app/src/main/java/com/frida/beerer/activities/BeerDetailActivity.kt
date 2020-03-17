package com.frida.beerer.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.frida.beerer.R
import com.frida.beerer.domain.Beer
import okhttp3.*
import java.io.IOException

const val INTENT_EXTRA_BEER_KEY = "INTENT_EXTRA_BEER_KEY"

class BeerDetailActivity : AppCompatActivity() {

    private val client = OkHttpClient()

    private val exampleDetailUrl = "https://api.punkapi.com/v2/beers/1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val beer: Beer = intent.getSerializableExtra(INTENT_EXTRA_BEER_KEY) as Beer

        initActivity(beer)
        Toast.makeText(this, beer.description, Toast.LENGTH_SHORT).show()

        run(exampleDetailUrl)
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

    fun run(url: String) {
        val request = Request.Builder()
            .url(url)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                println("ERROR")
            }
            override fun onResponse(call: Call, response: Response) {
                println(response.body()?.string())
            }
        })
    }
}
