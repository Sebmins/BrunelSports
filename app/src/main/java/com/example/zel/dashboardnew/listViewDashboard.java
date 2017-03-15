package com.example.zel.dashboardnew;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Zel on 15/03/2017.
 */

public class listViewDashboard extends ListActivity {

    String[] mainItemList = {"Football, Cricket, MMA, Callisthenics, Boxing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setListAdapter(new ArrayAdapter<String>(listViewDashboard.this, android.R.layout.simple_list_item_1, mainItemList));

    }






}
