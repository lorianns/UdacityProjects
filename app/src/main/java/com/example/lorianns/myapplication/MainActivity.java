package com.example.lorianns.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.StringBufferInputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        String projectTitle = ((Button) view).getText().toString();
        Toast.makeText(getApplicationContext(), "This button will launch " + projectTitle + " app!", Toast.LENGTH_LONG).show();
    }
}
