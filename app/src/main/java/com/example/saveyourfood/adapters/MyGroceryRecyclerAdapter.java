package com.example.saveyourfood.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.saveyourfood.R;
import com.example.saveyourfood.models.MyGrocery;

import java.util.ArrayList;

public class MyGroceryRecyclerAdapter extends RecyclerView.Adapter<MyGroceryRecyclerAdapter.ViewHolder> {

    private ArrayList<MyGrocery> myGrocery = new ArrayList<>();

    public MyGroceryRecyclerAdapter(ArrayList<MyGrocery> myGrocery){
        this.myGrocery = myGrocery;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_grocery_list_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.name.setText(myGrocery.get(i).getName());
        viewHolder.quantity.setText(myGrocery.get(i).getQuantity());
    }

    @Override
    public int getItemCount() {
        return myGrocery.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView name, quantity, timestamp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.MyGrocery_name);
            quantity = itemView.findViewById(R.id.MyGrocery_quantity);
            timestamp = itemView.findViewById(R.id.MyGrocery_timestamp);
        }
    }
}
