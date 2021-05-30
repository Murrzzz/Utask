package com.example.administrator.utask;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private static  int SPLASH_TIME = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                goToStart();

            }
        },SPLASH_TIME);

    }

    private void goToStart()
    {
        Intent homeIntent = new Intent(this, Bottom_activity.class);
        startActivity(homeIntent);
        //finish();
    }

}
