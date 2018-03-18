package com.bananakernel.banglasignlanguage.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.bananakernel.banglasignlanguage.R;

import com.bananakernel.banglasignlanguage.adapter.consonantAdapter;
import com.bananakernel.banglasignlanguage.model.ConsonantDetails;
import com.bananakernel.banglasignlanguage.model.VowelDetails;
import com.bananakernel.banglasignlanguage.model.model;

import java.util.ArrayList;

public class consonant extends AppCompatActivity {

    private ListView listView;

    private ArrayList<model> models;

    private consonantAdapter consonantAdapter;

    public consonant() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consonant);
        listView = (ListView) findViewById(R.id.list_view);
        models = ConsonantDetails.getList();
        consonantAdapter = new consonantAdapter(consonant.this,models);
        listView.setAdapter(consonantAdapter);
    }
}
