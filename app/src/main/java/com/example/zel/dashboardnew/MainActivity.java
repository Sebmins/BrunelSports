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

    String footballEv = "Football Training";
    String calisthenicsEv = "Calisthenics";
    String gym = "Gym Trainging";
    String badminton = "Badminton";
    String mma = "Mixed Martial Arts";
    String futsal = "Futsal";
    Date date = new Date();

    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM- yyyy", Locale.getDefault());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ---------------------------------Sebs amazing code------------------------------------

        final CompactCalendarView compactCalendarView = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactCalendarView.setFirstDayOfWeek(Calendar.MONDAY);

        final TextView colourText = (TextView) findViewById(R.id.colourText);
        final TextView calendarDate = (TextView) findViewById(R.id.calendarDate);
        final TextView eventText1 = (TextView) findViewById(R.id.event1text);
        final TextView dateText1 = (TextView) findViewById(R.id.dateText);
        final TextView eventTime = (TextView) findViewById(R.id.eventTime1text);
        eventText1.setSingleLine(false);
        eventTime.setSingleLine(false);


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


    // ---------------------------------------- SEB'S AMAZING CODE -----------------------------------------------------------


                calendarDate.setText(dateFormatMonth.format(date));

                String g = date.toString().substring(0, 10);
                dateText1.setText(g);

                compactCalendarView.setUseThreeLetterAbbreviation(true);
                {// Monday
                    // Mon, 06 Mar 2017 07:00:00 GMT
                    long ev3Time = 1488783600000L;

                    for (int i = 0; i < 2; i++) {
                        Event ev5 = new Event(Color.BLACK, ev3Time, gym);
                        compactCalendarView.addEvent(ev5);
                        ev3Time = ev3Time + 604800000;
                    }

                }

                {// Tuesday
                    // Wed, 15 Mar 2017 20:00:00 GMT
                    long ev2Time = 1489520929000L;

                    for (int i = 0; i < 8; i++) {
                        Event ev4 = new Event(Color.CYAN, ev2Time, futsal);
                        compactCalendarView.addEvent(ev4);
                        ev2Time = ev2Time + 604800000;
                    }
                }

                {// Wednesday
                    // Wed, 15 Mar 2017 20:00:00 GMT
                    long ev2Time = 1489581000000L;

                    for (int i = 0; i < 8; i++) {
                        Event ev4 = new Event(Color.GREEN, ev2Time, badminton);
                        compactCalendarView.addEvent(ev4);
                        ev2Time = ev2Time + 604800000;
                    }

                    // Wed, 15 Mar 2017 14:00:00 GMT
                    long ev1Time = 1489586400000L;

                    for (int i = 0; i < 8; i++) {
                        Event ev1 = new Event(Color.YELLOW, ev1Time, footballEv);
                        compactCalendarView.addEvent(ev1);
                        ev1Time = ev1Time + 604800000;
                    }
                }

                {// Thursday
                    // Thu, 02 Mar 2017 04:00:00 GMT
                    long ev2Time = 1488427200000L;

                    for (int i = 0; i < 4; i++) {
                        Event ev4 = new Event(Color.MAGENTA, ev2Time, mma);
                        compactCalendarView.addEvent(ev4);
                        ev2Time = ev2Time+604800000+604800000+604800000+604800000;
                    }

                }

                {// Friday
                    // Fri, 17 Mar 2017 07:00:00 GMT
                    long ev2Time = 1489734000000L;

                    for (int i = 0; i < 8; i++) {
                        Event ev3 = new Event(Color.BLUE, ev2Time, calisthenicsEv);
                        compactCalendarView.addEvent(ev3);
                        ev2Time = ev2Time + 604800000;
                    }

                    // Fri, 10 Mar 2017 08:00:00 GMT
                    long ev3Time = 1489132800000L;

                    for (int i = 0; i < 6; i++) {
                        Event ev5 = new Event(Color.BLACK, ev3Time, gym);
                        compactCalendarView.addEvent(ev5);
                        ev3Time = ev3Time + 604800000 + 604800000;
                    }
                }


                long p = 0;
                StringBuilder stringBuilder = new StringBuilder();
                StringBuilder stringBuilderT = new StringBuilder();
                StringBuilder stringBuilderC = new StringBuilder();
                List<Event> events = compactCalendarView.getEvents(date);
                String y = events.toString();


                String eventToString;

                for (Event event:events) {

                    eventToString = event.getData().toString();
                    int color = event.getColor();

//                    stringBuilder.append("<font color=#FFFF4081>"+eventToString+"fag"+"</font>"+"\n");

                    String hexColor = String.format("#%06X", (0xFFFFFF & color));
//                    stringBuilder.append("<font color="+hexColor+">"+eventToString+"</font>"+"<br/>");
                    stringBuilder.append(" "+eventToString+"\n");

                    stringBuilderC.append("<font color="+hexColor+"><b>o<b></font><br/>");

                    p = event.getTimeInMillis();

                    Date date=new Date(p);
                    SimpleDateFormat format = new SimpleDateFormat("HH:mm");
                    format.setTimeZone(TimeZone.getTimeZone("GMT"));
                    String formatted = format.format(date);
                    stringBuilderT.append(formatted  +"\n");
                }
                String text = stringBuilderC.toString();

                eventTime.setText(stringBuilderT);
                colourText.setText(Html.fromHtml(text));
                eventText1.setText(stringBuilder);

                compactCalendarView.setListener
                        (new CompactCalendarView.CompactCalendarViewListener(){




                            public void onDayClick(Date dateClicked) {

                                String nullCheck = getEvents(dateClicked);

                                while (TextUtils.isEmpty(nullCheck)){
//                if (TextUtils.isEmpty(nullCheck)) {

                                    Calendar cal = Calendar.getInstance();
                                    cal.setTime(dateClicked);
                                    cal.add(Calendar.DATE, 1);
                                    dateClicked = cal.getTime();

                                    nullCheck = getEvents(dateClicked);

                                    String f = dateClicked.toString();
                                    String g = f.substring(0, 10);
                                    dateText1.setText("Upcoming Events For: "+g);

                                }
                            }
                            @Override
                            public void onMonthScroll(Date firstDayOfNewMonth) {
                                Log.d(TAG, "Month was scrolled to: " + firstDayOfNewMonth);
                                calendarDate.setText(dateFormatMonth.format(firstDayOfNewMonth));

                            }

                            public String getEvents(Date dateClicked)
                            {
                                String f = dateClicked.toString();

//                Log.d(TAG, "dateclicked " + dateClicked);
                                String g = f.substring(0, 10);
                                dateText1.setText(g);

                                long p = 0;
                                StringBuilder stringBuilder = new StringBuilder();
                                StringBuilder stringBuilderT = new StringBuilder();
                                StringBuilder stringBuilderC = new StringBuilder();
                                List<Event> events = compactCalendarView.getEvents(dateClicked);
                                String y = events.toString();


                                String eventToString;

                                for (Event event:events) {

                                    eventToString = event.getData().toString();
                                    int color = event.getColor();

//                    stringBuilder.append("<font color=#FFFF4081>"+eventToString+"fag"+"</font>"+"\n");

                                    String hexColor = String.format("#%06X", (0xFFFFFF & color));
//                    stringBuilder.append("<font color="+hexColor+">"+eventToString+"</font>"+"<br/>");
                                    stringBuilder.append(" "+eventToString+"\n");

                                    stringBuilderC.append("<font color="+hexColor+"><b>o<b></font><br/>");

                                    p = event.getTimeInMillis();

                                    Date date=new Date(p);
                                    SimpleDateFormat format = new SimpleDateFormat("HH:mm");
                                    format.setTimeZone(TimeZone.getTimeZone("GMT"));
                                    String formatted = format.format(date);
                                    stringBuilderT.append(formatted  +"\n");
                                }
                                String text = stringBuilderC.toString();

                                eventTime.setText(stringBuilderT);
                                colourText.setText(Html.fromHtml(text));
                                eventText1.setText(stringBuilder);

                                return text;
                            }

                        });
            }


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
