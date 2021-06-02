package com.example.administrator.utask;

/**
 * Created by Administrator on 5/21/2021.
 */



public class ExampleItems {


    private String mTitle;
    private String mMessge;
    private int ID;

    public ExampleItems(String mTitle, String mMessge, int ID) {
        this.mTitle = mTitle;
        this.mMessge = mMessge;
        this.ID = ID;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmMessge() {
        return mMessge;
    }

    public int getID() {
        return ID;
    }
}