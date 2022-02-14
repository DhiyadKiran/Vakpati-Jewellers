package com.example.vakpatijewellers.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vakpatijewellers.R;
import com.example.vakpatijewellers.databinding.FragmentAddCartBinding;


public class AddCartFragment extends Fragment {



    public AddCartFragment() {
        // Required empty public constructor
    }

    private FragmentAddCartBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAddCartBinding.inflate(getLayoutInflater());

        binding.igSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.svSearchView2.setVisibility(View.VISIBLE);
            }
        });


        return binding.getRoot();
    }
}