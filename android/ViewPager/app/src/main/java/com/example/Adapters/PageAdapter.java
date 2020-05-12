package com.example.Adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

import static android.media.CamcorderProfile.get;

public class PageAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragments;
    private List<String> nomes;
//    private ImagensFragAdapter imagensFragAdapter;

//    public PageAdapter(FragmentManager fm, List<Fragment> fragments, List<String> nomes, ImagensFragAdapter imagensFragAdapter) {
//        super(fm);
//        this.fragments = fragments;
//        this.nomes = nomes;
//        this.imagensFragAdapter = imagensFragAdapter;
//    }

    public PageAdapter(FragmentManager fm, List<Fragment> fragments, List<String> nomes) {
        super(fm);
        this.fragments = fragments;
        this.nomes = nomes;
    }

    public PageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return nomes.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
