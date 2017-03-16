package com.example.ciprian.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //look this is the layout file i'm linkings
        setContentView(R.layout.activity_main);
    }
}
