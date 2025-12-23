package com.kartikeya.potholedetection.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kartikeya.potholedetection.R;

public class PotholeAdapter extends RecyclerView.Adapter<PotholeAdapter.PotholeViewHolder> {

    private Context context;
    private int[] imageResIds;
    private String[] titles = {
            "Pothole 1", "Pothole 2", "Pothole 3", "Pothole 4",
            "Pothole 5", "Pothole 6", "Pothole 7", "Pothole 8",
            "Pothole 9", "Pothole 10", "Pothole 11", "Pothole 12",
            "Pothole 13", "Pothole 14", "Pothole 15", "Pothole 16",
            "Pothole 17", "Pothole 18", "Pothole 19", "Pothole 20",
            "Pothole 21", "Pothole 22", "Pothole 23", "Pothole 24",
            "Pothole 25", "Pothole 26", "Pothole 27", "Pothole 28",
            "Pothole 29", "Pothole 30", "Pothole 31", "Pothole 32",
            "Pothole 33", "Pothole 34", "Pothole 35", "Pothole 36",
            "Pothole 37", "Pothole 38", "Pothole 39", "Pothole 40"
    };

    public PotholeAdapter(Context context, int[] imageResIds) {
        this.context = context;
        this.imageResIds = imageResIds;
    }

    @NonNull
    @Override
    public PotholeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_pothole, parent, false);
        return new PotholeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PotholeViewHolder holder, int position) {
        holder.imageView.setImageResource(imageResIds[position]);
        holder.textView.setText(titles[position]);
    }

    @Override
    public int getItemCount() {
        return imageResIds.length;
    }

    public static class PotholeViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public PotholeViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.potholeImage);
            textView = itemView.findViewById(R.id.potholeTitle);
        }
    }
}
