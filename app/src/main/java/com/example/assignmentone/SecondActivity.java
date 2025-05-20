package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    //When button is clicked execute this code
    public void onClickStartSecond(View view){
        //When button on this activity is clicked it will take the user to the next activity
        Intent intent = new Intent(this, FunFactActivity.class);
        startActivity(intent);
    }
}