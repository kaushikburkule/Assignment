package com.system.assignment.data.api

import com.system.assignment.data.api.RetrofitBuilder.apiService
import javax.inject.Inject

class ApiHelperImpl @Inject constructor() : ApiHelper {

    override suspend fun getUsers() = apiService.getUsers()

}