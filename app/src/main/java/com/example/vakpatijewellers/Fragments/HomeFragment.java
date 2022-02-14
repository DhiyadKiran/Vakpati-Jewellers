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

        homeCategories.add(new HomeCategory(R.drawable.ring5,"Ring"));
        homeCategories.add(new HomeCategory(R.drawable.earring5,"Earring"));
        homeCategories.add(new HomeCategory(R.drawable.bracelete4,"Bracelet"));
        homeCategories.add(new HomeCategory(R.drawable.neckless,"NeckLace"));
        homeCategories.add(new HomeCategory(R.drawable.chain2,"Chain"));
        homeCategories.add(new HomeCategory(R.drawable.neckless6,"Platinum"));
        homeCategories.add(new HomeCategory(R.drawable.ring7," White Gold"));
        homeCategories.add(new HomeCategory(R.drawable.ring9,"Diamond"));

        HomeCategoryAdapter homeCategoryAdapter =  new HomeCategoryAdapter(getContext(),homeCategories);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),1, RecyclerView.HORIZONTAL,false);
        binding.rvCategoryRecyclerView.setLayoutManager(gridLayoutManager);
        binding.rvCategoryRecyclerView.setAdapter(homeCategoryAdapter);


        //Popular Product RecyclerView
        homeProducts =  new ArrayList<>();
        homeProducts.add(new HomeProduct(R.drawable.ring,"Golden Love Ring","Ring","$1000"));
        homeProducts.add(new HomeProduct(R.drawable.bracelet,"Golden Ring Bracelet","Bracelet","$1100"));
        homeProducts.add(new HomeProduct(R.drawable.ring9,"Diamond Ring","Ring","$6000"));
        homeProducts.add(new HomeProduct(R.drawable.chain2,"Gold Chain","Chain","$1200"));
        homeProducts.add(new HomeProduct(R.drawable.neckless2,"Gold Necklace","Necklace","$2000"));
        homeProducts.add(new HomeProduct(R.drawable.earring5,"Diamond Earring","Earring","$6300"));
        homeProducts.add(new HomeProduct(R.drawable.ring7,"Diamond Ring","Ring","$2300"));
        homeProducts.add(new HomeProduct(R.drawable.earring,"Traditional Earring","Earring","$2300"));
        homeProducts.add(new HomeProduct(R.drawable.ring2,"Gold Diamond Ring","Ring","$13000"));
        homeProducts.add(new HomeProduct(R.drawable.bracelet2,"Gold Bracelet","Bracelet","$2500"));
        homeProducts.add(new HomeProduct(R.drawable.chian,"Golden Chain","Chain","$4000"));
        homeProducts.add(new HomeProduct(R.drawable.earring6,"Diamond Earring ","Earring","$6000"));
        homeProducts.add(new HomeProduct(R.drawable.neckless,"Necklace Set","Necklace","$3200"));
        homeProducts.add(new HomeProduct(R.drawable.earring2,"Mini Earring","Earring","$1100"));
        homeProducts.add(new HomeProduct(R.drawable.ring3,"Gold Ring","Ring","$900"));
        homeProducts.add(new HomeProduct(R.drawable.ring6,"White Gold Ring","Ring","$5200"));
        homeProducts.add(new HomeProduct(R.drawable.bracelet3,"Diamond Bracelet","Bracelet","$1700"));
        homeProducts.add(new HomeProduct(R.drawable.chain3,"Chain","Chain","$2700"));
        homeProducts.add(new HomeProduct(R.drawable.neckless3,"Necklace Set","Necklace","$6000"));
        homeProducts.add(new HomeProduct(R.drawable.earring3,"Traditional Earring","Earring","$1600"));
        homeProducts.add(new HomeProduct(R.drawable.ring4,"Gold Ring","Ring","$4500"));
        homeProducts.add(new HomeProduct(R.drawable.bracelete4,"Bracelet","Bracelet","$2300"));
        homeProducts.add(new HomeProduct(R.drawable.chain4,"Gold Chain","Chain","$2000"));
        homeProducts.add(new HomeProduct(R.drawable.neckless4,"Gold Necklace Set","Necklace","$5200"));
        homeProducts.add(new HomeProduct(R.drawable.ring5,"Gold Krishna Ring","Ring","$6000"));
        homeProducts.add(new HomeProduct(R.drawable.neckless6,"White Gold Necklace","Necklace","$5000"));

        HomeProductAdapter homeProductAdapter = new HomeProductAdapter(getContext(),homeProducts);
        GridLayoutManager gridLayoutManager1 = new GridLayoutManager(getContext(),1,RecyclerView.HORIZONTAL,false);
        binding.rvPopularProduct.setLayoutManager(gridLayoutManager1);
        binding.rvPopularProduct.setAdapter(homeProductAdapter);




        //Best Selling RecyclerView
        homeProducts =  new ArrayList<>();
        homeProducts.add(new HomeProduct(R.drawable.ring5,"Golden Krishna Ring","Ring","$1500"));
        homeProducts.add(new HomeProduct(R.drawable.earring5,"Diamond Earring","Earring","$6300"));
        homeProducts.add(new HomeProduct(R.drawable.ring7,"Diamond Ring","Ring","$2300"));
        homeProducts.add(new HomeProduct(R.drawable.earring,"Traditional Earring","Earring","$2300"));
        homeProducts.add(new HomeProduct(R.drawable.bracelet,"Golden Ring Bracelet","Bracelet","$1100"));
        homeProducts.add(new HomeProduct(R.drawable.chian,"Golden Chain","Chain","$4000"));
        homeProducts.add(new HomeProduct(R.drawable.earring6,"Diamond Earring ","Earring","$6000"));
        homeProducts.add(new HomeProduct(R.drawable.neckless,"Necklace Set","Necklace","$3200"));
        homeProducts.add(new HomeProduct(R.drawable.ring3,"Gold Ring","Ring","$900"));
        homeProducts.add(new HomeProduct(R.drawable.ring6,"White Gold Ring","Ring","$5200"));
        homeProducts.add(new HomeProduct(R.drawable.bracelet3,"Diamond Bracelet","Bracelet","$1700"));
        homeProducts.add(new HomeProduct(R.drawable.bracelete4,"Bracelet","Bracelet","$2300"));


        HomeProductAdapter homeProductAdapter1 = new HomeProductAdapter(getContext(),homeProducts);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(getContext(),1,RecyclerView.HORIZONTAL,false);
        binding.rvBestSelling.setLayoutManager(gridLayoutManager2);
        binding.rvBestSelling.setAdapter(homeProductAdapter1);

        return binding.getRoot();
    }
}