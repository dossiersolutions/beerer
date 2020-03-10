package com.frida.beerer.activities

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import com.frida.beerer.R
import com.frida.beerer.domain.Beer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val beers = arrayListOf(
        Beer(
            id = 0,
            name = "Pilsner Urquell",
            description = "Pilsner Urquell is a lager beer brewed by the Pilsner Urquell Brewery in Plzeň (former German name: Pilsen), Czech Republic. Pilsner Urquell was the world's first pale lager,[1] and its popularity meant it was much copied, and named pils, pilsner or pilsener.",
            first_brewed = "1842",
            image_url = "https://en.wikipedia.org/wiki/Pilsner_Urquell#/media/File:Pilsner_urquell_mug.jpg",
            tagline = "drinking,kills,coronavirus"
        ),
        Beer(
            id = 1,
            name = "Kabinet Borka",
            description = "A charismatic session IPA full of pine freshness with a hint of aromatic eucalyptus scent, brewed specially for Beerland pub and Majstor za Pivo East Sarajevo.",
            first_brewed = "Unknown",
            image_url = "https://www.kabinet.rs/assets/admin/uploads/thumbs/Borka2.png",
            tagline = "drinking,kills,anger"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        button_open_beer_1.setOnClickListener {
            val intent = Intent(this, BeerDetailActivity::class.java)
                .apply {
                    putExtra(INTENT_EXTRA_BEER_KEY, beers[0])
                }
            startActivity(intent)
        }
        button_open_beer_2.setOnClickListener {
            val intent = Intent(this, BeerDetailActivity::class.java)
                .apply {
                    putExtra(INTENT_EXTRA_BEER_KEY, beers[1])
                }
            startActivity(intent)
        }

        button_register_new_beer.setOnClickListener { view ->
            Snackbar.make(view, "Regsister a new beer here", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> {
                val intent = Intent(this, SettingsActivity::class.java)
                this.startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
