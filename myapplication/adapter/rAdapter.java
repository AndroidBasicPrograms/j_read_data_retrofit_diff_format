package com.example.appsb.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appsb.myapplication.R;
import com.example.appsb.myapplication.rModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by appsb on 06-07-2018.
 */

public class rAdapter extends  RecyclerView.Adapter<rAdapter.retrofitViewHolder>{

    ArrayList<rModel> res;
    UserClickListener listener;

    public rAdapter(ArrayList<rModel> res, UserClickListener listener) {
        this.res = res;
        this.listener = listener;
    }

    @Override
    public retrofitViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.res_item_row,parent,false);
        retrofitViewHolder s=new retrofitViewHolder(view);
        return s;
    }

    @Override
    public void onBindViewHolder(retrofitViewHolder holder, int position) {
        final rModel h=res.get(position);
        String path="http://nuxvomica.xyz/foodies/uploads/restaurant/"+h.getImage().toString();
        Picasso.get().load(path).into(holder.img);
        holder.tv.setText(h.getName());
        holder.opentime.setText("Open at : "+h.getOpen_time());
        holder.delivert_time.setText(h.getDelivery_time());
        holder.ratting.setText(h.getRatting());
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onUserClick(h);
            }
        });
    }

    @Override
    public int getItemCount() {
        return res.size();
    }

    public class retrofitViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tv,opentime,delivert_time,ratting;
        View view;
        public retrofitViewHolder(View itemView) {
            super(itemView);
            view=itemView;
            img=itemView.findViewById(R.id.card_view_image);
            tv=itemView.findViewById(R.id.card_view_image_title);
            opentime=itemView.findViewById(R.id.card_view_open_time);
            delivert_time=itemView.findViewById(R.id.card_view_delivery_time);
            ratting=itemView.findViewById(R.id.card_view_ratting);
        }
    }

    public interface UserClickListener
    {
        public void onUserClick(rModel rm);
    }
}
