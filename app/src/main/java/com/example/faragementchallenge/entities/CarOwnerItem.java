package com.example.faragementchallenge.entities;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class CarOwnerItem implements Serializable {
   private CarItem car;
   private OwnerItem owner;

   public CarOwnerItem(@NonNull CarItem car, @NonNull OwnerItem owner) {
      this.car = car;
      this.owner = owner;
   }

   public CarItem getCar() {
      return car;
   }

   public OwnerItem getOwner() {
      return owner;
   }
}
