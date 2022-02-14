package com.example.vakpatijewellers.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vakpatijewellers.Fragments.ProductDetailFragment;
import com.example.vakpatijewellers.Model.HomeCategory;
import com.example.vakpatijewellers.Model.HomeProduct;
import com.example.vakpatijewellers.R;
import com.example.vakpatijewellers.databinding.HomeProductSampleBinding;

import java.util.ArrayList;

public class HomeProductAdapter extends RecyclerView.Adapter<HomeProductAdapter.viewHolder>{

    Context context;
    ArrayList<HomeProduct> homeProducts;

    public HomeProductAdapter(Context context, ArrayList<HomeProduct> homeProducts) {
        this.context = context;
        this.homeProducts = homeProducts;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_product_sample,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        HomeProduct homeProduct = homeProducts.get(position);

        holder.binding.igProductImage.setImageResource(homeProduct.getProductImage());
        holder.binding.txProductName.setText(homeProduct.getProductName());
        holder.binding.txProductType.setText(homeProduct.getProductType());
        holder.binding.txProductPrice.setText(homeProduct.getProductPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frMainContainer, new ProductDetailFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

    }

    @Override
    public int getItemCount() {
        return homeProducts.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        HomeProductSampleBinding binding;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding = HomeProductSampleBinding.bind(itemView);
        }
    }
}
