package com.kartikeya.potholedetection.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.kartikeya.potholedetection.databinding.FragmentShowAddressBinding;

public class ShowAddressFragment extends Fragment {

    private FragmentShowAddressBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentShowAddressBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Get data from arguments
        Bundle args = getArguments();
        if (args != null) {
            String title = args.getString("title", "Pothole Info");
            String address = args.getString("address", "Unknown Location");
            int imageRes = args.getInt("imageRes", -1);

            binding.locationText.setText(title);
            binding.addressText.setText(address);

            if (imageRes != -1) {
                binding.potholeImage.setImageResource(imageRes);
            }

            binding.openMapButton.setOnClickListener(v -> {
                Uri mapIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(address));
                Intent intent = new Intent(Intent.ACTION_VIEW, mapIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            });
        }

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
