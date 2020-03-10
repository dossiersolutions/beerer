package com.frida.beerer

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class SettingsActivity : AppCompatActivity() {

    private lateinit var usernameView: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val imageView = findViewById<ImageView>(R.id.roundedImageView)
        usernameView = findViewById(R.id.usernameInput)

        imageView.setOnClickListener {
            println("Upload image")
        }

        usernameView.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
//                println("afterTextChanged $p0")
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//                println("beforeTextChanged $p0")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//                println("onTextChanged $p0")
            }
        })

        usernameView.setImeActionLabel("Username", EditorInfo.IME_ACTION_DONE)
        usernameView.setOnEditorActionListener { v, actionId, event ->
            println("v: $v; actionId: $actionId; event: $event")
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                true
            } else {
                false
            }
        }

    }
}