package com.jingfan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.jingfan.mylibrary.TestSdk;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestSdk testSdk = new TestSdk();
        int result = testSdk.testAdd(1,2);
        Log.e(TAG, "onCreate: " + result);
    }
}