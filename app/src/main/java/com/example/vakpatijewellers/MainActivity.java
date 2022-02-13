package com.example.vakpatijewellers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.vakpatijewellers.Fragments.AccountFragment;
import com.example.vakpatijewellers.Fragments.AddCartFragment;
import com.example.vakpatijewellers.Fragments.FavoriteFragment;
import com.example.vakpatijewellers.Fragments.HomeFragment;
import com.example.vakpatijewellers.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        defaultView();

        binding.mainBottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId())
                {
                    case R.id.bNavHome:
                        selectedFragment = new HomeFragment();
                        break;
                    case R.id.bNavShop:
                        selectedFragment = new AddCartFragment();
                        break;

                    case R.id.bNavFavorite:
                        selectedFragment = new FavoriteFragment();
                        break;

                    case R.id.bNavAccount:
                        selectedFragment = new AccountFragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frMainContainer , selectedFragment).addToBackStack(null).commit();
                return  true;
            }
        });

    }

    private void defaultView() {
        FragmentTransaction firstFragment = getSupportFragmentManager().beginTransaction();
        firstFragment.replace(R.id.frMainContainer, new HomeFragment());
        firstFragment.commit();
    }
}