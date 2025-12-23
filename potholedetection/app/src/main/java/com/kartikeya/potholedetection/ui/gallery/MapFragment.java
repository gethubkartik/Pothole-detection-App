package com.kartikeya.potholedetection.ui.gallery;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.kartikeya.potholedetection.R;
import com.kartikeya.potholedetection.ui.ShowAddress;

public class MapFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }

        return view;
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        addPotholeMarker(new LatLng(12.911900, 77.644200), "Pothole - 15 (BTM Layout)", R.drawable.pothole_15_img, "BTM Layout, Bangalore");
        addPotholeMarker(new LatLng(13.011900, 77.620100), "Pothole - 16 (RT Nagar)", R.drawable.pothole_16_img, "RT Nagar, Bangalore");
        addPotholeMarker(new LatLng(13.020200, 77.700500), "Pothole - 17 (KR Puram)", R.drawable.pothole_17_img, "KR Puram, Bangalore");
        addPotholeMarker(new LatLng(12.955000, 77.620000), "Pothole - 18 (Indiranagar)", R.drawable.pothole_18_img, "Indiranagar, Bangalore");
        addPotholeMarker(new LatLng(12.925000, 77.635000), "Pothole - 19 (Ejipura)", R.drawable.pothole_19_img, "Ejipura, Bangalore");
        addPotholeMarker(new LatLng(12.970000, 77.590000), "Pothole - 20 (Cubbon Park)", R.drawable.pothole_20_img, "Cubbon Park, Bangalore");
        addPotholeMarker(new LatLng(13.050000, 77.620000), "Pothole - 21 (Peenya)", R.drawable.pothole_21_img, "Peenya Industrial Area, Bangalore");
        addPotholeMarker(new LatLng(13.021000, 77.632000), "Pothole - 22 (Sanjay Nagar)", R.drawable.pothole_22_img, "Sanjay Nagar, Bangalore");
        addPotholeMarker(new LatLng(12.928000, 77.684000), "Pothole - 23 (Sarjapur)", R.drawable.pothole_23_img, "Sarjapur Road, Bangalore");
        addPotholeMarker(new LatLng(12.980500, 77.700000), "Pothole - 24 (Marathahalli)", R.drawable.pothole_24_img, "Marathahalli Bridge, Bangalore");
        addPotholeMarker(new LatLng(12.900000, 77.600000), "Pothole - 25 (HSR Layout 7th Sector)", R.drawable.pothole_25_img, "HSR Layout 7th Sector, Bangalore");
        addPotholeMarker(new LatLng(12.991200, 77.550100), "Pothole - 26 (Rajajinagar)", R.drawable.pothole_26_img, "Rajajinagar, Bangalore");
        addPotholeMarker(new LatLng(12.902200, 77.550000), "Pothole - 27 (JP Nagar)", R.drawable.pothole_27_img, "JP Nagar, Bangalore");
        addPotholeMarker(new LatLng(13.010000, 77.670000), "Pothole - 28 (Kalyan Nagar)", R.drawable.pothole_28_img, "Kalyan Nagar, Bangalore");
        addPotholeMarker(new LatLng(12.915000, 77.565000), "Pothole - 29 (Basavanagudi)", R.drawable.pothole_29_img, "Basavanagudi, Bangalore");
        addPotholeMarker(new LatLng(12.975000, 77.615000), "Pothole - 30 (Shivajinagar)", R.drawable.pothole_30_img, "Shivajinagar, Bangalore");
        addPotholeMarker(new LatLng(12.891000, 77.622000), "Pothole - 31 (Bannerghatta)", R.drawable.pothole_31_img, "Bannerghatta Road, Bangalore");
        addPotholeMarker(new LatLng(12.998000, 77.705000), "Pothole - 32 (Kadubeesanahalli)", R.drawable.pothole_32_img, "Kadubeesanahalli, Bangalore");
        addPotholeMarker(new LatLng(13.065000, 77.579000), "Pothole - 33 (Yelahanka)", R.drawable.pothole_33_img, "Yelahanka, Bangalore");
        addPotholeMarker(new LatLng(13.005500, 77.630000), "Pothole - 34 (Mattikere)", R.drawable.pothole_34_img, "Mattikere, Bangalore");
        addPotholeMarker(new LatLng(12.913000, 77.675000), "Pothole - 35 (Agara)", R.drawable.pothole_35_img, "Agara Lake, Bangalore");
        addPotholeMarker(new LatLng(13.015000, 77.600000), "Pothole - 36 (Seshadripuram)", R.drawable.pothole_36_img, "Seshadripuram, Bangalore");
        addPotholeMarker(new LatLng(12.888000, 77.595000), "Pothole - 37 (Arekere)", R.drawable.pothole_37_img, "Arekere, Bangalore");
        addPotholeMarker(new LatLng(12.957000, 77.676000), "Pothole - 38 (Domlur)", R.drawable.pothole_38_img, "Domlur Layout, Bangalore");
        addPotholeMarker(new LatLng(13.022000, 77.520000), "Pothole - 39 (Hesaraghatta)", R.drawable.pothole_39_img, "Hesaraghatta, Bangalore");
        addPotholeMarker(new LatLng(12.955500, 77.705500), "Pothole - 40 (Munnekolala)", R.drawable.pothole_40_img, "Munnekolala, Bangalore");



        // Move camera to Bangalore center
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(12.9716, 77.5946), 12));

        // Marker click listener
        mMap.setOnMarkerClickListener(marker -> {
            String title = marker.getTitle();
            String address = (String) marker.getTag();
            int imageRes = getImageForTitle(title);

            Intent intent = new Intent(requireContext(), ShowAddress.class);
            intent.putExtra("title", title);
            intent.putExtra("address", address);
            intent.putExtra("imageRes", imageRes);
            startActivity(intent);


            return true;
        });
    }

    private void addPotholeMarker(LatLng position, String title, int imageRes, String address) {
        Marker marker = mMap.addMarker(new MarkerOptions()
                .position(position)
                .title(title)
                .icon(bitmapFromDrawable(imageRes)));
        if (marker != null) marker.setTag(address);
    }

    private BitmapDescriptor bitmapFromDrawable(int resId) {
        Drawable drawable = ContextCompat.getDrawable(requireContext(), resId);
        if (drawable == null) return BitmapDescriptorFactory.defaultMarker();

        int size = 100; // width & height of the icon
        Bitmap bitmap = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);

        // Create a rounded bitmap
        Bitmap imageBitmap = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);
        Canvas imageCanvas = new Canvas(imageBitmap);
        drawable.setBounds(0, 0, size, size);
        drawable.draw(imageCanvas);

        Bitmap output = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);
        Canvas outputCanvas = new Canvas(output);

        final float radius = 20f;

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setShader(new android.graphics.BitmapShader(imageBitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP));
        outputCanvas.drawRoundRect(0, 0, size, size, radius, radius, paint);

        // Add border
        Paint borderPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        borderPaint.setStyle(Paint.Style.STROKE);
        borderPaint.setColor(android.graphics.Color.WHITE); // border color
        borderPaint.setStrokeWidth(6f); // border width
        outputCanvas.drawRoundRect(0, 0, size, size, radius, radius, borderPaint);

        return BitmapDescriptorFactory.fromBitmap(output);
    }


    private int getImageForTitle(String title) {

            if (title.contains("1") && !title.contains("10") && !title.contains("11") && !title.contains("12") && !title.contains("13") && !title.contains("14") && !title.contains("15")) return R.drawable.pothole_1_img;
            if (title.contains("2") && !title.contains("12") && !title.contains("20") && !title.contains("21") && !title.contains("22")) return R.drawable.pothole_2_img;
            if (title.contains("3") && !title.contains("13") && !title.contains("23")) return R.drawable.pothole_3_img;
            if (title.contains("4") && !title.contains("14") && !title.contains("24")) return R.drawable.pothole_4_img;
            if (title.contains("5") && !title.contains("15") && !title.contains("25")) return R.drawable.pothole_5_img;
            if (title.contains("6") && !title.contains("16") && !title.contains("26")) return R.drawable.pothole_6_img;
            if (title.contains("7") && !title.contains("17") && !title.contains("27")) return R.drawable.pothole_7_img;
            if (title.contains("8") && !title.contains("18") && !title.contains("28")) return R.drawable.pothole_8_img;
            if (title.contains("9") && !title.contains("19") && !title.contains("29")) return R.drawable.pothole_9_img;
            if (title.contains("10")) return R.drawable.pothole_10_img;
            if (title.contains("11")) return R.drawable.pothole_11_img;
            if (title.contains("12")) return R.drawable.pothole_12_img;
            if (title.contains("13")) return R.drawable.pothole_13_img;
            if (title.contains("14")) return R.drawable.pothole_14_img;
            if (title.contains("15")) return R.drawable.pothole_15_img;
            if (title.contains("16")) return R.drawable.pothole_16_img;
            if (title.contains("17")) return R.drawable.pothole_17_img;
            if (title.contains("18")) return R.drawable.pothole_18_img;
            if (title.contains("19")) return R.drawable.pothole_19_img;
            if (title.contains("20")) return R.drawable.pothole_20_img;
            if (title.contains("21")) return R.drawable.pothole_21_img;
            if (title.contains("22")) return R.drawable.pothole_22_img;
            if (title.contains("23")) return R.drawable.pothole_23_img;
            if (title.contains("24")) return R.drawable.pothole_24_img;
            if (title.contains("25")) return R.drawable.pothole_25_img;
            if (title.contains("26")) return R.drawable.pothole_26_img;
            if (title.contains("27")) return R.drawable.pothole_27_img;
            if (title.contains("28")) return R.drawable.pothole_28_img;
            if (title.contains("29")) return R.drawable.pothole_29_img;
            if (title.contains("30")) return R.drawable.pothole_30_img;
            if (title.contains("31")) return R.drawable.pothole_31_img;
            if (title.contains("32")) return R.drawable.pothole_32_img;
            if (title.contains("33")) return R.drawable.pothole_33_img;
            if (title.contains("34")) return R.drawable.pothole_34_img;
            if (title.contains("35")) return R.drawable.pothole_35_img;
            if (title.contains("36")) return R.drawable.pothole_36_img;
            if (title.contains("37")) return R.drawable.pothole_37_img;
            if (title.contains("38")) return R.drawable.pothole_38_img;
            if (title.contains("39")) return R.drawable.pothole_39_img;
            if (title.contains("40")) return R.drawable.pothole_40_img;




        return R.drawable.pothole_4_img;
    }
}
