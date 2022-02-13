package com.example.vakpatijewellers.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vakpatijewellers.R;
import com.example.vakpatijewellers.databinding.FragmentFavoriteBinding;


public class FavoriteFragment extends Fragment {



    public FavoriteFragment() {
        // Required empty public constructor
    }

   private FragmentFavoriteBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFavoriteBinding.inflate(getLayoutInflater());






        return binding.getRoot();
    }
}
