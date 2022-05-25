package com.example.manual2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;



public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        WebView webView = findViewById(R.id.webView);

        int position = getIntent().getExtras().getInt("title");

        if (position == 0) {
            webView.loadUrl("https://www.alenka.ru/stati/karamel-istoriya-polza-vred-kaloriynost/");
        }
        if (position == 1) {
            webView.loadUrl("https://www.pekarna-saransk.ru/novosti/istoriya-vozniknoveniya-pechenya.html");

        }
        if (position == 2) {
            webView.loadUrl("https://chocoprofi.ru/fakty-o-shokolade/istoriya-shokolada");

        }
        if (position == 3) {
            webView.loadUrl("https://www.konffetki.ru/interesnaya-informaciya/istoriya-vozniknoveniya-vafel/");

        }
        if (position == 4) {
            webView.loadUrl("https://1bakery.ru/produkciya/kulinarnyj-blog/kak-poyavilis-ponchiki-istoriya-ponchikov_/");

        }
        if (position == 5) {
            webView.loadUrl("https://sladkoe.menu/vkusnye-istorii/zefir-istoriya-sozdaniya-sostav-i-ego-evolyuciya-raznoobrazie-vkusov/");

        }
    }

}