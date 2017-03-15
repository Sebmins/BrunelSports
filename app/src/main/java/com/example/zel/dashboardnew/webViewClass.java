package com.example.zel.dashboardnew;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class webViewClass extends AppCompatActivity {

    static int currentPosition;

    String[] urlNames = {"https://brunelstudents.com/sportsclubs/BrunelCalisthenics/",
            "https://brunelstudents.com/sportsclubs/MixedMartialArts/"};

    String[] sportsName = {"Calisthenics", "MMA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);


        WebView myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        myWebView.loadUrl(urlNames[currentPosition]);
        setTitle(sportsName[currentPosition]);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.web_view_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menu){

        switch(menu.getItemId()){
            case R.id.close_action:

                closeActivity();

                break;
        }

        return false;

    }

    public void closeActivity(){

        Intent intent = new Intent(webViewClass.this, MainActivity.class);
        startActivity(intent);

    }


    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }




}


