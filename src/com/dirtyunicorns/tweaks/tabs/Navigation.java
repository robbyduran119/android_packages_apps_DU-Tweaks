/*
 * Copyright (C) 2017 The Dirty Unicorns Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dirtyunicorns.tweaks.tabs;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceScreen;
import android.preference.Preference.OnPreferenceChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.applications.LayoutPreference;

import com.android.internal.logging.nano.MetricsProto;

public class Navigation extends SettingsPreferenceFragment implements Preference.OnPreferenceChangeListener {

    private static final String BUTTONS_CATEGORY = "buttons_category";
    private static final String NAVIGATION_CATEGORY = "navigation_category";
    private static final String EXPANDED_DESKTOP_CATEGORY = "expanded_desktop_category";

    private LayoutPreference mButtons;
    private LayoutPreference mNavigation;
    private LayoutPreference mExpandedDesktop;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.navigation);

        mButtons = (LayoutPreference) findPreference(BUTTONS_CATEGORY);
        mButtons.setTitle(R.string.buttons_title);

        mNavigation = (LayoutPreference) findPreference(NAVIGATION_CATEGORY);
        mNavigation.setTitle(R.string.navigationbar_title);

        mExpandedDesktop = (LayoutPreference) findPreference(EXPANDED_DESKTOP_CATEGORY);
        mExpandedDesktop.setTitle(R.string.expanded_desktop_title);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }


    public boolean onPreferenceChange(Preference preference, Object objValue) {
        final String key = preference.getKey();
        return false;
    }


    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.DIRTYTWEAKS;
    }
}

