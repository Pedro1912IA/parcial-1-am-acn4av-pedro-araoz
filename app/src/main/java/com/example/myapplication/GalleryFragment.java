package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GalleryFragment extends Fragment {

    private int[] nasaImages = {
            R.drawable.imgnasa1,
            R.drawable.imgnasa2,
            R.drawable.imgnasa3,
            R.drawable.imgnasa4,
            R.drawable.imgnasa5,
            R.drawable.imgnasa6,
            R.drawable.imgnasa7,
            R.drawable.imgnasa8,
            R.drawable.imgnasa9,
            R.drawable.imgnasa10,
            R.drawable.imgnasa11,
            R.drawable.imgnasa12,
            R.drawable.imgnasa13,
            R.drawable.imgnasa14,
            R.drawable.imgnasa15

    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.galleryRecycler);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(new GalleryAdapter(nasaImages));

        return view;
    }
}
