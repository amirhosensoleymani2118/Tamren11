package com.example.amirhosein.tamren11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebZoomit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_zoomit);
        WebView web1 = (WebView) findViewById(R.id.WEB1);
        web1.loadUrl("http://zoomit.ir");
        
    }
}
