package com.example.administrator.utask;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 5/30/2021.
 */

public class More_Fragment extends Fragment implements  View.OnClickListener {
    //Buttons on articles
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_more,container,false);

        button1=(Button) v.findViewById(R.id.btndepedtambayan);
        button1.setOnClickListener(this);// calling on click method
        button2=(Button) v.findViewById(R.id.btnpdfdrive);
        button2.setOnClickListener(this);// calling on click method
        button3=(Button) v.findViewById(R.id.btncheatography);
        button3.setOnClickListener(this);// calling on click method
        button4=(Button) v.findViewById(R.id.btnacademia);
        button4.setOnClickListener(this);// calling on click method
        button5=(Button) v.findViewById(R.id.btnslidesgo);
        button5.setOnClickListener(this);// calling on click method
        button6=(Button) v.findViewById(R.id.btnprintfriendly);
        button6.setOnClickListener(this);   // calling   on click method
        button7=(Button) v.findViewById(R.id.btnphotomath);
        button7.setOnClickListener(this);// calling on click method

return v ;
    }

    private void declare()
    {

    }

    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
        switch (v.getId()){
            case R.id.btndepedtambayan:
                Toast.makeText(getContext(),"Deped Tambayan", Toast.LENGTH_SHORT).show();
                Intent intent1 =new Intent(Intent.ACTION_VIEW, Uri.parse("https://depedtambayan.org/k-12-workbooks-download/"));
                startActivity(intent1   );
                break;
            case R.id.btnpdfdrive:
                Toast.makeText(getContext(),"Pdf Drice", Toast.LENGTH_SHORT).show();
                Intent intent2 =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pdfdrive.com/"));
                startActivity(intent2   );
                break;
            case R.id.btncheatography:
                Toast.makeText(getContext(),"Cheatography", Toast.LENGTH_SHORT).show();
                Intent intent3 =new Intent(Intent.ACTION_VIEW, Uri.parse("https://cheatography.com/"));
                startActivity(intent3   );
                break;
            case R.id.btnacademia:
                Toast.makeText(getContext(),"Academia", Toast.LENGTH_SHORT).show();
                Intent intent4 =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.academia.edu/"));
                startActivity(intent4   );
                break;
            case R.id.btnslidesgo:
                Toast.makeText(getContext(),"Slides Go", Toast.LENGTH_SHORT).show();
                Intent intent5 =new Intent(Intent.ACTION_VIEW, Uri.parse("https://slidesgo.com/"));
                startActivity(intent5   );
                break;
            case R.id.btnprintfriendly:
                Toast.makeText(getContext(),"PrintedFriendly", Toast.LENGTH_SHORT).show();
                Intent intent6 =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.printfriendly.com/"));
                startActivity(intent6   );
                break;
            case R.id.btnphotomath:
                Toast.makeText(getContext(),"Photomath", Toast.LENGTH_SHORT).show();
                Intent intent7 =new Intent(Intent.ACTION_VIEW, Uri.parse("https://photomath.com/en/"));
                startActivity(intent7   );
                break;
            default:
                break;
        }
    }
}
