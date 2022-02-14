package com.example.vakpatijewellers.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vakpatijewellers.Adapter.FavoriteProductAdapter;
import com.example.vakpatijewellers.Model.FavoriteProduct;
import com.example.vakpatijewellers.R;
import com.example.vakpatijewellers.databinding.FragmentFavoriteBinding;

import java.util.ArrayList;


public class FavoriteFragment extends Fragment {



    public FavoriteFragment() {
        // Required empty public constructor
    }

   private FragmentFavoriteBinding binding;
    private ArrayList<FavoriteProduct> favoriteProducts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFavoriteBinding.inflate(getLayoutInflater());

        binding.igSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.svSearchView2.setVisibility(View.VISIBLE);
            }
        });

        //Favorite Product RecyclerView
        favoriteProducts = new ArrayList<>();

        favoriteProducts.add(new FavoriteProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        favoriteProducts.add(new FavoriteProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));

        FavoriteProductAdapter favoriteProductAdapter =  new FavoriteProductAdapter(getContext(),favoriteProducts);
        GridLayoutManager gridLayoutManager =  new GridLayoutManager(getContext(),1);
        binding.rvFavoriteRecyclerView.setLayoutManager(gridLayoutManager);
        binding.rvFavoriteRecyclerView.setAdapter(favoriteProductAdapter);


        return binding.getRoot();
    }
}
