package com.example.administrator.utask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class main_menu extends AppCompatActivity {

    Toast myToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Calendar calendar = Calendar.getInstance();
        int currentDayCount = calendar.get(Calendar.DAY_OF_YEAR);
        TextView dayCountDisplay = (TextView) findViewById(R.id.txtDayCount);
        dayCountDisplay.setText("DAY #" + currentDayCount);


        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        String currentDay= dayFormat.format(new Date());
        TextView dayDisplay = (TextView)findViewById(R.id.txtDay);
        dayDisplay.setText(currentDay);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        String currentDate = dateFormat.format(new Date());
        TextView dateDisplay = (TextView) findViewById(R.id.txtDate);
        dateDisplay.setText(currentDate);


        Button buttonViewTasks =(Button)findViewById(R.id.btnViewTasks);
        buttonViewTasks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(myToast!= null)
                    myToast.cancel();
                myToast = Toast.makeText(getApplicationContext(),"View All Tasks", Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.BOTTOM,0,50);
                myToast.show();
                selectList();
            }
        });

        Button buttonAddTasks =(Button)findViewById(R.id.btnAddTasks);
        buttonAddTasks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(myToast!= null)
                    myToast.cancel();
                myToast = Toast.makeText(getApplicationContext(),"Add Tasks", Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.BOTTOM,0,50);
                myToast.show();
                AddNotes();
            }
        });



        Button buttonAboutUs =(Button)findViewById(R.id.btnAboutUs);
        buttonAboutUs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(myToast!= null)
                    myToast.cancel();
                myToast = Toast.makeText(getApplicationContext(),"About Us", Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.BOTTOM,0,50);
                myToast.show();
                selectAboutUs();
            }
        });
    }
    private void selectAboutUs()
    {
        Intent intent=new Intent(this, About_Us.class);
        startActivity(intent);
    }

    private void AddNotes()
    {
        Intent intent= new Intent(this, AddItem.class);
        startActivity(intent);
    }

    private void selectList()
    {
        Intent intent= new Intent(this, AddList.class);
        startActivity(intent);
    }
    private void removeItems()
    {
        Intent intent= new Intent(this, RemoveItems.class);
        startActivity(intent);
    }
}
