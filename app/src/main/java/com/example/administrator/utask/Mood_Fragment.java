package com.example.administrator.utask;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Mood_Fragment extends Fragment {

    private TextView msgDisplay, srcDisplay;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_mood,container,false);

        srcDisplay = view.findViewById(R.id.textSource);
        msgDisplay = view.findViewById(R.id.textMessage);

        return view;

    }




}

