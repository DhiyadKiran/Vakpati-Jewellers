package com.example.vakpatijewellers.Fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vakpatijewellers.LoginActivity;
import com.example.vakpatijewellers.R;
import com.example.vakpatijewellers.databinding.FragmentAccountBinding;
import com.example.vakpatijewellers.databinding.FragmentAddCartBinding;


public class AccountFragment extends Fragment {



    public AccountFragment() {
        // Required empty public constructor
    }

     private FragmentAccountBinding binding;
    private SharedPreferences spf;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAccountBinding.inflate(getLayoutInflater());

        spf = requireContext().getSharedPreferences("UserDetails" , Context.MODE_PRIVATE);
        binding.txName.setText(spf.getString("UserName" , null));
        binding.txEmail.setText(spf.getString("UserEmail" , null));

        binding.btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences spf = getContext().getSharedPreferences("UserDetails" , Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = spf.edit();
                editor.clear();
                editor.apply();

                Intent intent = new Intent(getContext(), LoginActivity.class);
                startActivity(intent);
                requireActivity().finishAffinity();
            }
        });



        return binding.getRoot();
    }
}