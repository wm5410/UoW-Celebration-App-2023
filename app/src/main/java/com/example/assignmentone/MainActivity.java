package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //When button is clicked execute this code
    public void onClickStart(View view) {
        //When button on this activity is clicked it will take the user to the next activity
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}