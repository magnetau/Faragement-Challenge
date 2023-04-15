package com.example.faragementchallenge.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.faragementchallenge.R;
import com.example.faragementchallenge.adapters.CarAdapter;
import com.example.faragementchallenge.entities.CarItem;
import com.example.faragementchallenge.entities.CarOwnerItem;
import com.example.faragementchallenge.entities.OwnerItem;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CarListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CarListFragment extends Fragment {

    ArrayList<CarOwnerItem> listOfItems = new ArrayList<>();
    RecyclerView carListRV;
    CarAdapter carAdapter;

    public CarListFragment newInstance() {
        return new CarListFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
//            listOfItems = getArguments().getParcelableArrayList("carList");
        }

        initViewElements();

    }

    private void initViewElements() {
        listOfItems.add(new CarOwnerItem(new CarItem("mercedes", "220"), new OwnerItem("Bob Marley", "0652424244")));
        listOfItems.add(new CarOwnerItem(new CarItem("volkswagen", "golf 7"), new OwnerItem("Elon Musk", "0021235467234")));
        listOfItems.add(new CarOwnerItem(new CarItem("nissan", "marvel"), new OwnerItem("Brad pit", "+21234556772")));
        listOfItems.add(new CarOwnerItem(new CarItem("mercedes", "mclareen"), new OwnerItem("Peter Parker", "0033456727688")));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        carListRV = view.findViewById(R.id.carListRV);
        carAdapter = new CarAdapter(listOfItems, getContext());

        carListRV.setAdapter(carAdapter);
        carListRV.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_car_list, container, false);
    }
}