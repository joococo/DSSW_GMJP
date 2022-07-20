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

    private TextClock textClock;
    private ImageButton imageButton;
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_subway, container, false);
        TextClock textClock = (TextClock) v.findViewById(R.id.clock);
        ImageButton imageButton = (ImageButton) v.findViewById(R.id.refresh);
        TextView textView = (TextView) v.findViewById(R.id.time);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textClock.getText());
            }
        });

        boolean is24HourModeEnabled = textClock.is24HourModeEnabled();

        return v;
    }
}