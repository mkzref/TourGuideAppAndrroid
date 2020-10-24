package com.example.tourguideapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tourguideapp.Adapter.InfoAdapter;
import com.example.tourguideapp.R;
import com.example.tourguideapp.classes.actions;

import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Places#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Places extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Places() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Places.
     */
    // TODO: Rename and change types and number of parameters
    public static Places newInstance(String param1, String param2) {
        Places fragment = new Places();
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
        View view = inflater.inflate(R.layout.fragment_places, container, false);
        List<actions> myListData = Arrays.asList(new actions(R.drawable.abd1, getString(R.string.Aberdeenplace)),
                new actions(R.drawable.place2, getString(R.string.Sarasotaplace)),
                new actions(R.drawable.place3, getString(R.string.Naplesplace)),
                new actions(R.drawable.place4, getString(R.string.Miamiplace)),
                new actions(R.drawable.place5, getString(R.string.Augustineplace)));

        RecyclerView recyclerView = view.findViewById(R.id.rec);
        InfoAdapter adapter = new InfoAdapter(view.getContext(), myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}