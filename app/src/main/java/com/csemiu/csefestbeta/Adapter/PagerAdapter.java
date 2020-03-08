package com.csemiu.csefestbeta.Adapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.csemiu.csefestbeta.day_1;
import com.csemiu.csefestbeta.day_2;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter {

    private int days;
    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> stringList = new ArrayList<>();


    public PagerAdapter(@NonNull FragmentManager fm, int behaviorResumeOnlyCurrentFragment, int behavior) {
        super(fm, behavior);
        this.days = days;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new day_1();
            case 1:
                return new day_2();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }


}
