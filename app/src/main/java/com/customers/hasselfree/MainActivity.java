package com.customers.hasselfree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private customeradapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);
        ArrayList<customers> customerslist = new ArrayList<>();
        customerslist.add(new customers(R.drawable.girl5, "Ananya Gupta",  4   ));
        customerslist.add(new customers(R.drawable.girl6, "Rashmi Tyagi",  5   ));
        customerslist.add(new customers(R.drawable.boy, "Vibhor Chhabra",3   ));
        customerslist.add(new customers(R.drawable.girl4, "Karishma Yadav",2   ));
        customerslist.add(new customers(R.drawable.boy2, "Priyam Madan",  1   ));

        LayoutInflater inflater = getLayoutInflater();
        ViewGroup header = (ViewGroup)inflater.inflate(R.layout.activity_header,listView,false);
        listView.addHeaderView(header);

        mAdapter = new customeradapter(this,customerslist);
        listView.setAdapter(mAdapter);

    }
}


