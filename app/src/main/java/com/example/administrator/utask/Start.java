package com.example.administrator.utask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 5/29/2021.
 */

public class Start extends AppCompatActivity {



    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        button=(Button)findViewById(R.id.btnStart);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToMood();
            }
        });


    }

    private void goToMood()
    {
        Intent intent=new Intent(this, MoodRandom.class);
        startActivity(intent);
    }

}
