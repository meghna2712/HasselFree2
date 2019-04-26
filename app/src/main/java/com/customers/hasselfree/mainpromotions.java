package com.customers.hasselfree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class mainpromotions extends AppCompatActivity {

    private ListView listView;
    private promotionadapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);
        ArrayList<promotions> promotonslist = new ArrayList<>();
        promotonslist.add(new promotions("Strawberry Herbal Shampoo- Buy one get one free ", "SHSB1",  "For Customers with Rating -4 and above"   ));
        promotonslist.add(new promotions("Lemon Herbal Handwash- 30% off ", "SHH30",  "For Customers with Rating -3 and above"   ));
        promotonslist.add(new promotions("Strawberry Herbal Shampoo- Buy two get one free ", "SHSB2",  "For Customers with Rating -2 and above"   ));
        promotonslist.add(new promotions("Sandalwood Herbal Liquid soup- 10% off ", "SHSB2",  "For all Customers"   ));
        promotonslist.add(new promotions("Sandalwood Herbal Liquid soup- 10% off ", "SHSB2",  "For all Customers"   ));
        promotonslist.add(new promotions("Sandalwood Herbal Liquid soup- 10% off ", "SHSB2",  "For all Customers"   ));

        LayoutInflater inflater = getLayoutInflater();
        ViewGroup header = (ViewGroup)inflater.inflate(R.layout.activity_promotionsheader,listView,false);
        listView.addHeaderView(header);

        mAdapter = new promotionadapter(this, promotonslist);
        listView.setAdapter(mAdapter);

    }
}
