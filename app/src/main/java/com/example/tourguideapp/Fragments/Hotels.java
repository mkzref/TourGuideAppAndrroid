package com.example.tourguideapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tourguideapp.Adapter.HotelAdapter;
import com.example.tourguideapp.R;
import com.example.tourguideapp.classes.HotelandResturant;

import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Hotels#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Hotels extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Hotels() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Hotels.
     */
    // TODO: Rename and change types and number of parameters
    public static Hotels newInstance(String param1, String param2) {
        Hotels fragment = new Hotels();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resturants , container, false);
        List<HotelandResturant> myListData = Arrays.asList(new HotelandResturant[]{

                new HotelandResturant(R.drawable.hotel1,getString(R.string.hotelinaberdeen),getString(R.string.sandmansignture)),
                new HotelandResturant(R.drawable.hotel2,getString(R.string.HotelinSarasota),getString(R.string.TheRitzCarlton)),
                new HotelandResturant(R.drawable.hotel3,getString(R.string.HotelinNaples),getString(R.string.NaplesGrandeBeachResort)),
                new HotelandResturant(R.drawable.backmi, getString(R.string.HotelinMiami),getString(R.string.Faena)),
                new HotelandResturant(R.drawable.backfinal, getString(R.string.hotelinAugustine),getString(R.string.Hilton)),
        });

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rec);
        HotelAdapter adapter = new HotelAdapter(view.getContext(), myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}