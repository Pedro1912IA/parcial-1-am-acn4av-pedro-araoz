package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class MenuFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btnGallery = view.findViewById(R.id.btnGallery);
        Button btnInfo = view.findViewById(R.id.btnInfo);
        Button btnSettings = view.findViewById(R.id.btnSettings);
        Button btnRandom = view.findViewById(R.id.btnRandom);


        NavController navController = Navigation.findNavController(view);

        btnGallery.setOnClickListener(v ->
                navController.navigate(R.id.action_menuFragment_to_galleryFragment));

        btnInfo.setOnClickListener(v ->
                navController.navigate(R.id.action_menuFragment_to_infoFragment));

        btnSettings.setOnClickListener(v ->
                navController.navigate(R.id.action_menuFragment_to_settingsFragment));

        btnRandom.setOnClickListener(v ->
                navController.navigate(R.id.action_menuFragment_to_firstFragment));



    }
}
