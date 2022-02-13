package com.example.vakpatijewellers.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vakpatijewellers.R;
import com.example.vakpatijewellers.databinding.FragmentAccountBinding;
import com.example.vakpatijewellers.databinding.FragmentAddCartBinding;


public class AccountFragment extends Fragment {



    public AccountFragment() {
        // Required empty public constructor
    }

     private FragmentAccountBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAccountBinding.inflate(getLayoutInflater());




        return binding.getRoot();
    }
}