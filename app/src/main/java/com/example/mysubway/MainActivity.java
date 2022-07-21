package com.example.mysubway;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> stations = Arrays.asList("신설동","용두","신답","용답","성수","건대입구","구의","강변","잠실나루","잠실","잠실새내","종합운동장","삼성","선릉","역삼","강남","교대","서초","방배","사당","낙성대"
            ,"서울대입구","봉천","신림","신대방","구로디지털단지","대림","신도림","도림천","양천구청","신정네거리","까치산","문래","영등포구청","당산","합정","홍대입구","신촌","이대","아현","충청로","시청","을지로입구"
            ,"을지로3가","을지로4가","동대문역사문화공원","신당","상왕십리","왕십리","한양대","뚝섬");

    private List<String> bookmarks = Arrays.asList();


    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    SubwayFragment subwayFragment = new SubwayFragment();
    MapFragment mapFragment = new MapFragment();
    SearchFragment searchFragment = new SearchFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_bar);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                        return true;

                    case R.id.map:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,mapFragment).commit();
                        return true;

                    case R.id.search:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,searchFragment).commit();
                        return true;

                    case R.id.subway:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,subwayFragment).commit();
                        return true;

                }


                return false;
            }
        });
    }


    }