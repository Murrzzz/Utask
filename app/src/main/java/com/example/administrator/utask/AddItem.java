
package com.example.administrator.utask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 5/20/2021.
 */

public class AddItem extends AppCompatActivity {

    Button addbutton;
    Button removeButton;
    EditText message;
    EditText title;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additems);

        title=(EditText)findViewById(R.id.txttitle);
        addbutton=(Button)findViewById(R.id.add_button);
        message=(EditText)findViewById(R.id.text_message);
        db=new DBHelper(this);



        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insertInfo();
            }
        });

    }

    public  void Add_items()
    {
        EditText message=(EditText) findViewById(R. id.text_message);
        EditText title= (EditText) findViewById(R.id.txttitle);


        String txt_title=title.getText().toString();
        String txt_message=message.getText().toString();

        if(!(txt_title.equals("")||(txt_message.equals(""))))
        {
            Intent intent= new Intent(this,AddList.class);

            intent.putExtra("Title",txt_title);
            intent.putExtra("Message",txt_message);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getApplication(),"Please Enter Value..", Toast.LENGTH_LONG).show();
        }

    }
    private void insertInfo()
    {
        String Textone= title.getText().toString();
        String Texttwo=message.getText().toString();
        boolean result =db.insertInfo(Textone,Texttwo);
        Intent intent=new Intent(this, main_menu.class);
        startActivity(intent);
        if (result)
            Toast.makeText(this,"Insert Success", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"Insert Failed", Toast.LENGTH_SHORT).show();

    }

    private void deleteInfo()
    {
        String id =title.getText().toString();
        int result =db.deleteInfo(id);
        Toast.makeText(this,result+" :Rows affected", Toast.LENGTH_LONG).show();

    }

}