package com.example.rickandmorti.utils

import com.example.rickandmorti.R

enum class CharacterStatus(val drawableResource: Int) {
    ALIVE(R.drawable.circle_green),
    DEAD(R.drawable.circle_red),
    UNKNOWN(R.drawable.circle)
}