package com.santiihoyos.kmmtest1.data.datasources.api

import com.santiihoyos.kmmtest1.data.datasources.api.response.CharacterResponse

interface RickAndMortyApi {

    /**
     * Gets from server page of Characters.
     *
     * @param page - requested page
     * @param name - requested character name (filter)
     *
     * @return [List] of [CharacterResponse] at current page.
     */
    fun getCharacters(
        page: Int,
        name: String
    ): List<CharacterResponse>
}
