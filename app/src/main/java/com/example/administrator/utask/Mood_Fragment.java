package com.example.administrator.utask;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Mood_Fragment extends Fragment implements View.OnClickListener {

    private TextView msgDisplay, srcDisplay;

    private String[] HappyMsg, HappyCrd, OkayMsg, OkayCrd, UpsetMsg, UpsetCrd, SadMsg, SadCrd;
    private Button btnHappy, btnOkay, btnUpset, btnSad, btnNext;
    private ImageView imgView, imgReply1, imgReply2, imgReply3;
    private TextView txtView, txtReply1, txtReply2, txtSource, txtMessage;
    private int randomIndex;
    private String rndText, rndCrd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_mood,container,false);

        imgView =(ImageView)v.findViewById(R.id.imageView11);
        txtView = (TextView) v.findViewById(R.id.textView);

        imgReply1 = (ImageView)v.findViewById(R.id.imgReply01);
        txtReply1 =(TextView) v. findViewById(R.id.txtReply01);

        imgReply2 =(ImageView)v. findViewById(R.id.imgReply02);
        txtReply2 =(TextView) v. findViewById(R.id.txtReply02);

        imgReply3 =(ImageView)v. findViewById(R.id.imgReply03);
        txtMessage = (TextView) v.findViewById(R.id.txtMoodMessage);
        txtSource = (TextView) v.findViewById(R.id.txtMoodSource);


        btnHappy=(Button) v. findViewById(R.id.button_Happy);
        btnHappy.setOnClickListener(this);
        btnOkay=(Button) v. findViewById(R.id.button_Okay);
        btnOkay.setOnClickListener(this);
        btnUpset=(Button) v. findViewById(R.id.button_Upset);
        btnUpset.setOnClickListener(this);
        btnSad=(Button) v. findViewById(R.id.button_Sad);
        btnSad.setOnClickListener(this);

        HappyMsg = getResources().getStringArray(R.array.moodHappyText);
        HappyCrd = getResources().getStringArray(R.array.moodHappyCrd);
        OkayMsg = getResources().getStringArray(R.array.moodOkayText);
        OkayCrd = getResources().getStringArray(R.array.moodOkayCrd);
        UpsetMsg = getResources().getStringArray(R.array.moodUpsetText);
        UpsetCrd = getResources().getStringArray(R.array.moodUpsetCrd);
        SadMsg = getResources().getStringArray(R.array.moodSadText);
        SadCrd = getResources().getStringArray(R.array.moodSadCrd);

        return v;
    }


    private void setVisibility(){
        imgView.setVisibility(View.GONE);
        txtView.setVisibility(View.GONE);
        btnHappy.setVisibility(View.GONE);
        btnOkay.setVisibility(View.GONE);
        btnUpset.setVisibility(View.GONE);
        btnSad.setVisibility(View.GONE);
        imgReply1.setVisibility(View.VISIBLE);
        txtReply1.setVisibility(View.VISIBLE);
        imgReply2.setVisibility(View.VISIBLE);
        txtReply2.setVisibility(View.VISIBLE);
        imgReply3.setVisibility(View.VISIBLE);
        txtMessage.setVisibility(View.VISIBLE);
        txtSource.setVisibility(View.VISIBLE);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button_Happy:
                randomIndex = new Random().nextInt(HappyMsg.length);
                rndText = HappyMsg[randomIndex];
                rndCrd = HappyCrd[randomIndex];

                setVisibility();
                txtReply1.setText("I've had a blast today! How about you?");
                txtReply2.setText("I'm having my best day today, too!");
                txtMessage.setText(rndText);
                txtSource.setText(rndCrd);
                break;

            case R.id.button_Okay:
                randomIndex = new Random().nextInt(OkayMsg.length);
                rndText = OkayMsg[randomIndex];
                rndCrd = OkayCrd[randomIndex];

                setVisibility();
                txtReply1.setText("I'm mostly fine today actually..");
                txtReply2.setText("You're already doing great, cheer up!");
                txtMessage.setText(rndText);
                txtSource.setText(rndCrd);
                break;

            case R.id.button_Upset:
                randomIndex = new Random().nextInt(UpsetMsg.length);
                rndText = UpsetMsg[randomIndex];
                rndCrd = UpsetCrd[randomIndex];

                setVisibility();
                txtReply1.setText("Nothing's going my way today, it's frustrating!");
                txtReply2.setText("Today's mishaps will pass. Don't worry!");
                txtMessage.setText(rndText);
                txtSource.setText(rndCrd);
                break;

            case R.id.button_Sad:
                randomIndex = new Random().nextInt(SadMsg.length);
                rndText = SadMsg[randomIndex];
                rndCrd = SadCrd[randomIndex];

                setVisibility();
                txtReply1.setText("i don't really feel good today..");
                txtReply2.setText("I'll be here when you need me, okay?");
                txtMessage.setText(rndText);
                txtSource.setText(rndCrd);
                break;

            default:
                break;
        }
    }
}
