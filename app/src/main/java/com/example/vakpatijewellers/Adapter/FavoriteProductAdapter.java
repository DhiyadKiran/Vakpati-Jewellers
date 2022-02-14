package com.example.vakpatijewellers.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vakpatijewellers.Fragments.ProductDetailFragment;
import com.example.vakpatijewellers.Model.FavoriteProduct;
import com.example.vakpatijewellers.R;
import com.example.vakpatijewellers.databinding.FavoriteProductSampleBinding;

import java.util.ArrayList;

public class FavoriteProductAdapter extends RecyclerView.Adapter<FavoriteProductAdapter.viewHolder>{

    Context context;
    ArrayList<FavoriteProduct> favoriteProducts;

    public FavoriteProductAdapter(Context context, ArrayList<FavoriteProduct> favoriteProducts) {
        this.context = context;
        this.favoriteProducts = favoriteProducts;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.favorite_product_sample,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        FavoriteProduct favoriteProduct =  favoriteProducts.get(position);

        holder.binding.igProductImage.setImageResource(favoriteProduct.getProductImage());
        holder.binding.txProductName.setText(favoriteProduct.getProductName());
        holder.binding.txProductType.setText(favoriteProduct.getProductType());
        holder.binding.txProductPrice.setText(favoriteProduct.getProductPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frMainContainer,new ProductDetailFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

    }

    @Override
    public int getItemCount() {
        return favoriteProducts.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
          FavoriteProductSampleBinding binding;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            binding =  FavoriteProductSampleBinding.bind(itemView);
        }
    }
}
