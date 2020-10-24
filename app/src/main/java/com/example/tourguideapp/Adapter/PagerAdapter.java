package com.example.tourguideapp.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.tourguideapp.Fragments.About;
import com.example.tourguideapp.Fragments.Events;
import com.example.tourguideapp.Fragments.Hotels;
import com.example.tourguideapp.Fragments.Places;
import com.example.tourguideapp.Fragments.Resturants;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                Places tab1 = new Places();
                return tab1;
            case 1:
                Resturants tab2 = new Resturants();
                return tab2;
            case 2:
                Hotels tab3 = new Hotels();
                return tab3;
            case 3:
                Events tab4 = new Events();
                return tab4;
            case 4:
                About tab5 = new About();
                return tab5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}


