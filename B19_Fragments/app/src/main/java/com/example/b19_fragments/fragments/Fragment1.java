package com.example.b19_fragments.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.b19_fragments.R;
import com.example.b19_fragments.interfaces.FragmentCallback;

/**
 * Created by chethan on 11/23/2015.
 */
public class Fragment1 extends Fragment{

    private Button replaceBtn;
    private FragmentCallback fragmentCallback;

    public void setFragmentCallback(FragmentCallback fragmentCallback){
        this.fragmentCallback = fragmentCallback;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1_layout, container, false);

        replaceBtn = (Button) view.findViewById(R.id.replaceBtn);


        replaceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentCallback.buttonIsClicked();
            }
        });


        return view;
    }


}
