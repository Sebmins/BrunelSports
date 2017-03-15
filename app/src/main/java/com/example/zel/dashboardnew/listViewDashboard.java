package com.example.zel.dashboardnew;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import static android.R.id.list;

/**
 * Created by Zel on 15/03/2017.
 */

public class listViewDashboard extends ListActivity {

    String[] items = {"Football", "Cricket", "MMA", "Calisthenics"
            , "Boxing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //setListAdapter(new ArrayAdapter<String>(listViewDashboard.this, android.R.layout.simple_list_item_1, mainItemList));

    }




/*
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String cheese = items[position];

        try {
            Class ourClass = Class.forName("com.zel.example.dashboardnew.webViewClass");
            Intent ourIntent = new Intent(listViewDashboard.this, ourClass);
            startActivity(ourIntent);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
    */




}
