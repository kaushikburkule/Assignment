package com.system.assignment.ui.viewmodels

import androidx.lifecycle.viewModelScope
import com.system.assignment.ui.base.BaseViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(

) : BaseViewModel() {

    private fun fetchUsers() {
        viewModelScope.launch {

        }
    }

}