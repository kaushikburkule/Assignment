package com.system.assignment.data.api

import com.system.assignment.data.model.ApiUser

interface ApiHelper {

    suspend fun getUsers(): List<ApiUser>

}