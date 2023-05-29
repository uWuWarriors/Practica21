package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NewsAdapter extends  RecyclerView.Adapter<NewsAdapter.MyViewHolder> {
    ArrayList<String> news_ID;
    ArrayList<String> news_Name;
    ArrayList<String> news_Description;
    ArrayList<String> news_price;
    Context context;

    public NewsAdapter(Context context, ArrayList<String> news_ID, ArrayList<String> news_Name,
                       ArrayList<String> news_Description, ArrayList<String> news_price) {
        this.news_ID = news_ID;
        this.news_Name = news_Name;
        this.news_Description = news_Description;
        this.news_price = news_price;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_category,parent,false);
        MyViewHolder vh=new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(NewsAdapter.MyViewHolder holder, final  int position) {
        holder.Name.setText(news_Name.get(position));
        holder.Description.setText(news_Description.get(position));
        holder.Price.setText(news_price.get(position));

    }

    @Override
    public int getItemCount() {
        return news_ID.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView ID, Categoty,Name,Description,Price,
        Time_result,Preparation,Bio, image;
        public MyViewHolder(View itemView) {
            super(itemView);
            Name = (TextView) itemView.findViewById(R.id.name);
            Description = (TextView) itemView.findViewById(R.id.time);
            Price = (TextView) itemView.findViewById(R.id.price);

        }
    }
}
