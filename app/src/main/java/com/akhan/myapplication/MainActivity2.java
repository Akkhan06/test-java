package com.akhan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.akhan.onak.R;

public class MainActivity2 extends AppCompatActivity {

    WebView web;
public static String video_url = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        web = findViewById(R.id.web);

        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl(video_url);
    }
}