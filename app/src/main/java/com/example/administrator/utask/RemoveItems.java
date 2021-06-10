
package com.example.administrator.utask;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;

/**
 * Created by Administrator on 5/22/2021.
 */

public class RemoveItems extends AppCompatActivity {

    EditText title;
    EditText message;
    EditText IDS;
    FloatingActionButton remove;
    FloatingActionButton update;
    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove);

        title=(EditText)findViewById(R.id.txtTitle);
        remove=(FloatingActionButton)findViewById(R.id.remove_button);
        update=(FloatingActionButton) findViewById(R.id.update_button);
        message=(EditText)findViewById(R.id.message_text);


        IDS=(EditText)findViewById(R.id.IDS);
        Intent intent = getIntent();
        String item = intent.getStringExtra("message1");
        title.setText(item);

        String messages = intent.getStringExtra("message2");
        message.setText(messages);

        int ID = getIntent().getExtras().getInt("message3");
        String str1 = Integer.toString(ID);
        IDS.setText(str1);
        db =new DBHelper(this);

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(RemoveItems.this);
                alertDialogBuilder.setTitle("Confirm");//Title
                alertDialogBuilder.setMessage("Do you like to Delete?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                deleteInfo();// When you click yes
                                RemoveItems.this.finish();
                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //When you click no
                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog =alertDialogBuilder.create();//Create the alert dialog
                alertDialog.show();//show the dialog

            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //showWarning();
                YesorNo();

            }
        });

        ;
    }

    private void showWarning()
    {
        AlertDialog.Builder builder= new AlertDialog.Builder(RemoveItems.this, R.style.AlertDialogTheme);
        View view = LayoutInflater.from(RemoveItems.this).inflate(
                R.layout.layout_success_dialog,
                (ConstraintLayout)findViewById(R.id.dialog_container)
        );
        builder.setView(view);
        ((TextView)view.findViewById(R.id.textTitle)).setText(getResources().getString(R.string.success_title));
        ((TextView)view.findViewById(R.id.textmessage)).setText(getResources().getString(R.string.dummy_text));
        ((Button)view.findViewById(R.id.buttonaction)).setText(getResources().getString(R.string.okay));
        ((ImageView)view.findViewById(R.id.imageicon)).setImageResource(R.drawable.ic_done);

        final  AlertDialog alertDialog= builder.create();

        view.findViewById(R.id.buttonaction).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();;
            }
        });
        if(alertDialog.getWindow()!=null)
        {
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }

    private void YesorNo()
    {
        AlertDialog.Builder builder= new AlertDialog.Builder(RemoveItems.this, R.style.AlertDialogTheme);
        View view = LayoutInflater.from(RemoveItems.this).inflate(
                R.layout.layout_warning_dialog,
                (ConstraintLayout)findViewById(R.id.dialog_container)
        );
        builder.setView(view);
        ((TextView)view.findViewById(R.id.textTitle)).setText(getResources().getString(R.string.success_title));
        ((TextView)view.findViewById(R.id.textmessage)).setText(getResources().getString(R.string.dummy_text));
        ((Button)view.findViewById(R.id.buttonYes)).setText(getResources().getString(R.string.yes));
        ((Button)view.findViewById(R.id.buttonNo)).setText(getResources().getString(R.string.no));
        ((ImageView)view.findViewById(R.id.imageicon)).setImageResource(R.drawable.ic_warning);

        final  AlertDialog alertDialog= builder.create();

        view.findViewById(R.id.buttonYes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //Yes button
                    alertDialog.dismiss();;
            }
        });



        view.findViewById(R.id.buttonNo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //No button
                alertDialog.dismiss();;
            }
        });

        if(alertDialog.getWindow()!=null)
        {
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }

    private void updateInfo() {
        String ids =title.getText().toString();
        String editText = message.getText().toString();
        String ID = IDS.getText().toString();
        boolean result = db.updateInfo(ids,editText,ID);
        Intent intent=new Intent(this, Bottom_activity.class);
        startActivity(intent);
        if (result)
            Toast.makeText(this,"UPDATED SUCCESSFULLY", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"Insert Failed", Toast.LENGTH_SHORT).show();
    }


    private void deleteInfo()
    {
        String id =title.getText().toString();
        int result =db.deleteInfo(id);
        Intent intent=new Intent(this, Bottom_activity.class);
        startActivity(intent);
        Toast.makeText(this,result+" :Rows affected", Toast.LENGTH_LONG).show();
    }
}