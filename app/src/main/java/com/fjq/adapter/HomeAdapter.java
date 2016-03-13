package com.fjq.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fjq.activity.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FJQ on 2016/3/13.
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>
{
    private Context context;
    private LayoutInflater layoutInflater;
    private List<String> objects = new ArrayList<>();

    public HomeAdapter(Context context, List<String> objects) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.objects = objects;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        MyViewHolder holder = new MyViewHolder(layoutInflater.inflate(R.layout.item_home, parent,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        holder.tv.setText(objects.get(position));
    }

    @Override
    public int getItemCount()
    {
        return objects.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView tv;

        public MyViewHolder(View view)
        {
            super(view);
            tv = (TextView) view.findViewById(R.id.id_num);
        }
    }
}
