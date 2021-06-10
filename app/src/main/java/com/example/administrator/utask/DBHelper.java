package com.example.administrator.utask;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 5/21/2021.
 */

public class DBHelper extends SQLiteOpenHelper {

    DBHelper helper;
    SQLiteDatabase db;

    List<ExampleItems> array =new ArrayList<>();

    public static final String DATABASE_NAME="Note";
    public static final String TABLE_NAME="TBL_INFO";
    public static final String COL_ONE="TITLE";
    public static final String COL_TWO="MESSAGE";
    public static final String CREATE_TABLE="CREATE TABLE "+TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, MESSAGE TEXT)";
    public static final String DROP_TABLE="DROP TABLE IF EXISTS"+TABLE_NAME;


    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }




    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
    }


/*
    public String getAlldata()
    {
        String columns[]={DBHelper.COL_ONE,DBHelper.COL_TWO};
        Cursor cursor= db.query(DBHelper.TABLE_NAME,columns,null,null,null,null,null);
        StringBuffer buffer=new StringBuffer();
        while (cursor.moveToNext())
        {
            int index1= cursor.getColumnIndex(DBHelper.COL_ONE);
            String title= cursor.getString(index1);
            int index2=cursor.getColumnIndex(DBHelper.COL_TWO);
            String message=cursor.getString(index2);
            buffer.append(title+""+message+""+ "\n");
        }
        return buffer.toString();
    }

*/

        public List<ExampleItems> getAllData()
        {
            SQLiteDatabase db=this.getReadableDatabase();

            String[] columns ={COL_ONE,
                               COL_TWO};
            Cursor cursor= db.query(TABLE_NAME,columns,null,null,null,null,null);



            while (cursor.moveToNext())
            {

                int index1= cursor.getColumnIndex(COL_ONE);
                String title= cursor.getString(index1);
                int index2=cursor.getColumnIndex(COL_TWO);
                String message=cursor.getString(index2);
                ExampleItems exampleItems =new ExampleItems(title,message);
                array.add(exampleItems);
            }
            return array;
        }






    //Insert
    public  boolean insertInfo(String text1, String text2)
    {
        SQLiteDatabase sqLiteDatabase= this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_ONE, text1);
        contentValues.put(COL_TWO,text2);
        long result =sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
        sqLiteDatabase.close();

        return  result != -1;

    }

    //Delete
    public Integer deleteInfo(String id)
    {
        SQLiteDatabase db =this.getReadableDatabase();
        return  db.delete(TABLE_NAME,"TITLE=?",new String[]{id});
    }

}
