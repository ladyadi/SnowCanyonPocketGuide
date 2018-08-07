package com.adrienneeror.snowcanyonpocketguide;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Console;
import java.util.ArrayList;

import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView;

public class HikingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        double lat;
        double lon;

        //array list of hikes in snow canyon
        final ArrayList<Hiking> hike = new ArrayList<Hiking>();
        hike.add(new Hiking ("Jenny's Canyon .5 Mile",
                "This great children's trail leads to a short, sculpted slot canyon.",
                R.drawable.jennys_canyon, lat = 37.188230, lon=-113.644418));
        hike.add(new Hiking  ("Pioneer Names .5 Mile",
                "This cresent-shaped trail passes pioneer names written in axel grease, dating back to 1881.",
                R.drawable.pioneer_names, lat = 37.195735,lon = -113.645814));
        hike.add(new Hiking  ("Sand Dunes .5 Mile",
                "Trail leads to a large expance of red sand serving as a giant sandbox and play area for children of all ages.",
                R.drawable.sand_dunes, lat = 37.191642, lon = -113.645926 ));
        hike.add(new Hiking  ("Petrified Dunes 1 Mile",
                "This trail crosses massive Navajo sandstone outcrops and sand dunes frozen in time.",
                R.drawable.petrified_dunes, lat = 37.213232, lon = -113.645748));
        hike.add(new Hiking ("Cinder Cone Trail 1.5 Miles",
                "Hike amoung 'lava clinkers' as you corkscrew 500 feet to the top of an extinct volcano where you can view a volcano crater and panoramic scenery.",
                R.drawable.cinder_cone, lat = 37.243652, lon = -113.628066));
        hike.add(new Hiking ("Hidden Pinyon 1.5 Miles",
                "This self-guided nature trail highlights geological features and native plants of the park.",
                R.drawable.hidden_pinyon, lat = 37.203050, lon = -113.641477));
        hike.add(new Hiking  ("Butterfly Trail 2 miles",
                "Winding along the west side of Petrified Dunes, this trail leads to West Canyon Overlook and lava tubes.",
                R.drawable.butterfly_trail, lat=37.215710, lon= -113.643617 ));
        hike.add(new Hiking ("Johnson Canyon 2 Miles",
                "Leads to a sheltered canyon of willow and cottonwood, winding through lava flows and red rock to an arch spanning 200 feet. Closed annually from 3/15-9/14.",
                R.drawable.johnson_canyon, lat=37.178217, lon=-113.645380 ));
        hike.add(new Hiking ("Red Sands 3.5 Miles",
                "Deep sand and rocky slopes. Trail shares early sections with Hiddon Pinyon then branches off following a sandy wash bottom through 400 ft cliffs of red and white blended sandstone.",
                R.drawable.three_ponds, lat = 37.203050, lon = -113.641477));
        hike.add(new Hiking ("Whiterocks Trail/Amphitheater 4 Miles",
                " Trail leads to a natural sandstone amphitheater, passing through the red, white, and black geologic colors of the park. Or reach the amphitheater on a one-mile trail located one-half mile north of the Snow Canyon Drive/State Rought 18 junction.",
                R.drawable.whiterocks_trail, lat = 37.231412, lon = -113.642386));
        hike.add(new Hiking  ("Whiptail Trail 6 Miles",
                "Tucked along the canyon bottom, this paved trail is suitable for walking, jogging, and biking.",
                R.drawable.whiptail_trail, lat = 37.178143, lon = -113.645016 ));
        hike.add(new Hiking  ("West Canyon Road 8 Miles",
                "Trail follows a maintenance road winding past dry washes and towering cliffs to the head of present-day Snow Canyon.",
                R.drawable.west_canyon, lat = 37.193674, lon = -113.648378 ));
        hike.add(new Hiking  ("Lava Flow Trail",
                "Hike through a jumbled lava field, the vivid remains of a long ago volcanic eruption.",
                R.drawable.lava_flow, lat = 37.221997,  lon = -113.642027 ));

        //print to hiking xml
        HikingAdapter adapter =
                new HikingAdapter(this, hike);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //find object at given position of user click
                Hiking hikes = hike.get(position);

                Uri googleMaps = Uri.parse("geo:" + hikes.getLat() + "," + hikes.getLon() + "?z=20");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, googleMaps);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }

                Log.e("test", "log " + hikes.getLat());
            }
        });

    }
}
