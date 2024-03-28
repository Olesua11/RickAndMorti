package com.example.rickandmorti.data.api

import com.example.rickandmorti.data.model.Character
import com.example.rickandmorti.data.model.CharacterResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CartoonApiService {
    @GET("character")
    //fun getCharacters(): Call<BaseResponse<Character>>
    fun getCharacters(): Call<CharacterResponse>

    @GET("character/{id}")
    fun getCharacter(@Path("id") id: Int):Call<Character>
}