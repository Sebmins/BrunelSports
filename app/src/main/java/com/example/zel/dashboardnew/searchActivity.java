package com.example.zel.dashboardnew;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
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
    String result;
    String result1;
    String Line;
    String[] mainItemList = {"Football, Cricket, MMA, Callisthenics, Boxing"};
    listViewDashboard class2 = new listViewDashboard();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_main);

        listView = (ListView) findViewById(listview);
        editText = (EditText) findViewById(R.id.txtsearch);


        initList();//When search button is clicked it will display the dummy data
        new HttpAsyncTask().execute("http://134.83.83.25:47309/BrunelSports?");





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

    //This is getting the URL string
    public  String GET(String url){

        InputStream inputStream = null;
        result1 = "";

        try{
            inputStream = new URL("http://134.83.83.25:47309/BrunelSports?").openStream();

            if(inputStream != null)
                result1 = convertInputStreamToString(inputStream);
            else{
                result1 = "Did not Work!!!"; //If it doesnt get the URL, it will display this message
            }


        }
        catch (Exception e){

            Log.e("InputStream", e.getLocalizedMessage());
        }

        for(String retval:result1.split(" ")){

            result1 = retval+result;
        }

        return result1;
    }


    //This is a method which converts the intput stream into a string
    private String convertInputStreamToString(InputStream inputStream) throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(inputStream));
        Line = "";
        result = "";
        while((Line = BR.readLine())!= null)
            result += Line;
        inputStream.close();


        return result;

    }


    private class HttpAsyncTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... urls) {


            return GET(urls[0]);
        }

        //this is what happens after the database has been called, it will display a message saying recieved
        @Override
        protected void onPostExecute(String result) {

            Toast.makeText(getBaseContext(), "Received", Toast.LENGTH_LONG).show();

            super.onPostExecute(result);


//            listitems = new ArrayList<>(Arrays.asList(result1, result));
//            adapter = new ArrayAdapter<String>(this, R.layout.list_item, new String[]{result}, new int[]{R.id.txtitem} );
//            listView.setAdapter(adapter);


        }


    }


    }


