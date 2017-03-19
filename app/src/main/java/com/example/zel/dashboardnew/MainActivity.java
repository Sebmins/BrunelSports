package com.example.zel.dashboardnew;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;


import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import static com.example.zel.dashboardnew.webViewClass.link;


public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setTitle("Home");

        TextView football, cali, cricket, mma, boxing;

        football = (TextView) findViewById(R.id.Football);
        cali = (TextView) findViewById(R.id.Calisthenics);
        cricket = (TextView) findViewById(R.id.Cricket);
        mma = (TextView) findViewById(R.id.MMA);
        boxing = (TextView) findViewById(R.id.Boxing);

        football.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                link = "https://brunelstudents.com/sportsclubs/football/";
                Intent intent = new Intent(MainActivity.this, webViewClass.class);
                startActivity(intent);
            }
        });

        cali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                link = "https://brunelstudents.com/sportsclubs/BrunelCalisthenics/";
                Intent intent = new Intent(MainActivity.this, webViewClass.class);
                startActivity(intent);
            }
        });

        cricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                link = "https://brunelstudents.com/sportsclubs/MensCricket/";
                Intent intent = new Intent(MainActivity.this, webViewClass.class);
                startActivity(intent);
            }
        });

        mma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                link = "https://brunelstudents.com/sportsclubs/MixedMartialArts/";
                Intent intent = new Intent(MainActivity.this, webViewClass.class);
                startActivity(intent);
            }
        });


        boxing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                link = "https://brunelstudents.com/sportsclubs/Boxing/";
                Intent intent = new Intent(MainActivity.this, webViewClass.class);
                startActivity(intent);
            }
        });


    }


    // ----------------------- THIS SECTION CONTROLS THE MENU BAR, LINK ALL PAGES BELOW -------------------------------------


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_actions, menu);

        return super.onCreateOptionsMenu(menu);
    } // Creates the menu

    public boolean onOptionsItemSelected(MenuItem menu){

        switch(menu.getItemId()){
            case R.id.action_settings:

                settingsPage();

                break;

            case R.id.action_notifications:

                notificationsPage();

                break;

            case R.id.action_search:

               searchPage();

                break;
        }

        return false;

    } // Menu listeners for menu items

    private void settingsPage(){
        setTitle("Settings");
        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intent);
    } // Controls when 'settings' is clicked

    private void notificationsPage(){
        setTitle("Notifications");
    } // Controls what happens when 'notifications' is clicked

    private void searchPage(){
        setTitle("Search");

        Intent intent = new Intent(MainActivity.this, searchActivity.class);
        startActivity(intent); //Creating a new activity when the search button is clicked

    } // Controls what happens when 'Search' is clicked

// --------------------------- ABOVE CONTROLS THE MENU BAR, LINK ALL PAGES ABOVE ----------------------------------------------


    //android:clickable="true"




}
