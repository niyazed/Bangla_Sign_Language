package com.bananakernel.banglasignlanguage.model;

import com.bananakernel.banglasignlanguage.R;

import java.util.ArrayList;

/**
 * Created by nbh on 3/17/2018.
 */

public class NumberDetails {

    public static ArrayList<model> getList(){
        ArrayList<model> numberList = new ArrayList<>();

        numberList.add(new model(R.drawable.one,"১ (-এক)"));
        numberList.add(new model(R.drawable.two,"২ (-দুই)"));
        numberList.add(new model(R.drawable.three,"৩ (-তিন)"));
        numberList.add(new model(R.drawable.four,"৪ (-চার)"));
        numberList.add(new model(R.drawable.five,"৫ (-পাঁচ)"));
        numberList.add(new model(R.drawable.six,"৬ (-ছয়)"));
        numberList.add(new model(R.drawable.seven,"৭ (-সাত)"));
        numberList.add(new model(R.drawable.eight,"৮ (-আট)"));
        numberList.add(new model(R.drawable.nine,"৯ (-নয়)"));
        numberList.add(new model(R.drawable.ten,"১০ (-দশ)"));

        return numberList;
    }
}
