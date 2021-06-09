package com.example.administrator.utask;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by Administrator on 5/30/2021.
 */

public class Home_Fragment extends Fragment {

    /*String moodMessage, moodSource;
    TextView msgDisplay, srcDisplay;*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_home,container,false);

        return view;
    }


}
