package com.example.faragementchallenge.entities;

import java.io.Serializable;

public class OwnerItem implements Serializable {
   private String name;
   private String telNumber;

   public OwnerItem(String name, String telNumber) {
      this.name = name;
      this.telNumber = telNumber;
   }

   public String getName() {
      return name;
   }

   public String getTelNumber() {
      return telNumber;
   }
}
