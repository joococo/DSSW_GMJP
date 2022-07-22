package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    private List<String> list;
    private ListView search_list;
    private EditText search_et;
    private SearchAdapter adapter;
    private ArrayList<String> arrayList;
    private Button searchBtn;
    private String str;
    private String shared = "file";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        search_et = (EditText) findViewById(R.id.search_et);
        search_list= (ListView) findViewById(R.id.search_list);
        searchBtn = (Button) findViewById(R.id.searchBtn);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = search_et.getText().toString();

                if(str != null){
                    MainActivity.list.add(str);
                    adapter.notifyDataSetChanged();
                    MainActivity.recent_list.setAdapter(adapter);
                }
            }
        });


        list = new ArrayList<String>();

        settingList();

        arrayList = new ArrayList<String>();
        arrayList.addAll(list);

        adapter = new SearchAdapter(arrayList, this);
        search_list.setAdapter(adapter);


        search_et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String text = search_et.getText().toString();
                search(text);
            }

            private void search(String charText) {

                arrayList.clear();

                if (charText.length() == 0) {
                    arrayList.addAll(list);
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).toLowerCase().contains(charText)) {
                            arrayList.add(list.get(i));
                        }
                    }
                }

                adapter.notifyDataSetChanged();
            }
        });
    }

    private void settingList() {
        list.add("시청");
        list.add("을지로입구(IBK기업은행)");
        list.add("을지로3가(신한카드)");
        list.add("을지로4가(BC카드)");
        list.add("동대문역사문화공원(DDP)");
        list.add("신당");
        list.add("상왕십리");
        list.add("왕십리(성동구청)");
        list.add("한양대");
        list.add("뚝섬");
        list.add("성수");
        list.add("건대입구");
        list.add("구의(광진구청)");
        list.add("강변(동서울터미널)");
        list.add("잠실나루");
        list.add("잠실(송파구청)");
        list.add("잠실새내");
        list.add("종합운동장");
        list.add("삼성(무역센터)");
        list.add("선릉");
        list.add("역삼(센터필드)");
        list.add("강남");
        list.add("교대(법원.검찰청)");
        list.add("서초");
        list.add("방배(백석예술대)");
        list.add("사당(대향병원)");
        list.add("낙성대(강감찬)");
        list.add("서울대입구(관악구청)");
        list.add("봉천");
        list.add("신림(양지병원)");
        list.add("신대방");
        list.add("구로디지털단지(원광디지털대)");
        list.add("대림(구로구청)");
        list.add("신도림");
        list.add("문래");
        list.add("영등포구청");
        list.add("당산");
        list.add("합정(홀트아동복지회)");
        list.add("홍대입구");
        list.add("신촌(지하)");
        list.add("이대");
        list.add("아현(추계예술대)");
        list.add("충정로(경기대입구)");
    }
}
