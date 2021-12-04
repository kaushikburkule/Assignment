package com.system.assignment.ui.viewmodels

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.system.assignment.data.repository.AppDataManager
import com.system.assignment.data.repository.DataManager
import com.system.assignment.ui.base.BaseViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
    private val dataManager: DataManager
) : BaseViewModel() {

    private fun fetchUsers() {
        viewModelScope.launch {
            val data = dataManager.getUsers()
            Log.i("TAG", "fetchUsers: $data")
        }
    }

}