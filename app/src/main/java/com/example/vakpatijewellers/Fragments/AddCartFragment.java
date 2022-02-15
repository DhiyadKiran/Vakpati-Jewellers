package com.example.vakpatijewellers.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vakpatijewellers.Adapter.AddCartAdapter;
import com.example.vakpatijewellers.Model.AddCart;
import com.example.vakpatijewellers.R;
import com.example.vakpatijewellers.databinding.FragmentAddCartBinding;

import java.util.ArrayList;


public class AddCartFragment extends Fragment {



    public AddCartFragment() {
        // Required empty public constructor
    }

    private FragmentAddCartBinding binding;
    private ArrayList<AddCart> addCarts;

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


        binding.btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frMainContainer , new CongressScreenFragment())
                        .addToBackStack(null).commit();
            }
        });

        //AddCart RecyclerView
        addCarts = new ArrayList<>();
        addCarts.add(new AddCart(R.drawable.ring5,"Gold Krishna Ring","$1500"));
        addCarts.add(new AddCart(R.drawable.chian,"Gold Chain","$3000"));
        addCarts.add(new AddCart(R.drawable.neckless6,"White Gold Necklace","$5000"));
        addCarts.add(new AddCart(R.drawable.earring7,"White Gold Earring","$4000"));

        AddCartAdapter addCartAdapter =  new AddCartAdapter(getContext(),addCarts);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),1);
        binding.rvAddCartRecyclerView.setLayoutManager(gridLayoutManager);
        binding.rvAddCartRecyclerView.setAdapter(addCartAdapter);


        return binding.getRoot();
    }
}