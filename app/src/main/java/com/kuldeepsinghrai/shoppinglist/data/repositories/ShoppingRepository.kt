package com.kuldeepsinghrai.shoppinglist.data.repositories

import androidx.lifecycle.LiveData
import com.kuldeepsinghrai.shoppinglist.data.db.entities.ShoppingItem
import com.kuldeepsinghrai.shoppinglist.data.db.ShoppingDatabase

class ShoppingRepository(
    private val db: ShoppingDatabase
):BaseRepository<ShoppingItem> {
    override suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)


    override suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    override fun getAllShoppingItems():LiveData<List<ShoppingItem>> = db.getShoppingDao().getAllShoppingItems()
}