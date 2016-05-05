package com.undo3.app02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View v) {
        TextView menuItem;
        String logString;

        menuItem = (TextView)findViewById(R.id.menu_item_1);
        logString = (String)menuItem.getText();
        Log.i("UNDO3 LOGGING", logString);
        menuItem = (TextView)findViewById(R.id.menu_item_2);
        logString = (String)menuItem.getText();
        Log.i("UNDO3 LOGGING", logString);
        menuItem = (TextView)findViewById(R.id.menu_item_3);
        logString = (String)menuItem.getText();
        Log.i("UNDO3 LOGGING", logString);

    }
}
