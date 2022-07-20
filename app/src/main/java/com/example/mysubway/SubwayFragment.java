package com.example.mysubway;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.TextClock;
import android.widget.TextView;


public class SubwayFragment extends Fragment {

    int count;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_subway, container, false);
        ImageButton imageButton2 = (ImageButton) v.findViewById(R.id.star);
        TextClock textClock = (TextClock) v.findViewById(R.id.clock);
        ImageButton imageButton = (ImageButton) v.findViewById(R.id.refresh);
        TextView textView = (TextView) v.findViewById(R.id.time);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("(" + textClock.getText()+" 기준)");
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count += 1;

                if (count % 2 == 0)
                    imageButton2.setSelected(false);
                else
                    imageButton2.setSelected(true);

            }
        });

        boolean is24HourModeEnabled = textClock.is24HourModeEnabled();

        return v;
    }
}