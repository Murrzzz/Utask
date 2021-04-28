package com.example.administrator.utask;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.btnStart);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainMenu();
            }
        });


    }

    private void mainMenu()
    {
        Intent intent=new Intent(this, main_menu.class);
        startActivity(intent);
    }




}
