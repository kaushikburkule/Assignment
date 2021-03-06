package com.system.assignment.data.repository

import android.content.Context
import javax.inject.Singleton
import javax.inject.Inject
import com.system.assignment.data.local.DatabaseHelper
import com.system.assignment.data.shared.PreferencesHelper
import com.system.assignment.data.api.ApiHelper
import com.google.gson.Gson
import com.system.assignment.data.local.entity.User
import com.system.assignment.data.model.ApiUser
import com.system.assignment.data.repository.DataManager

@Singleton
class AppDataManager @Inject constructor() : DataManager {

    companion object {
        private const val TAG = "AppDataManager"
    }

    @Inject
    lateinit var mGson: Gson

    @Inject
    lateinit var mApiHelper: ApiHelper

    @Inject
    lateinit var mPreferencesHelper: PreferencesHelper

    @Inject
    lateinit var mDbHelper: DatabaseHelper

    @Inject
    lateinit var mContext: Context

    override fun getAllUsers(): List<User?> = mDbHelper.getAllUsers()
    override fun saveLocalStorage(value: String): String = mPreferencesHelper.saveLocalStorage(value)
    override suspend fun getUsers(): List<ApiUser> = mApiHelper.getUsers()

}