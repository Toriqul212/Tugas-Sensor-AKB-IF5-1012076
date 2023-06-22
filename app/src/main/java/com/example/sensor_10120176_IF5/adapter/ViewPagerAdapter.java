package com.example.sensor_10120176_IF5.adapter;
/**
 * NAMA    : Muhammad Toriqul muslim
 * NIM     : 10120176
 * Kelas   : IF-5
 * MatKul  : Aplikasi Komputasi Bergerak
 */

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final ArrayList<Fragment> fragmentsArrayList = new ArrayList<>();
    private final ArrayList<String> fragmentTitle = new ArrayList<>();

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentsArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsArrayList.size();
    }

    public void addFragment(Fragment fragment, String title){
        fragmentsArrayList.add(fragment);
        fragmentTitle.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }
}
