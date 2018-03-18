package com.bananakernel.banglasignlanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.bananakernel.banglasignlanguage.app.consonant;
import com.bananakernel.banglasignlanguage.app.number;
import com.bananakernel.banglasignlanguage.app.vowel;

public class dictionary extends AppCompatActivity implements View.OnClickListener{

    private CardView numCard,vowCard,conCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);
        //defining cards
        numCard = (CardView) findViewById(R.id.number_card);
        vowCard = (CardView) findViewById(R.id.vowel_card);
        conCard = (CardView) findViewById(R.id.consonant_card);
        //clicklistener
        numCard.setOnClickListener(this);
        vowCard.setOnClickListener(this);
        conCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId())
        {
            case R.id.number_card : i = new Intent(this,number.class);startActivity(i); break;
            case R.id.vowel_card : i = new Intent(this,vowel.class);startActivity(i); break;
            case R.id.consonant_card : i = new Intent(this,consonant.class);startActivity(i); break;
            default:break ;
        }


    }
}
