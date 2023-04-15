package com.example.faragementchallenge.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.faragementchallenge.R;
import com.example.faragementchallenge.entities.CarOwnerItem;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
   private ArrayList<CarOwnerItem> carItems;
   private Context context;

   public CarAdapter(ArrayList<CarOwnerItem> carItems, Context context) {
      this.carItems = carItems;
      this.context = context;
   }

   @NonNull
   @Override
   public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item_layout, parent, false);
      return new ViewHolder(view);
   }

   @Override
   public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      CarOwnerItem carOwnerItem = carItems.get(position);

      int resource = carOwnerItem.getCar().getCarLogoRes();
      holder.carMarkIM.setImageResource(resource);
      holder.carModelTV.setText(carOwnerItem.getCar().getModel());
      holder.ownerNameTV.setText(carOwnerItem.getOwner().getName());
      holder.itemView.setTag(carOwnerItem);
      holder.itemView.setOnClickListener((View.OnClickListener) context);
   }

   @Override
   public int getItemCount() {
      return carItems.size();
   }

   class ViewHolder extends RecyclerView.ViewHolder {
      public ImageView carMarkIM;
      public TextView carModelTV;
      public TextView ownerNameTV;
      public LinearLayout carItemLL;

      public ViewHolder(@NonNull View itemView) {
         super(itemView);

         carMarkIM = (ImageView) itemView.findViewById(R.id.carMarkIM);
         carModelTV = (TextView) itemView.findViewById(R.id.carModelTV);
         ownerNameTV = (TextView) itemView.findViewById(R.id.ownerNameTV);
         carItemLL = itemView.findViewById(R.id.carItemLL);
      }
   }

}
