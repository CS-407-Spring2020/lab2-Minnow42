package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "Button Info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myEditText);
        String str = myTextField.getText().toString();
        goToActivity2(str);
        // Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

}
