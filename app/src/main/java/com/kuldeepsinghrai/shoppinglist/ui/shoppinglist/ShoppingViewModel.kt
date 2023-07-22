package com.kuldeepsinghrai.shoppinglist.ui.shoppinglist

import androidx.lifecycle.ViewModel
import com.kuldeepsinghrai.shoppinglist.data.db.entities.ShoppingItem
import com.kuldeepsinghrai.shoppinglist.data.repositories.ShoppingRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ShoppingViewModel(
    private val repository: ShoppingRepository
) : ViewModel() {

    fun upsert(item: ShoppingItem) =
        GlobalScope.launch {
            repository.upsert(item)
        }

    fun delete(item: ShoppingItem) = GlobalScope.launch {
        repository.delete(item)
    }

    fun getAllShoppingItems() = repository.getAllShoppingItems()

}
