package com.example.vakpatijewellers.Fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.vakpatijewellers.MainActivity;
import com.example.vakpatijewellers.R;
import com.example.vakpatijewellers.databinding.FragmentSignInBinding;


public class SignInFragment extends Fragment {



    public SignInFragment() {
        // Required empty public constructor
    }

    private FragmentSignInBinding binding;
    private SharedPreferences spf;
    private String Email,Password, UserPassword,UserEmail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSignInBinding.inflate(getLayoutInflater());

        spf = requireContext().getSharedPreferences("UserDetails" , Context.MODE_PRIVATE);
        Email =spf.getString("UserEmail" , null);
        Password =spf.getString("UserPassword",null);


       binding.txRegister.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
               fragmentTransaction.replace(R.id.frLoginContainer,new SignUpFragment());
               fragmentTransaction.addToBackStack(null).commit();
           }
       });

        binding.btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserEmail = binding.edEmailAddress.getText().toString();
                UserPassword = binding.edPassword.getText().toString();

                if (UserEmail.equals(Email) && UserPassword.equals(Password)){
                    Intent intent = new Intent(getContext(), MainActivity.class);
                    startActivity(intent);
                    requireActivity().finishAffinity();
                }
                else {
                    binding.edEmailAddress.setError("Something Went Wrong ");
                    binding.edPassword.setError("Something Went Wrong ");
                }
            }
        });



        return binding.getRoot();
    }
}