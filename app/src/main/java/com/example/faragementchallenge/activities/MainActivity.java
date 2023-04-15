package com.example.faragementchallenge.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.faragementchallenge.R;
import com.example.faragementchallenge.entities.CarOwnerItem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "ACTIVITY_STAT";
    CarOwnerItem carOwnerItem;

    ImageView markIV;
    TextView modelTV, ownerNameTV, ownerNumTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: XXX");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(TAG, "onPostResume: YYYY");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: UUU");
        markIV = findViewById(R.id.markIV);
        modelTV = findViewById(R.id.modelTV);
        ownerNameTV = findViewById(R.id.ownerNameTV);
        ownerNumTV = findViewById(R.id.ownerNumTV);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: III");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: OOO");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: PPP");
    }

    @Override
    public void onStateNotSaved() {
        super.onStateNotSaved();
        Log.e(TAG, "onStateNotSaved: AAA");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: ZZZ");
    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        Log.e(TAG, "onResumeFragments: EEE");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart: RRR");
    }

    @Override
    public void onClick(View view) {
        carOwnerItem = (CarOwnerItem) view.getTag();
        markIV.setImageResource(carOwnerItem.getCar().getCarLogoRes());
        modelTV.setText(carOwnerItem.getCar().getModel());
        ownerNameTV.setText(carOwnerItem.getOwner().getName());
        ownerNumTV.setText(carOwnerItem.getOwner().getTelNumber());
        //Toast.makeText(this, carOwnerItem.getCar().getModel(), Toast.LENGTH_LONG).show();
    }
}