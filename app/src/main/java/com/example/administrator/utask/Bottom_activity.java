package com.example.administrator.utask;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by Administrator on 5/30/2021.
 */

public class Bottom_activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        BottomNavigationView bottomNav= (BottomNavigationView) findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }
        private BottomNavigationView.OnNavigationItemSelectedListener navListener=
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment =null;

                        switch (item.getItemId())
                        {
                            case R.id.nav_Home:
                                selectedFragment= new Home_Fragment();
                                break;
                            case R.id.nav_More:
                                selectedFragment= new More_Fragment();
                                break;
                        }
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                selectedFragment).commit();
                        return true;
                    }
                };


}
