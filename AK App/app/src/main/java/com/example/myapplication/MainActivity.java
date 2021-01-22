package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import com.example.myapplication.R;
import android.webkit.WebView;
//import android.webkit.WebChromeClinet;
public class MainActivity extends Activity {

    private WebView mwebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

mwebView = (WebView) findViewById(R.id.webView);
WebSettings WebSettings = mwebView.getSettings() ;


mwebView.loadUrl("file:///android_asset/index.html");


mwebView.getSettings().setJavaScriptEnabled(true);
mwebView.setWebViewClient(new WebViewClient()

);


    }

}
