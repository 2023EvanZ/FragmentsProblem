package com.example.fragments;
import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragments.R;

public class MainActivity extends AppCompatActivity {
    int count = 1;
    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.fragment_container);
        // Begin the transaction

        // Replace the contents of the container with the new fragment
        ft.add(R.id.fragment_container, new FragmentA(),"FragmentName");
        //or ft.replace(R.id.fragment_container, new FragmentB());

        // Complete the changes added above
        ft.commit();
    }

    public void addFragments(View view) {
        String tag = "FragmentName" + Integer.toString(count);
        //System.out.println(tag);
        count++;
        FrameLayout fragmentContainer = new FrameLayout(this);
        //layout.addView(fragmentContainer);
        ft.add(R.id.frameLayout1, new FragmentA(), "FragmentName");
        ft.commit();
    }
}