package com.example.administrator.utask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 5/22/2021.
 */

public class RemoveItems extends AppCompatActivity {

    EditText title;
    Button remove;
    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove);

        title=(EditText)findViewById(R.id.txtTitle);
        remove=(Button)findViewById(R.id.remove_button);
        db =new DBHelper(this);

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                deleteInfo();

            }
        });
    }


    private void deleteInfo()
    {
        String id =title.getText().toString();
        int result =db.deleteInfo(id);
        Toast.makeText(this,result+" :Rows affected", Toast.LENGTH_LONG).show();
    }

}
