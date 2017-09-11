package com.example.shinji.preferenceactivity;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by shinji on 2017/09/11.
 */

public class MyPreferenceActivity extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}