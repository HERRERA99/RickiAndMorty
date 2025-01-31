package com.aitor.rickmorty.data.response

import com.aitor.rickmorty.presentation.model.CharacterModel
import com.google.gson.annotations.SerializedName

data class CharacterResponse (
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("status") val status: String,
    @SerializedName("image") val image: String
){
    fun toPresentation(): CharacterModel{
        return CharacterModel(
            id = id,
            name = name,
            isAlive = status == "Alive",
            image = image
        )
    }
}