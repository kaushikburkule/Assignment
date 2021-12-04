package com.system.assignment.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.system.assignment.data.local.entity.User

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    fun loadAll(): List<User?>

}