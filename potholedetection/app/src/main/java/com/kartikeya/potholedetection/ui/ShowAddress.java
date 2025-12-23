package com.kartikeya.potholedetection.ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import com.kartikeya.potholedetection.databinding.ActivityShowAddressBinding;

public class ShowAddress extends AppCompatActivity {

    private ActivityShowAddressBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityShowAddressBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Get data from Intent
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String address = intent.getStringExtra("address");
        int imageRes = intent.getIntExtra("imageRes", -1);

        binding.locationText.setText(title);
        binding.addressText.setText(address);

        if (imageRes != -1) {
            binding.potholeImage.setImageResource(imageRes);
        }

        binding.openMapButton.setOnClickListener(v -> {
            Uri mapIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(address));
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });

        // Back button click listener
        binding.backBtn.setOnClickListener(v -> onBackPressed());
    }
}
