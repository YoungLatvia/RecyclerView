package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.hasFixedSize();
        List<investment> investmentList = new ArrayList<>();
        investmentList.add(new investment("GIMME MONEY",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum",
                5000,
                90,
                1,
                50,
                "Technology"));
        investmentList.add(new investment("GIMME MONEY",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum",
                5000,
                90,
                2,
                50,
                "Technology"));
        investmentList.add(new investment("GIMME MONEY",
                "Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum\n"+"Lorem Ipsum Lorem Ipsum Lorem Ipsum",
                5000,
                90,
                3,
                50,
                "Technology"));

        investmentsAdapter adapter = new investmentsAdapter(investmentList);
    }
}