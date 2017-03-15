package com.example.zel.dashboardnew;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    Switch NotifSwitch;
    TextView ClearText;
    Toast toast;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.settings_main);
            setTitle("Settings");

            NotifSwitch = (Switch) findViewById(R.id.NotifSwitch);
            NotifSwitch.setOnCheckedChangeListener(this);

            ClearText = (TextView) findViewById(R.id.Clear_text);
            ClearText.setOnClickListener(this);

        }

        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


            //prints to a toast when switch is on...
            if(NotifSwitch.isChecked())
            {
                toast.makeText(getApplicationContext(),
                        "Nottifications are turned on", Toast.LENGTH_SHORT).show();
            }
            //...and when switch is off
            else
            {
                toast.makeText(getApplicationContext(),
                        "Nottifications are turned off", Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        public void onClick(View view) {
            DialogFragment newFragment = ClearAccount.newInstance(
                    R.string.dialog_message);
            newFragment.show(getFragmentManager(), "dialog");

        }

    }
