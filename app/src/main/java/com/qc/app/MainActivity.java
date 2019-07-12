package com.qc.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.qc.app.dagger.DaggerPlatfrom;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerPlatfrom
                .builder()
                .build()
                .inject();
    }
}
