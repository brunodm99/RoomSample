package com.github.brunodm99.roomsample

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PersonDao {
    @Query("SELECT * FROM Person")
    suspend fun getAll(): List<Person>

    @Query("SELECT * FROM Person WHERE id = :id")
    suspend fun getById(id: Int): Person

    @Update
    suspend fun update(person: Person)

    @Insert
    suspend fun insert(person: List<Person>)

    @Delete
    suspend fun delete(person: Person)
}