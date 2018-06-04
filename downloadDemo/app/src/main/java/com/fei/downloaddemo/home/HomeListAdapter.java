package com.fei.downloaddemo.home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fei.downloaddemo.R;

import java.util.ArrayList;

/**
 * 创建日期：2018/6/4 on 11:43
 * 描述:
 * 作者:Li
 */

public class HomeListAdapter extends RecyclerView.Adapter<HomeItemVH> {

    ArrayList<HomeListItem> list;
    public HomeListAdapter(ArrayList<HomeListItem> list){
        this.list = list;
    }

    @NonNull
    @Override
    public HomeItemVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_list,parent,false);
        return new HomeItemVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeItemVH holder, int position) {
        HomeListItem itemInfo = list.get(position);
        holder.tvName.setText(itemInfo.getName());
        holder.tvSize.setText(itemInfo.getSize());
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }


    public HomeListItem getItem(int position){
        return list.get(position);
    }
}
