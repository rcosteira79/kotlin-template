package com.rcosteira.core.data.preferences

import android.content.Context
import com.rcosteira.core.data.AppConstants
import javax.inject.Inject

class PreferencesHelperImpl @Inject constructor(context: Context): PreferencesHelper {

    private val preferences = context.getSharedPreferences(
            AppConstants.PREFERENCES_NAME, Context.MODE_PRIVATE)
}