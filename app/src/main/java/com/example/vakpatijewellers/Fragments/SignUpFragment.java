package com.example.vakpatijewellers.Fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.vakpatijewellers.R;
import com.example.vakpatijewellers.databinding.FragmentSignUpBinding;


public class SignUpFragment extends Fragment {



    public SignUpFragment() {
        // Required empty public constructor
    }

    private FragmentSignUpBinding binding;
    private  String Name,Email,Password;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSignUpBinding.inflate(getLayoutInflater());


        binding.txAlreadyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frLoginContainer,new SignInFragment());
                fragmentTransaction.addToBackStack(null).commit();
            }
        });

        binding.btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (binding.edName.getText().toString().isEmpty()) {
                    binding.edName.setError("Please Enter Name");
                } else if (binding.edName.getText().toString().length() < 4) {
                    binding.edName.setError("Name must be Minimum 3 characters");
                } else if (binding.edEmailAddress.getText().toString().isEmpty()) {
                    binding.edEmailAddress.setError("Please Enter Email In Valid Format");
                } else if (!(binding.edEmailAddress.getText().toString().contains("@"))) {
                    binding.edEmailAddress.setError("Please Enter Email In Valid Format");
                } else if (!(binding.edEmailAddress.getText().toString().endsWith(".com"))) {
                    binding.edEmailAddress.setError("Please Enter Email In Valid Format");
                } else if (binding.edPassword.getText().toString().isEmpty()) {
                    binding.edPassword.setError("Please Enter Password");
                }else if(binding.edPassword.getText().toString().length() < 8 ) {
                    binding.edPassword.setError("Password Must Be Minimum 8 Characters");
                } else {
                    Toast.makeText(getContext(), "Profile Saved...", Toast.LENGTH_SHORT).show();

                    Name = binding.edName.getText().toString();
                    Email = binding.edEmailAddress.getText().toString();
                    Password = binding.edPassword.getText().toString();

                    StoreUserDetails(Name, Email, Password);

                    FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frLoginContainer, new SignInFragment());
                    fragmentTransaction.addToBackStack(null).commit();

                }
            }
        });


        return binding.getRoot();
    }

    private SharedPreferences StoreUserDetails(String UserName , String UserEmail, String UserPassword)
    {
        SharedPreferences spf = getContext().getSharedPreferences("UserDetails" , Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("UserName" , UserName);
        editor.putString("UserEmail" , UserEmail);
        editor.putString("UserPassword" , UserPassword);
        editor.apply();
        return spf;
    }
}