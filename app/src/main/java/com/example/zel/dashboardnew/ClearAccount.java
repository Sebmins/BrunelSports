package com.example.zel.dashboardnew;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Anna's RoG Laptop on 15-Mar-17.
 */

public class ClearAccount extends DialogFragment {

        static Toast toast = null;
        ArrayList<String> items = new ArrayList<String>();

    public static ClearAccount newInstance(int title) {
        ClearAccount frag = new ClearAccount();
        Bundle args = new Bundle();
        args.putInt("title", title);
        frag.setArguments(args);
        return frag;

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.dialog_message)
                .setPositiveButton(R.string.dialog_option_1, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // clear the timetable!
                    }
                })
                .setNegativeButton(R.string.dialog_option_2, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
        builder.setPositiveButton(R.string.dialog_option_1, new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id) {

                //user clicked Yes button
                toast.makeText(getActivity(),
                        "Your account has been cleared", Toast.LENGTH_SHORT).show();
                toast.makeText(getActivity(),
                        "The following has been removed from your timetable ",Toast.LENGTH_LONG).show();

            }

        });
        builder.setNegativeButton(R.string.dialog_option_2, new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id){
                //user clicked Yes button
            }

        });
        // Create the AlertDialog object and return it
        return builder.create();
    }
}
