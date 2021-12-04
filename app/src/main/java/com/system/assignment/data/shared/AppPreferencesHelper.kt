package com.system.assignment.data.shared

import android.content.Context
import android.content.SharedPreferences
import com.system.assignment.di.annotations.Preference
import javax.inject.Inject

class AppPreferencesHelper @Inject constructor(
    context: Context,
    @Preference prefFileName: String?
) : PreferencesHelper {

    companion object {
        private const val PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN"
    }

    private val mPrefs: SharedPreferences =
        context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)

    var accessToken: String?
        get() = mPrefs.getString(PREF_KEY_ACCESS_TOKEN, null)
        set(accessToken) = mPrefs.edit().putString(PREF_KEY_ACCESS_TOKEN, accessToken).apply()


}