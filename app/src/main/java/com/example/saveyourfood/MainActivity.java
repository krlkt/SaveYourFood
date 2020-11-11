package com.example.saveyourfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView myGroceries;
    private ImageView shoppingList;
    private ImageView expiryDate;
    private ImageView settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myGroceries = (ImageView) findViewById(R.id.myGroceries);
        shoppingList = (ImageView) findViewById(R.id.shoppingList);
        expiryDate = (ImageView) findViewById(R.id.expiryDate);
        settings = (ImageView) findViewById(R.id.settings);

        myGroceries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myGroceriesIntent = new Intent(MainActivity.this, GroceryListActivity.class);
                startActivity(myGroceriesIntent);
            }
        });




    }
}