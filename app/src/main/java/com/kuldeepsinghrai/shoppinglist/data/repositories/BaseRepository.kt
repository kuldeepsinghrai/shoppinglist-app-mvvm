package com.kuldeepsinghrai.shoppinglist.data.repositories

import androidx.lifecycle.LiveData

interface BaseRepository <T>{
    suspend fun upsert(item: T)
    suspend fun delete(item: T)
    fun getAllShoppingItems():LiveData<List<T>>
}