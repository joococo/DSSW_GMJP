package com.example.mysubway;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.TextView;

public class HomeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home, container, false);

        ImageButton hmbutton = (ImageButton) v.findViewById(R.id.Myhome);
        ImageButton wkbutton = (ImageButton) v.findViewById(R.id.Work);
        ImageButton scbutton = (ImageButton) v.findViewById(R.id.School);
        ImageButton favbutton = (ImageButton) v.findViewById(R.id.Favorite);
        ImageButton addbutton = (ImageButton) v.findViewById(R.id.add);


        return v;
    }
}