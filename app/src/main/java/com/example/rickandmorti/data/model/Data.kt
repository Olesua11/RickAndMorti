package com.example.rickandmorti.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Data (
    @SerializedName("character_id")
    val id: Int
):Serializable