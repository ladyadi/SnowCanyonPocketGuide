package com.adrienneeror.snowcanyonpocketguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ListView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        //array list of hikes in snow canyon
        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info ("About",
                "Snow Canyon State Park is a 7,400-acre scenic park tucked amid lava flows and soaring sandstone cliffs in a strikingly colorful and fragile desert environment. Visitors marvel at majestic views and the subtle interplay of light, shadow, and color dancing across canyon walls.",
                R.drawable.jennys_canyon));
        info.add(new Info("Park Location",
                "The park is located eight miles north of St. George, UT on State Route 18.",
                R.drawable.cinder_cone));
        info.add(new Info ("Day-use Fees",
                "Vehicle $6\nSenior vehicles $3\nAnnual pass $75\nSenior Adventure Pass $35\nPedestrians/cyclists(up to 8 people $4\nAnnual Snow Canyon Pedestrian/Cyclist Pass $24",
                R.drawable.desert_tortoise));
        info.add(new Info("Operating Hours",
                "6:00 am - 10:00 pm year-round",
                R.drawable.lava_flow));
        info.add(new Info ("Park History",
                "Created in 1959, Snow Canyon has a long history of human use. Anasazi Indians inhabited the region from A.D. 200 to 1250, utilizing the canyon for hunting and gathering. Paiute Indians used the canyon from A.D. 1200 - the mid-1800s. Mormon pioneers discovered Snow Canyon in the 1850s while searching for lost cattle. The canyon was the site of Hollywood films such as Butch Cassidy and the Sundance Kid, The Electric Horseman, and Jeremiah Johnson. Originally called Dixie State Park, it was later renamed for Lorenzo and Eratus Snow, prominent pioneering Utah leaders.",
                R.drawable.history));
        info.add(new Info ("Geology",
                "Transported by wind more than 183 million years ago, tiny grains of quartzite sand covered much of what is now Utah. These sand dunes, up to 2,500 feet thick, eventually cemented into stone. Burnt orange to creamy white in color, Navajo sandstone, the predominant rock in the park, is what remains of the ancient desert sand sea. Over time, water cut and shaped the sandstone to form canyons. Approximately 1.4 million years ago, and as recently as 27,000 years ago, nearby cinder cones erupted causing lava to flow down these canyons, filling them with basalt. This redirected ancient waterways, eventually carving new canyons. Look up to see lava-capped ridges that were once canyon bottoms.",
                R.drawable.geology));

        //print to hiking xml
        InfoAdapter adapter =
                new InfoAdapter(this, info);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}