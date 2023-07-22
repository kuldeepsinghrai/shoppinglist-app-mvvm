package com.kuldeepsinghrai.shoppinglist.ui.shoppinglist

import com.kuldeepsinghrai.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}