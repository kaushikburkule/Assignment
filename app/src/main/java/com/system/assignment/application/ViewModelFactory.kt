package com.system.assignment.application

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.system.assignment.data.api.ApiHelper
import com.system.assignment.data.local.DatabaseHelper
import com.system.assignment.ui.viewmodels.MainActivityViewModel

class ViewModelFactory(private val apiHelper: ApiHelper, private val dbHelper: DatabaseHelper) :
    ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {
            return MainActivityViewModel(apiHelper, dbHelper) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}