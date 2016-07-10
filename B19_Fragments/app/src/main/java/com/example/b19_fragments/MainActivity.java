package com.example.b19_fragments;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.b19_fragments.fragments.Fragment1;
import com.example.b19_fragments.fragments.Fragment2;
import com.example.b19_fragments.interfaces.FragmentCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Load the UI
        setContentView(R.layout.activity_main);


        //Attach fragment1
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        Fragment1 fragment1 = new Fragment1();
        fragment1.setFragmentCallback(fragmentCallback);

        transaction.replace(R.id.mainContainer, fragment1);

        transaction.commit();
    }

    FragmentCallback fragmentCallback = new FragmentCallback() {
        @Override
        public void buttonIsClicked() {
            //Remove the fragment1
            //Attach fragment2

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            Fragment2 fragment2 = new Fragment2();

            transaction.replace(R.id.mainContainer, fragment2);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    };
}
