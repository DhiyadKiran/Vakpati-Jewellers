package com.example.vakpatijewellers.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.vakpatijewellers.R;
import com.example.vakpatijewellers.databinding.FragmentProductDetailBinding;


public class ProductDetailFragment extends Fragment {


    public ProductDetailFragment() {
        // Required empty public constructor
    }
    private FragmentProductDetailBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProductDetailBinding.inflate(getLayoutInflater());


        binding.btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Item Successfully Added To Cart.", Toast.LENGTH_SHORT).show();
            }
        });


        return binding.getRoot();
    }
}