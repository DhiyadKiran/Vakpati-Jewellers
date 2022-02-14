package com.example.vakpatijewellers.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vakpatijewellers.Model.AddCart;
import com.example.vakpatijewellers.R;
import com.example.vakpatijewellers.databinding.AddCartSampleBinding;

import java.util.ArrayList;

public class AddCartAdapter extends RecyclerView.Adapter<AddCartAdapter.viewHolder>{

    Context context;
    ArrayList<AddCart> addCarts;

    public AddCartAdapter(Context context, ArrayList<AddCart> addCarts) {
        this.context = context;
        this.addCarts = addCarts;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.add_cart_sample,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        AddCart addCart = addCarts.get(position);

        holder.binding.igProductImage.setImageResource(addCart.getProductImage());
        holder.binding.txProductName.setText(addCart.getProductName());
        holder.binding.txProductPrice.setText(addCart.getProductPrice());

    }

    @Override
    public int getItemCount() {
        return addCarts.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
           AddCartSampleBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = AddCartSampleBinding.bind(itemView);
        }
    }
}
