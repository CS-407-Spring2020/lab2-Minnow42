package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.util.Log;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "Button Info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {
        Log.i(TAG, "Button pressed");
    }
}
