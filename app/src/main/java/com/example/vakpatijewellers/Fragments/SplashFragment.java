package com.example.vakpatijewellers.Fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Handler;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.vakpatijewellers.MainActivity;
import com.example.vakpatijewellers.R;
import com.example.vakpatijewellers.databinding.FragmentSplashBinding;


public class SplashFragment extends Fragment {


    public SplashFragment() {
        // Required empty public constructor
    }

    private FragmentSplashBinding binding;
    private static final int SPLASH_SCREEN = 3000;
    private Animation topAnim;
    private SharedPreferences spf;
    private String Name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(getLayoutInflater());

        topAnim = AnimationUtils.loadAnimation(getContext(), R.anim.top_animation);
        binding.igSplashImage.setAnimation(topAnim);

        spf = requireContext().getSharedPreferences("UserDetails" , Context.MODE_PRIVATE);
        Name = spf.getString("UserName" , null);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if(Name == null){
                    FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                    fragmentTransaction.remove(SplashFragment.this);
                    fragmentTransaction.replace(R.id.frLoginContainer, new SignUpFragment())
                            .addToBackStack(null).commit();
                }else {
//                    FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
//                    fragmentTransaction.remove(SplashFragment.this);
//                    fragmentTransaction.replace(R.id.frLoginContainer, new SignInFragment())
//                            .addToBackStack(null).commit();


                    Intent intent = new Intent(getContext(), MainActivity.class);
                    startActivity(intent);
                    requireActivity().finishAffinity();
                }
            }
        }, SPLASH_SCREEN);

        return binding.getRoot();
    }
}