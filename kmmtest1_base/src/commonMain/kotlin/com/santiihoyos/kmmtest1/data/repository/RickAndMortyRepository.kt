package com.santiihoyos.kmmtest1.data.repository

import com.santiihoyos.kmmtest1.data.datasources.api.RickAndMortyApi
import com.santiihoyos.kmmtest1.data.datasources.db.RickAndMortyDB
import com.santiihoyos.kmmtest1.data.entity.Character

expect class RickAndMortyRepository(
    apiRickAndMortyApi: RickAndMortyApi,
    dbRickAndMortyDB: RickAndMortyDB,
) {

    /**
     * Gets from server page of Characters.
     *
     * @param page - requested page
     * @param name - requested character name (filter)
     *
     * @return [List] of [Character] at current page.
     */
    fun getCharacters(page: Int, name: String): List<Character>
}
