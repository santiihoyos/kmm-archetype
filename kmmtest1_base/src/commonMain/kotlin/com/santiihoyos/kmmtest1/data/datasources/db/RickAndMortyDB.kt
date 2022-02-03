package com.santiihoyos.kmmtest1.data.datasources.db

import com.santiihoyos.kmmtest1.data.entity.Character

interface RickAndMortyDB {

    /**
     * Gets from server page of Characters.
     */
    fun getCharacters(page: Int, name: String): List<Character>
}
