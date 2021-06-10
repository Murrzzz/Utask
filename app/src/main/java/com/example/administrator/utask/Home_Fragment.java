package com.example.administrator.utask;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 5/30/2021.
 */

public class Home_Fragment extends Fragment {
    Toast myToast;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_home,container,false);

        Calendar calendar = Calendar.getInstance();
        int currentDayCount = calendar.get(Calendar.DAY_OF_YEAR);
        TextView dayCountDisplay = (TextView) v.findViewById(R.id.txtDayCount);
        dayCountDisplay.setText("DAY #" + currentDayCount);


        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        String currentDay= dayFormat.format(new Date());
        TextView dayDisplay = (TextView)v.findViewById(R.id.txtDay);
        dayDisplay.setText(currentDay);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        String currentDate = dateFormat.format(new Date());
        TextView dateDisplay = (TextView) v.findViewById(R.id.txtDate);
        dateDisplay.setText(currentDate);


        Button buttonViewTasks =(Button)v.findViewById(R.id.btnViewTasks);
        buttonViewTasks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(myToast!= null)
                    myToast.cancel();
                myToast = Toast.makeText(getContext(),"View All Tasks", Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.BOTTOM,0,50);
                myToast.show();
                selectList();
            }
        });

        Button buttonAddTasks =(Button)v.findViewById(R.id.btnAddTasks);
        buttonAddTasks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(myToast!= null)
                    myToast.cancel();
                myToast = Toast.makeText(getContext(),"Add Tasks", Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.BOTTOM,0,50);
                myToast.show();
                AddNotes();
            }
        });



        Button buttonAboutUs =(Button)v.findViewById(R.id.btnAboutUs);
        buttonAboutUs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(myToast!= null)
                    myToast.cancel();
                myToast = Toast.makeText(getContext(),"About Us", Toast.LENGTH_SHORT);
                myToast.setGravity(Gravity.BOTTOM,0,50);
                myToast.show();
                selectAboutUs();
            }
        });


        return v;
    }



    private void selectAboutUs()
    {
        Intent intent=new Intent(getActivity(), About_Us.class);
        startActivity(intent);
    }

    private void AddNotes()
    {
        Intent intent= new Intent(getActivity(), AddItem.class);
        startActivity(intent);
    }

    private void selectList()
    {
        Intent intent= new Intent(getActivity(), AddList.class);
        startActivity(intent);
    }
    private void removeItems()
    {
        Intent intent= new Intent(getActivity(), RemoveItems.class);
        startActivity(intent);
    }
}
