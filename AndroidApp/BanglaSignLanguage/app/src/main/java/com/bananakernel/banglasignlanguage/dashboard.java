package com.bananakernel.banglasignlanguage;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toolbar;

public class dashboard extends AppCompatActivity implements View.OnClickListener{

    private CardView cameraCard,dictionaryCard,howToCard,aboutUsCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        //defining cards
        cameraCard = (CardView) findViewById(R.id.camera_card);
        dictionaryCard = (CardView) findViewById(R.id.dictionary_card);
        howToCard = (CardView) findViewById(R.id.howTo_card);
        aboutUsCard = (CardView) findViewById(R.id.aboutUs_card);
        //Add Click Listener
        cameraCard.setOnClickListener(this);
        dictionaryCard.setOnClickListener(this);
        howToCard.setOnClickListener(this);
        aboutUsCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;
        switch (v.getId())
        {
            case R.id.camera_card : i = new Intent(this,camera.class);startActivity(i); break;
            case R.id.dictionary_card : i = new Intent(this,dictionary.class);startActivity(i); break;
            case R.id.howTo_card : i = new Intent(this,howto.class);startActivity(i); break;
            case R.id.aboutUs_card : i = new Intent(this,aboutus.class);startActivity(i); break;
            default:break ;

        }

    }
}
