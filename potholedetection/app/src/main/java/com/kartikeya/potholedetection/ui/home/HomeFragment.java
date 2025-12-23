package com.kartikeya.potholedetection.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kartikeya.potholedetection.R;
import com.kartikeya.potholedetection.ui.PotholeAdapter;

public class HomeFragment extends Fragment {

    int[] imageResIds = {
            R.drawable.pothole_1_img, R.drawable.pothole_2_img, R.drawable.pothole_3_img, R.drawable.pothole_4_img,
            R.drawable.pothole_5_img, R.drawable.pothole_6_img, R.drawable.pothole_7_img, R.drawable.pothole_8_img,
            R.drawable.pothole_9_img, R.drawable.pothole_10_img, R.drawable.pothole_11_img, R.drawable.pothole_12_img,
            R.drawable.pothole_13_img, R.drawable.pothole_14_img, R.drawable.pothole_15_img, R.drawable.pothole_16_img,
            R.drawable.pothole_17_img, R.drawable.pothole_18_img, R.drawable.pothole_19_img, R.drawable.pothole_20_img,
            R.drawable.pothole_21_img, R.drawable.pothole_22_img, R.drawable.pothole_23_img, R.drawable.pothole_24_img,
            R.drawable.pothole_25_img, R.drawable.pothole_26_img, R.drawable.pothole_27_img, R.drawable.pothole_28_img,
            R.drawable.pothole_29_img, R.drawable.pothole_30_img, R.drawable.pothole_31_img, R.drawable.pothole_32_img,
            R.drawable.pothole_33_img, R.drawable.pothole_34_img, R.drawable.pothole_35_img, R.drawable.pothole_36_img,
            R.drawable.pothole_37_img, R.drawable.pothole_38_img, R.drawable.pothole_39_img, R.drawable.pothole_40_img
    };


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        PotholeAdapter adapter = new PotholeAdapter(getContext(), imageResIds);
        recyclerView.setAdapter(adapter);
    }
}
