package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

/**
 * Created by nabwera on 02/08/2017.
 */

public class BodyPartFragment extends Fragment {

    // TODO (3) Create final Strings to store state information about the list of images and list index

    // Tag for logging
    private static final String TAG = "BodyPartFragment";


    // Variables to store a list of image resources and the index of the image that this fragment displays
    private List<Integer> mImageIds;
    private int mListIndex;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the fragment
     */
    public BodyPartFragment(){

    }

    /**
     * Inflates the fragment layout and sets an image resources
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the Android-Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        // Get a reference to the ImageView in the fragment layout.
        final ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        // If a list of image ids exists, set the image resource to the correct item in that list
            // Otherwise, create a Log statement that indicates that the list was not found
        if(mImageIds != null){
            // Set the image resource to the list item at the stored index
            imageView.setImageResource(mImageIds.get(mListIndex));

            // TODO (1) Set a click listener on the image view and on a click increment the list index and set the image resource
            // TODO (2) If you reach the end of a list of images, set the list index back to 0 (the first item in the list)

            // Set a click listener on the image view image view
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Increment position as long as the index remains <= the size of image ids list
                    if(mListIndex < mImageIds.size()-1) {
                        mListIndex++;
                    } else {
                        // The end of the list has been reached, so return to the beginning index
                        mListIndex = 0;
                    }
                    // Set the image resource to the new list item
                    imageView.setImageResource(mImageIds.get(mListIndex));
                }
            });

        } else {
            // Log a message saying the image id list is null
            Log.v(TAG, "This fragment has a null list of image id's");
        }

        // Return root view
        return rootView;
    }

    // Setter methods for keeping track of the list images this fragment can display and which image
    // in the list is currently being displayed

    public void setImageIds(List<Integer> imageIds) {
        mImageIds = imageIds;
    }

    public void setListIndex(int index) {
        mListIndex = index;
    }

    // TODO (4) Override onSaveInstanceState and save the current state of this fragment
}
