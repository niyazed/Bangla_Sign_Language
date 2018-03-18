package com.bananakernel.banglasignlanguage.model;

import com.bananakernel.banglasignlanguage.R;

import java.util.ArrayList;

/**
 * Created by nbh on 3/17/2018.
 */

public class VowelDetails {

    public static ArrayList<model> getList(){
        ArrayList<model> vowelList = new ArrayList<>();

        vowelList.add(new model(R.drawable.b1,"অ/য়"));
        vowelList.add(new model(R.drawable.b2,"আ/া"));
        vowelList.add(new model(R.drawable.b3,"ই/ঈ,ি/ী"));
        vowelList.add(new model(R.drawable.b4,"উ/ঊ/ু/ূ"));
        vowelList.add(new model(R.drawable.b5,"ঋ,র,ড়,ঢ়,ৃ"));
        vowelList.add(new model(R.drawable.b6,"এ/ে"));
        vowelList.add(new model(R.drawable.b7,"ঐ/ৈ"));
        vowelList.add(new model(R.drawable.b8,"ও/ো"));
        vowelList.add(new model(R.drawable.b9,"ঔ/ৌ"));


        return vowelList;
    }
}
