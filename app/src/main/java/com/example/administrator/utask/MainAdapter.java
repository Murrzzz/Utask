package com.example.administrator.utask;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Administrator on 5/20/2021.
 */

class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private final Context context;

    //ArrayList<ExampleItems>array;

    List<ExampleItems> array;
    RecyclerView recyclerView;
    final View.OnClickListener onClickListener=new MyOnclicklistener();


    public MainAdapter(Context context, List<ExampleItems> array, RecyclerView recyclerView) {
        this.context= context;
        this.array=array;
        this.recyclerView=recyclerView;

    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {//where XML you will use
        LayoutInflater inflater= LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.activity_items, parent, false);//were the design of the cardview
        view.setOnClickListener(onClickListener);

        ViewHolder viewholder= new ViewHolder(view);

        return viewholder;
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder holder, int position) {
        //ExampleItems currentItem =array.get(position);// Example items is a function that declare the variables
        ExampleItems exampleitems = array.get(position);
        holder.titles.setText(exampleitems.getmTitle());
        holder.messages.setText(exampleitems.getmMessge());
    }

    @Override
    public int getItemCount() {
        return array.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public TextView titles;
        public TextView messages;


        public ViewHolder(View itemView) {
            super(itemView);

            messages= (TextView) itemView.findViewById(R.id.txt_messages);
            titles=(TextView) itemView.findViewById(R.id.txt_titles);
        }
    }

    private class MyOnclicklistener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int itemPosition= recyclerView.getChildAdapterPosition(v);
            String item= array.get(itemPosition).getmTitle();
            Toast.makeText(context, item, Toast.LENGTH_SHORT).show();
        }
    }
}
