package com.bananakernel.banglasignlanguage.adapter;

import android.content.Context;

import android.graphics.ColorSpace;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bananakernel.banglasignlanguage.R;
import com.bananakernel.banglasignlanguage.model.model;

import java.util.ArrayList;

/**
 * Created by nbh on 3/17/2018.
 */

public class numberAdapter extends BaseAdapter {

    private Context context;

    private ArrayList<model> models;

    public numberAdapter(Context context, ArrayList<com.bananakernel.banglasignlanguage.model.model> models) {
        this.context = context;
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int i) {
        return models.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null)
        {
            view = View.inflate(context, R.layout.number_items , null);
        }

        ImageView images = view.findViewById(R.id.numberImageView);
        TextView title = view.findViewById(R.id.numberTextView);
        model model = models.get(i);
        images.setImageResource(model.getItemImage());
        title.setText(model.getItemTitle());





        return view;
    }
}
