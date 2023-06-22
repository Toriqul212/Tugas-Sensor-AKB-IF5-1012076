package com.example.sensor_10120176_IF5;
/**
 * NAMA    : Muhammad Toriqul muslim
 * NIM     : 10120176
 * Kelas   : IF-5
 * MatKul  : Aplikasi Komputasi Bergerak
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SettingsFragmentViewPager extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings_view_pager, container, false);
    }
}