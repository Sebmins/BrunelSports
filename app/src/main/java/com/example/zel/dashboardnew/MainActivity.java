package com.example.zel.dashboardnew;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;


public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Home");









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


}
