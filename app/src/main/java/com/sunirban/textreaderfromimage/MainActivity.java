package com.sunirban.textreaderfromimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button captureBtn = findViewById(R.id.btn);
        captureBtn.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, Activity_scanner.class);
            startActivity(i);
        });
    }
}