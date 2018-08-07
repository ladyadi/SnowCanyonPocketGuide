package com.adrienneeror.snowcanyonpocketguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find shortHikes textView
        TextView guidelines = (TextView) findViewById(R.id.guidelines);

        // Set a click listener on that View
        guidelines.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent guidelinesIntent = new Intent(MainActivity.this, GuidelinesActivity.class);
                startActivity(guidelinesIntent);
            }
        });

        // find mediumHikes textView
        TextView history = (TextView) findViewById(R.id.about);

        // Set a click listener on that View
        history.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
            }
        });

        // find longHikes textView
        TextView hiking = (TextView) findViewById(R.id.hiking);

        // Set a click listener on that View
        hiking.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent hikingIntent = new Intent(MainActivity.this, HikingActivity.class);
                startActivity(hikingIntent);
            }
        });

        // find flora textView
        TextView flora = (TextView) findViewById(R.id.flora);

        // Set a click listener on that View
        flora.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent floraIntent = new Intent(MainActivity.this, FloraActivity.class);
                startActivity(floraIntent);
            }
        });
    }
}
