package com.example.a.listviewexample3_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Baby> babyList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBabys();
        BabyAdapter adapter = new BabyAdapter(MainActivity.this, R.layout.baby_item, babyList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position,long id){
                Baby baby = babyList.get(position);
                Toast.makeText(MainActivity.this,baby.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initBabys(){
        for (int i=0;i<2;i++){
            Baby i1 = new Baby("毡帽系列","此服装有点CUTE，像不像勤劳的小车夫",R.drawable.i1);
            babyList.add(i1);
            Baby i2 = new Baby("蜗牛系列","宝贝变成了小蜗牛，爬啊爬啊爬",R.drawable.i2);
            babyList.add(i2);
            Baby i3= new Baby("小蜜蜂系列","小蜜蜂，嗡嗡嗡，飞到西，飞到东",R.drawable.i3);
            babyList.add(i3);
            Baby i4= new Baby("毡帽系列","此服装有点CUTE，像不像勤劳的小车夫",R.drawable.i4);
            babyList.add(i4);
            Baby i5= new Baby("蜗牛系列","宝贝变成了小蜗牛，爬啊爬啊爬", R.drawable.i5);
            babyList.add(i5);
            Baby i6= new Baby("小蜜蜂系列","小蜜蜂，嗡嗡嗡，飞到西，飞到东",R.drawable.i6);
            babyList.add(i6);
        }
    }
}