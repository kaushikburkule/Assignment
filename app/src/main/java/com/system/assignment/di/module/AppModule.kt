package com.system.assignment.di.module

import android.app.Application
import android.content.Context
import javax.inject.Singleton
import com.system.assignment.data.api.ApiHelper
import com.system.assignment.data.local.AppDatabase
import androidx.room.Room
import com.system.assignment.utils.AppConstants
import com.system.assignment.data.local.DatabaseHelper
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.system.assignment.di.annotations.Database
import com.system.assignment.di.annotations.Preference
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApiHelper(appApiHelper: ApiHelper): ApiHelper {
        return appApiHelper
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@Database dbName: String?, context: Context?): AppDatabase {
        return Room.databaseBuilder(context!!, AppDatabase::class.java, dbName!!)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application
    }

    @Provides
    @Database
    fun provideDatabaseName(): String {
        return AppConstants.DB_NAME
    }

    @Provides
    @Singleton
    fun provideDbHelper(appDbHelper: DatabaseHelper): DatabaseHelper {
        return appDbHelper
    }

    @Provides
    @Singleton
    fun provideGson(): Gson {
        return GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
    }

    @Provides
    @Preference
    fun providePreferenceName(): String {
        return AppConstants.PREF_NAME
    }

}