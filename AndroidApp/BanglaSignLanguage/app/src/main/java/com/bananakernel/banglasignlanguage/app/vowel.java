package com.bananakernel.banglasignlanguage.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.bananakernel.banglasignlanguage.R;
import com.bananakernel.banglasignlanguage.adapter.numberAdapter;
import com.bananakernel.banglasignlanguage.adapter.vowelAdapter;
import com.bananakernel.banglasignlanguage.model.VowelDetails;
import com.bananakernel.banglasignlanguage.model.model;

import java.util.ArrayList;

public class vowel extends AppCompatActivity {

    private ListView listView;

    private ArrayList<model> models;

    private vowelAdapter vowelAdapter;

    public vowel() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vowel);
        listView = (ListView) findViewById(R.id.list_view);
        models = VowelDetails.getList();



        vowelAdapter = new vowelAdapter(vowel.this,models);
        listView.setAdapter(vowelAdapter);
    }
}
