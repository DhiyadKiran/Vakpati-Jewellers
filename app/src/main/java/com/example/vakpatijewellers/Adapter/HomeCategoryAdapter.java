package com.example.vakpatijewellers.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.inline.InlineContentView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vakpatijewellers.Model.HomeCategory;
import com.example.vakpatijewellers.R;
import com.example.vakpatijewellers.databinding.HomeCategorySampleBinding;

import java.util.ArrayList;

public class HomeCategoryAdapter extends RecyclerView.Adapter<HomeCategoryAdapter.viewHolder>{

    Context context;
    ArrayList<HomeCategory> homeCategories;

    public HomeCategoryAdapter(Context context, ArrayList<HomeCategory> homeCategories) {
        this.context = context;
        this.homeCategories = homeCategories;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_category_sample,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        HomeCategory homeCategory = homeCategories.get(position);

        holder.binding.igCategoryImage.setImageResource(homeCategory.getItemImage());
        holder.binding.txCategoryName.setText(homeCategory.getItemName());


    }

    @Override
    public int getItemCount() {
        return homeCategories.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        HomeCategorySampleBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = HomeCategorySampleBinding.bind(itemView);
        }
    }
}
