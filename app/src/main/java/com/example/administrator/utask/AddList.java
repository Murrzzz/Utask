package com.example.administrator.utask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 5/20/2021.
 */

public class AddList extends AppCompatActivity {


    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;
    List<ExampleItems> array=new ArrayList<>();
    DBHelper databaseAdapter;
    MainAdapter mainAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addlist);//where the recycler view in the XML declare


        mRecyclerView=(RecyclerView)findViewById(R.id.recycler);


        databaseAdapter= new DBHelper(this);
        mLayoutManager= new LinearLayoutManager(this);
        array=databaseAdapter.getAllData();
        mainAdapter=new MainAdapter(this,array,mRecyclerView);//Main Adapter is a funtion for adapter
        mRecyclerView.setLayoutManager(mLayoutManager);//Setting the layout manager and the Adapter
        mRecyclerView.setAdapter(mainAdapter);


        mRecyclerView.setHasFixedSize(true);
        //Example items is a class to store the text and images


        /*
        Bundle extras=getIntent().getExtras();
        if (extras!=null)
        {
            String value=extras.getString("Title");
            String value1=extras.getString("Message");

         //   array.add(new ExampleItems(value, value));

        }
        else
        {
            Toast.makeText(getApplication(),"No Api..",Toast.LENGTH_LONG).show();
        }
*/

       // array.add(new ExampleItems(R.drawable .ic_assignment_turned_in_black_24dp ,"Roger"));//adding values to the array using Exampleitems method








    }
}
