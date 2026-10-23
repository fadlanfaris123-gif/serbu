package com.serbu.app;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override protected void onCreate(Bundle b) {
        super.onCreate(b);
        WebView w = new WebView(this);
        w.getSettings().setJavaScriptEnabled(true);
        w.getSettings().setAllowFileAccess(true);
        w.setWebViewClient(new WebViewClient());
        w.loadUrl("file:///android_asset/control.html");
        setContentView(w);
    }
}￼Enter
