
package com.system.assignment.data.repository;

import android.content.Context;

import com.google.gson.Gson;
import com.system.assignment.data.api.ApiHelper;
import com.system.assignment.data.local.DatabaseHelper;
import com.system.assignment.data.shared.PreferencesHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppDataManager implements DataManager {

    private static final String TAG = "AppDataManager";
    private final ApiHelper mApiHelper;
    private final Context mContext;
    private final DatabaseHelper mDbHelper;
    private final Gson mGson;
    private final PreferencesHelper mPreferencesHelper;

    @Inject
    public AppDataManager(Context context, DatabaseHelper dbHelper, PreferencesHelper preferencesHelper, ApiHelper apiHelper, Gson gson) {
        mContext = context;
        mDbHelper = dbHelper;
        mPreferencesHelper = preferencesHelper;
        mApiHelper = apiHelper;
        mGson = gson;
    }

}
