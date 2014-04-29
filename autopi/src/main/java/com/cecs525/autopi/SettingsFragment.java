package com.cecs525.autopi;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

/**
 * A basic PreferenceFragment that presents the default main settings
 * for the app. To access any of these settings, use {@link PreferenceManager#getDefaultSharedPreferences}
 * to access the preference file. Use the supplied key constants to access each
 * setting value.
 *
 * NOTE: I had to change the minimum SDK to 11 for now, because PreferenceFragment
 *       was not added until then. This can be fixed later if you want.
 */
public class SettingsFragment extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener{

    public static final String AUTOMATIC_VOLUME_PREFERENCE_KEY = "adjust_volume";
    public static final String MEDIA_CONTROL_PREFERENCE_KEY = "media_control";
    public static final String DTC_WARNINGS_PREFERENCE_KEY = "warn_dtc";
    public static final String DISABLE_TOUCH_PREFERENCE_KEY = "disable_touch";
    public static final String DISABLE_SPEED_PREFERENCE_KEY = "disable_speed";

    private Preference speedPreference;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.main_preferences);

        //Set the initial summary to the correct speed value
        speedPreference = findPreference(DISABLE_SPEED_PREFERENCE_KEY);
        speedPreference.setSummary(getPreferenceScreen().getSharedPreferences().getString(DISABLE_SPEED_PREFERENCE_KEY, ""));

    }

    @Override
    public void onResume() {
        super.onResume();

        /*
            When the fragment is on screen, register a listener so we can update the UI
            when preference values change.
         */
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onPause() {
        super.onPause();

        /*
            When the fragment is not on screen, we don't need to be updated.
         */
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String s) {
        if(s.equals(DISABLE_SPEED_PREFERENCE_KEY) && speedPreference != null) {
            //Update the speed preference summary based on the new value
            speedPreference.setSummary(sharedPreferences.getString(s, ""));
        }
    }
}
