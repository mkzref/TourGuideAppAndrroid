package com.example.tourguideapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.tourguideapp.Adapter.InfoAdapter;
import com.example.tourguideapp.Adapter.ResturnatsAdapter;
import com.example.tourguideapp.R;
import com.example.tourguideapp.classes.HotelandResturant;
import com.example.tourguideapp.classes.actions;

import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Resturants#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Resturants extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Resturants() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Resturants.
     */
    // TODO: Rename and change types and number of parameters
    public static Resturants newInstance(String param1, String param2) {
        Resturants fragment = new Resturants();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_resturants , container, false);
        List<HotelandResturant> myListData = Arrays.asList(new HotelandResturant(R.drawable.back1,getString(R.string.infoResturant1),getString(R.string.MountEverestResturnat)),
                new HotelandResturant(R.drawable.view2,getString(R.string.infoResturant2),getString(R.string.Floribbean)),
                new HotelandResturant(R.drawable.back3,getString(R.string.infoResturant3),getString(R.string.MediterranoResturant)),
                new HotelandResturant(R.drawable.back4, getString(R.string.infoResturant4),getString(R.string.Pastaiolo)),
                new HotelandResturant(R.drawable.back5, getString(R.string.infoResturant5),getString(R.string.CollageResturnat)));

        RecyclerView recyclerView = view.findViewById(R.id.rec);
        ResturnatsAdapter adapter = new ResturnatsAdapter(view.getContext(), myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}