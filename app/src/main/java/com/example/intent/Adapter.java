package com.example.intent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolde> {
    Context context;
    List<Model> list;

    public Adapter(Context context, List<Model> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vh = LayoutInflater.from(context).inflate(R.layout.recycelerlay,parent,false);

        return  new ViewHolde(vh);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolde holder, int position) {

        holder.show_name.setText(list.get(position).getName());
        holder.show_age.setText(""+list.get(position).getCode());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolde extends RecyclerView.ViewHolder {

        TextView show_name,show_age;

        public ViewHolde(@NonNull View itemView) {
            super(itemView);

            show_name = (TextView) itemView.findViewById(R.id.r_name);
            show_age = (TextView) itemView.findViewById(R.id.r_code);
        }
    }


}
