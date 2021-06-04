package com.example.administrator.utask;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MoodRandom extends AppCompatActivity implements View.OnClickListener{

    private String[] HappyMsg, HappyCrd, OkayMsg, OkayCrd, UpsetMsg, UpsetCrd, SadMsg, SadCrd;
    private Button btnHappy, btnOkay, btnUpset, btnSad, btnNext;
    private ImageView imgView, imgReply1, imgReply2, imgReply3;
    private TextView txtView, txtReply1, txtReply2, txtSource, txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodrandom);

        imgView = findViewById(R.id.imageView11);
        txtView = findViewById(R.id.textView);

        imgReply1 = findViewById(R.id.imgReply01);
        txtReply1 = findViewById(R.id.txtReply01);

        imgReply2 = findViewById(R.id.imgReply02);
        txtReply2 = findViewById(R.id.txtReply02);

        imgReply3 = findViewById(R.id.imgReply03);
        txtMessage = findViewById(R.id.txtMoodMessage);
        txtSource = findViewById(R.id.txtMoodSource);

        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHome();
            }
        });

        btnHappy=findViewById(R.id.button_Happy);
        btnHappy.setOnClickListener(this);
        btnOkay=findViewById(R.id.button_Okay);
        btnOkay.setOnClickListener(this);
        btnUpset=findViewById(R.id.button_Upset);
        btnUpset.setOnClickListener(this);
        btnSad=findViewById(R.id.button_Sad);
        btnSad.setOnClickListener(this);

        HappyMsg = getResources().getStringArray(R.array.moodHappyText);
        HappyCrd = getResources().getStringArray(R.array.moodHappyCrd);
        OkayMsg = getResources().getStringArray(R.array.moodOkayText);
        OkayCrd = getResources().getStringArray(R.array.moodOkayCrd);
        UpsetMsg = getResources().getStringArray(R.array.moodUpsetText);
        UpsetCrd = getResources().getStringArray(R.array.moodUpsetCrd);
        SadMsg = getResources().getStringArray(R.array.moodSadText);
        SadCrd = getResources().getStringArray(R.array.moodSadCrd);

    }
    @Override
    public void onClick(View v) {

        int randomIndex;
        String rndText, rndCrd;

        switch(v.getId()){
            case R.id.button_Happy:
                randomIndex = new Random().nextInt(HappyMsg.length);
                rndText = HappyMsg[randomIndex];
                rndCrd = HappyCrd[randomIndex];

                imgView.setVisibility(View.GONE);
                txtView.setVisibility(View.GONE);
                btnHappy.setVisibility(View.GONE);
                btnOkay.setVisibility(View.GONE);
                btnUpset.setVisibility(View.GONE);
                btnSad.setVisibility(View.GONE);

                imgReply1.setVisibility(View.VISIBLE);
                txtReply1.setText("I've had a blast today! How about you?");
                txtReply1.setVisibility(View.VISIBLE);

                imgReply2.setVisibility(View.VISIBLE);
                txtReply2.setText("I'm having my best day today, too!");
                txtReply2.setVisibility(View.VISIBLE);

                imgReply3.setVisibility(View.VISIBLE);
                txtMessage.setText(rndText);
                txtSource.setText(rndCrd);
                txtMessage.setVisibility(View.VISIBLE);
                txtSource.setVisibility(View.VISIBLE);

                btnNext.setVisibility(View.VISIBLE);

                break;

            case R.id.button_Okay:
                randomIndex = new Random().nextInt(OkayMsg.length);
                rndText = OkayMsg[randomIndex];
                rndCrd = OkayCrd[randomIndex];

                imgView.setVisibility(View.GONE);
                txtView.setVisibility(View.GONE);
                btnHappy.setVisibility(View.GONE);
                btnOkay.setVisibility(View.GONE);
                btnUpset.setVisibility(View.GONE);
                btnSad.setVisibility(View.GONE);

                imgReply1.setVisibility(View.VISIBLE);
                txtReply1.setText("I'm mostly fine today actually..");
                txtReply1.setVisibility(View.VISIBLE);

                imgReply2.setVisibility(View.VISIBLE);
                txtReply2.setText("You're already doing great, cheer up!");
                txtReply2.setVisibility(View.VISIBLE);

                imgReply3.setVisibility(View.VISIBLE);
                txtMessage.setText(rndText);
                txtSource.setText(rndCrd);
                txtMessage.setVisibility(View.VISIBLE);
                txtSource.setVisibility(View.VISIBLE);

                btnNext.setVisibility(View.VISIBLE);

                break;

            case R.id.button_Upset:
               randomIndex = new Random().nextInt(UpsetMsg.length);
                rndText = UpsetMsg[randomIndex];
                rndCrd = UpsetCrd[randomIndex];

                imgView.setVisibility(View.GONE);
                txtView.setVisibility(View.GONE);
                btnHappy.setVisibility(View.GONE);
                btnOkay.setVisibility(View.GONE);
                btnUpset.setVisibility(View.GONE);
                btnSad.setVisibility(View.GONE);

                imgReply1.setVisibility(View.VISIBLE);
                txtReply1.setText("Nothing's going my way today, it's frustrating!");
                txtReply1.setVisibility(View.VISIBLE);

                imgReply2.setVisibility(View.VISIBLE);
                txtReply2.setText("Today's mishaps will pass. Don't worry!");
                txtReply2.setVisibility(View.VISIBLE);

                imgReply3.setVisibility(View.VISIBLE);
                txtMessage.setText(rndText);
                txtSource.setText(rndCrd);
                txtMessage.setVisibility(View.VISIBLE);
                txtSource.setVisibility(View.VISIBLE);

                btnNext.setVisibility(View.VISIBLE);

                break;

            case R.id.button_Sad:
                randomIndex = new Random().nextInt(SadMsg.length);
                rndText = SadMsg[randomIndex];
                rndCrd = SadCrd[randomIndex];

                imgView.setVisibility(View.GONE);
                txtView.setVisibility(View.GONE);
                btnHappy.setVisibility(View.GONE);
                btnOkay.setVisibility(View.GONE);
                btnUpset.setVisibility(View.GONE);
                btnSad.setVisibility(View.GONE);

                imgReply1.setVisibility(View.VISIBLE);
                txtReply1.setText("i don't really feel good today..");
                txtReply1.setVisibility(View.VISIBLE);

                imgReply2.setVisibility(View.VISIBLE);
                txtReply2.setText("I'll be here when you need me, okay?");
                txtReply2.setVisibility(View.VISIBLE);

                imgReply3.setVisibility(View.VISIBLE);
                txtMessage.setText(rndText);
                txtSource.setText(rndCrd);
                txtMessage.setVisibility(View.VISIBLE);
                txtSource.setVisibility(View.VISIBLE);

                btnNext.setVisibility(View.VISIBLE);

                break;

            default:
                break;


        }
            //goToHome();
    }

    private void goToHome()
    {
        Intent homeIntent = new Intent(this, Bottom_activity.class);
        startActivity(homeIntent);
        //finish();
    }


}
