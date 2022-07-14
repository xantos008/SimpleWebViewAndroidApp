package com.example.simplewebviewapplication

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


//private class MyWebViewClient : WebViewClient() {
//    override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
//        view.loadUrl(url)
//        return true
//    }
//}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView: WebView = findViewById<WebView>(R.id.webView1);
        webView.webViewClient = WebViewClient()
        webView.clearCache(true)
        webView.clearHistory();
        webView.settings.javaScriptEnabled = true
        webView.settings.javaScriptCanOpenWindowsAutomatically = true
        webView.loadUrl("http://10.0.2.2:3000");
//        webView.loadUrl("https://portal.godevenv.com/integration-20220708");
    }
}