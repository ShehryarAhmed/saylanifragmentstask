package com.example.sayla.newproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import layout.BlankFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BlankFragment blankFragment = new BlankFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.Framelayout,blankFragment).commit();
    }
}
