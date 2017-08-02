package com.example.android.android_me.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.android_me.R;

public class AndroidMeActivity extends AppCompatActivity {

    // TODO (1) Create a layout file that displays one body part image named fragment_body_part.xml
        // This layout should contain a single imageView

    // TODO (2) Create a new class called BodyPartFragment to display an image of an Android-Me body part
        // In this class you will need to implement an empty constructor and the onCreateView method

    // TODO (3) Show the first image in this list of head images
        // Soon, you'll update this image display code to show any image you want


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        // TODO (5) Create a new BodyFragment instance and display it using the FragmentManager
        BodyPartFragment headFragment = new BodyPartFragment();

        // Use a FragmentManager and transaction to add the fragment to the screen.
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Fragment transaction
        fragmentManager.beginTransaction()
                .add(R.id.head_container, headFragment)
                .commit();
    }
}
