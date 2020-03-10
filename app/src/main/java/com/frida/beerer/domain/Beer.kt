package com.frida.beerer.domain

import java.io.Serializable

data class Beer(
    val id: Int,
    val name: String,
    val tagline: String,
    val first_brewed: String,
    val description: String,
    val image_url: String
) : Serializable