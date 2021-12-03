package com.system.assignment.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.system.assignment.data.api.ApiHelper
import com.system.assignment.data.local.DatabaseHelper
import kotlinx.coroutines.launch

class MainActivityViewModel(
    private val apiHelper: ApiHelper,
    private val dbHelper: DatabaseHelper
) : ViewModel() {

    private fun fetchUsers() {
        viewModelScope.launch {

        }
    }

}