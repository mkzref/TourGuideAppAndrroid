package com.example.tourguideapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tourguideapp.Adapter.MyListAdapter;
import com.example.tourguideapp.Adapter.eventsAdapter;
import com.example.tourguideapp.R;
import com.example.tourguideapp.classes.actions;

import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Events#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Events extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Events() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Events.
     */
    // TODO: Rename and change types and number of parameters
    public static Events newInstance(String param1, String param2) {
        Events fragment = new Events();
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

        List<actions> myListData = Arrays.asList(new actions(R.drawable.img1, getString(R.string.StarkeBikefest)),
                new actions(R.drawable.img2, getString(R.string.Pensacola)),
                new actions(R.drawable.img3,getString(R.string.Twilight)),
                new actions(R.drawable.img4, getString(R.string.TheGreatPumpkin)),
                new actions(R.drawable.img5, getString(R.string.MiamiSpice)));

        RecyclerView recyclerView = view.findViewById(R.id.rec);
        eventsAdapter adapter = new eventsAdapter(view.getContext(), myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(adapter);

return view;
    }
}