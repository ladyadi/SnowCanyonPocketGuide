package com.adrienneeror.snowcanyonpocketguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ListView;

public class GuidelinesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        //array list of guidelines in snow canyon
        ArrayList<Info> guide = new ArrayList<Info>();
        guide.add(new Info("Camping",
                "Camp only in designated areas. Each permit covers one vehicle and any attached recreational equipment. There is an extra fee for additional vehicles or camping equipment. Only one extra vehicle and up to eight people are allowed in a campsite.",
                R.drawable.camping));
        guide.add(new Info ("Hiking",
                "Hiking and scrambling are permitted only on designated trails and slickrock. See a park ranger for more information.",
                R.drawable.hiking));
        guide.add(new Info ("Fires",
                "Campfires may be built in designated areas. Gathering firewood or starter is prohibited. Seasonal fire bans are in effect June 1 through September 15.",
                R.drawable.fire));
        guide.add(new Info("Pets",
                "Permitted only in campground, on West Canyon Road, and Whiptail Trail; must be leashed. For safety and courtesy, pleae keep your pets under control.",
                R.drawable.pets));
        guide.add(new Info("Plants and Animals",
                "All plants, animals, minerals, and other natural features in state parks are protected. It is unlawful to remove, alter, or destroy them.",
                R.drawable.plants));
        guide.add(new Info("Wastewater",
                "It is unlawful to dump or drain wastewater from campers or trailers onto the ground. A sanitary disposal station is provided for registered campers.",
                R.drawable.wastewater));
        guide.add(new Info("Quite Hours",
                "10:00 p.m. to 8:00 a.m.",
                R.drawable.quiet));
        guide.add(new Info("Accidents",
                "Please report accidents or suspicious activites to a ranger.",
                R.drawable.accident));
        guide.add(new Info("Permits",
                "A Special Use Permit is required for all special events and commercial or professional filming and photography. ",
                R.drawable.permit));

        //print to hiking xml
        InfoAdapter adapter =
                new InfoAdapter(this, guide);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}