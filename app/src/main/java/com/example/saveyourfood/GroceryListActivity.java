package com.example.saveyourfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import com.example.saveyourfood.adapters.MyGroceryRecyclerAdapter;
import com.example.saveyourfood.models.MyGrocery;

import java.util.ArrayList;
import java.util.Date;

public class GroceryListActivity extends AppCompatActivity {

    private static final String TAG = "GroceryListActivity";

    //ui components
    private RecyclerView mRecyclerView;

    //variables
    private ArrayList<MyGrocery> mMyGroceries = new ArrayList<>();
    private MyGroceryRecyclerAdapter mMyGroceryRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery_list);
        mRecyclerView = findViewById(R.id.recyclerView);

        initRecyclerView();
        insertGroceryTest();
    }

    private void insertGroceryTest(){
        for(int i=0; i<1000; i++){
            MyGrocery myGrocery = new MyGrocery();
            myGrocery.setName("Apple" + i);
            myGrocery.setQuantity("2.0 kg");
            myGrocery.setDate("10.10.2020");
            mMyGroceries.add(myGrocery);
        }
        mMyGroceryRecyclerAdapter.notifyDataSetChanged();
    }

    private void initRecyclerView(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mMyGroceryRecyclerAdapter = new MyGroceryRecyclerAdapter(mMyGroceries);
        mRecyclerView.setAdapter(mMyGroceryRecyclerAdapter);
    }
}