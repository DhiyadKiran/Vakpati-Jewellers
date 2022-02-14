package com.example.vakpatijewellers.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vakpatijewellers.Adapter.HomeCategoryAdapter;
import com.example.vakpatijewellers.Adapter.HomeProductAdapter;
import com.example.vakpatijewellers.Model.HomeCategory;
import com.example.vakpatijewellers.Model.HomeProduct;
import com.example.vakpatijewellers.R;
import com.example.vakpatijewellers.databinding.FragmentHomeBinding;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    private FragmentHomeBinding binding;
    private ArrayList<HomeCategory> homeCategories;
    private ArrayList<HomeProduct> homeProducts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(getLayoutInflater());


        binding.igSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.svSearchView2.setVisibility(View.VISIBLE);
            }
        });


        //Home Category RecyclerView
        homeCategories = new ArrayList<>();

        homeCategories.add(new HomeCategory(R.drawable.ring,"Ring"));
        homeCategories.add(new HomeCategory(R.drawable.ring,"Ring"));
        homeCategories.add(new HomeCategory(R.drawable.ring,"Ring"));
        homeCategories.add(new HomeCategory(R.drawable.ring,"Ring"));
        homeCategories.add(new HomeCategory(R.drawable.ring,"Ring"));
        homeCategories.add(new HomeCategory(R.drawable.ring,"Ring"));
        homeCategories.add(new HomeCategory(R.drawable.ring,"Ring"));
        homeCategories.add(new HomeCategory(R.drawable.ring,"Ring"));
        homeCategories.add(new HomeCategory(R.drawable.ring,"Ring"));

        HomeCategoryAdapter homeCategoryAdapter =  new HomeCategoryAdapter(getContext(),homeCategories);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),1, RecyclerView.HORIZONTAL,false);
        binding.rvCategoryRecyclerView.setLayoutManager(gridLayoutManager);
        binding.rvCategoryRecyclerView.setAdapter(homeCategoryAdapter);


        //Popular Product RecyclerView
        homeProducts =  new ArrayList<>();
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));

        HomeProductAdapter homeProductAdapter = new HomeProductAdapter(getContext(),homeProducts);
        GridLayoutManager gridLayoutManager1 = new GridLayoutManager(getContext(),1,RecyclerView.HORIZONTAL,false);
        binding.rvPopularProduct.setLayoutManager(gridLayoutManager1);
        binding.rvPopularProduct.setAdapter(homeProductAdapter);


        //Best Selling RecyclerView
        homeProducts =  new ArrayList<>();
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.ring,"Gold Love Ring","Ring","$1000"));


        HomeProductAdapter homeProductAdapter1 = new HomeProductAdapter(getContext(),homeProducts);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(getContext(),1,RecyclerView.HORIZONTAL,false);
        binding.rvBestSelling.setLayoutManager(gridLayoutManager2);
        binding.rvBestSelling.setAdapter(homeProductAdapter1);










        return binding.getRoot();
    }
}