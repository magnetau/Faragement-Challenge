package com.example.faragementchallenge.entities;

import com.example.faragementchallenge.R;

import java.io.Serializable;

public class CarItem implements Serializable {
    private String mark;
    private String model;

    public CarItem(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getCarLogoRes() {
        if ("mercedes".equals(this.mark)) {
            return R.drawable.mercedes;
        }
        if ("nissan".equals(this.mark)){
            return R.drawable.nissan;
        }
        if ("volkswagen".equals(this.mark)){
            return R.drawable.volkswagen;
        }

        return R.drawable.ic_launcher_foreground;
    }
}
