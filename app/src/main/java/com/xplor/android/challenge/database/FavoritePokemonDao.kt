package com.xplor.android.challenge.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.xplor.android.challenge.repository.models.Pokemon
import kotlinx.coroutines.flow.Flow

@Dao
interface FavoritePokemonDao {

    @Query("Select * FROM ${Pokemon.TABLE_NAME}")
    suspend fun getAllFavoritePokemon(): Flow<List<Pokemon>>

    @Query("Select * FROM ${Pokemon.TABLE_NAME}")
    suspend fun getAllFavoritePokemonAsync(): List<Pokemon>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(pokemon: Pokemon)

    @Delete
    suspend fun delete(pokemon: Pokemon)
}
