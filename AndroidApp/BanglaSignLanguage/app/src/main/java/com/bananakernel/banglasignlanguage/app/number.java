package com.bananakernel.banglasignlanguage.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.bananakernel.banglasignlanguage.R;
import com.bananakernel.banglasignlanguage.model.NumberDetails;
import com.bananakernel.banglasignlanguage.model.model;
import com.bananakernel.banglasignlanguage.adapter.numberAdapter;

import java.util.ArrayList;

public class number extends AppCompatActivity {

    private ListView listView;

    private ArrayList<model> models;

    private numberAdapter numberAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        listView = (ListView) findViewById(R.id.list_view);
        models = NumberDetails.getList();


        numberAdapter = new numberAdapter(number.this,models);
        listView.setAdapter(numberAdapter);


    }
}
