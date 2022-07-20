package com.example.mysubway;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class SearchFragment extends Fragment {

    private List<String> stations = Arrays.asList("신설동","용두","신답","용답","성수","건대입구","구의","강변","잠실나루","잠실","잠실새내","종합운동장","삼성","선릉","역삼","강남","교대","서초","방배","사당","낙성대"
            ,"서울대입구","봉천","신림","신대방","구로디지털단지","대림","신도림","도림천","양천구청","신정네거리","까치산","문래","영등포구청","당산","합정","홍대입구","신촌","이대","아현","충청로","시청","을지로입구"
            ,"을지로3가","을지로4가","동대문역사문화공원","신당","상왕십리","왕십리","한양대","뚝섬");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_search, container, false);
        SearchView searchView = (SearchView)v.findViewById(R.id.search_stn);
        TextView resultTextView = (TextView)v.findViewById(R.id.search_his);
        resultTextView.setText(getResult());

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                resultTextView.setText(search(newText));
                return true;
            }
        });

        return v;
    }


    private String search(String query) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stations.size(); i++) {
            String item = stations.get(i);
            if (item.toLowerCase().contains(query.toLowerCase())) {
                sb.append(item);
                if (i != stations.size() - 1) {
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }


    private String getResult() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stations.size(); i++) {
            String item = stations.get(i);
            sb.append(item);
            if (i != stations.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}