package com.example.zel.dashboardnew;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

import static android.R.id.list;
import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static com.example.zel.dashboardnew.R.id.listview;
import static com.example.zel.dashboardnew.R.id.webview;

public class searchActivity  extends Activity { // AppCompatActivity

    String[] items;
    ArrayList<String> listitems;
    ArrayAdapter<String> adapter;
    ListView listView;
    EditText editText;
    String[] mainItemList = {"Football, Cricket, MMA, Callisthenics, Boxing"};
    listViewDashboard class2 = new listViewDashboard();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_main);

        listView = (ListView) findViewById(listview);
        editText = (EditText) findViewById(R.id.txtsearch);


        initList();//When search button is clicked it will display the dummy data






        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().equals("")) {
                    //This resets listview

                    initList();

                } else {
                    //perform search
                    searchItem(charSequence.toString());

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });



    }



    //Created a method for dummy data
    public void initList() {

        //Adding the dummy data into a String Array
        items = new String[]{"Football", "Cricket", "MMA", "Calisthenics"
                , "Boxing"};





        //This displays the items in the String array into a list view
        listitems = new ArrayList<>(Arrays.asList(items));
        adapter = new ArrayAdapter<String>(this, R.layout.search_list_item, R.id.txtitem, listitems);
        listView.setAdapter(adapter);//setting the listview to the adpater



        String[] mainItemList = {"Football, Cricket, MMA, Callisthenics, Boxing"};




    }

    //This method helps perform the search to happen
    public void searchItem(String textToSearch) {


        for (String item : items) {
            if (!item.contains(textToSearch)) {

                listitems.remove(item); //When the user types it will narrow the list down and removes the rest of the item
                //until the word is removed then the list is reset

            }



        }
        adapter.notifyDataSetChanged();

    }







}


