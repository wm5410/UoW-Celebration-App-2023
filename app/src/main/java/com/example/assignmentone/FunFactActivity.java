package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact);

        //Declare views to manipulate
        ImageView iv = (ImageView)findViewById(R.id.factBg);
        TextView tv = (TextView)findViewById(R.id.textView1);

        //Declare string variables
        String f0 = getString(R.string.funFact0);
        String f1 = getString(R.string.funFact1);
        String f2 = getString(R.string.funFact2);
        String f3 = getString(R.string.funFact3);
        String f4 = getString(R.string.funFact4);
        String f5 = getString(R.string.funFact5);
        String f6 = getString(R.string.funFact6);
        String f7 = getString(R.string.funFact7);

        //Random number generator between 0 and 7
        Random r = new Random();
        int rng = (r.nextInt(7));

        //Change text and bg depending on number
        if(rng == 0){
            iv.setImageDrawable(getResources().getDrawable(R.drawable.img_fun_fact_0, getTheme()));
            tv.setText(f0);
        } else if (rng == 1) {
            iv.setImageDrawable(getResources().getDrawable(R.drawable.img_fun_fact_1, getTheme()));
            tv.setText(f1);
        } else if (rng == 2) {
            iv.setImageDrawable(getResources().getDrawable(R.drawable.img_fun_fact_2, getTheme()));
            tv.setText(f2);
        } else if (rng == 3) {
            iv.setImageDrawable(getResources().getDrawable(R.drawable.img_fun_fact_3, getTheme()));
            tv.setText(f3);
        } else if (rng == 4) {
            iv.setImageDrawable(getResources().getDrawable(R.drawable.img_fun_fact_4, getTheme()));
            tv.setText(f4);
        } else if (rng == 5) {
            iv.setImageDrawable(getResources().getDrawable(R.drawable.img_fun_fact_5, getTheme()));
            tv.setText(f5);
        } else if (rng == 6) {
            iv.setImageDrawable(getResources().getDrawable(R.drawable.img_fun_fact_6, getTheme()));
            tv.setText(f6);
        } else if (rng == 7) {
            iv.setImageDrawable(getResources().getDrawable(R.drawable.img_fun_fact_7, getTheme()));
            tv.setText(f7);
        }

    }

}