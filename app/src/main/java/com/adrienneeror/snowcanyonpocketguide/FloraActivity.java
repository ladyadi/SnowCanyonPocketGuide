package com.adrienneeror.snowcanyonpocketguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ListView;

public class FloraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        //array list of hikes in snow canyon
        ArrayList<Info> flora = new ArrayList<Info>();
        flora.add(new Info ("Creosote Bush",
                "Creosote bush is a unique component of hot deserts in North America. This plant endures arid conditions due to its toughness.",
                R.drawable.creosote_bush));
        flora.add(new Info ("Narrow Leaf Yucca",
                "Narrow leaf yucca is a member of the agave family. Members of it's family are from tropical or warm regions, often where it is arid. ",
                R.drawable.narrow_yucca));
        flora.add(new Info ("Sand Sage",
                "Growing in rocky or sandy soils, it thrives in full sun and well-drained soils at upper elevations",
                R.drawable.sand_sage));
        flora.add(new Info ("Blackbrush",
                "Native to the United States deserts, it is called blackbrush becasue the gray branches darken when wet by rains.",
                R.drawable.blackbrush));
        flora.add(new Info ("Scrub Oak",
                "Native to North America, scrub oaks grow predominately in arid climate zomes with shallow soil.",
                R.drawable.scrub_oak));
        flora.add(new Info ("Desert Willow",
                "Native to the southwestern United States and Mexico, desert willow is a member of the catalpa family, Bignoniaceae.",
                R.drawable.desert_willow));
        flora.add(new Info ("Coyotes",
                "Coyotes are omnivores, which means they will eat just about anything.",
                R.drawable.coyote));
        flora.add(new Info ("Kit Foxes",
                "Kit foxes are creatures of the night. They avoid heat stress during the day by remaining inactive in underground dens.",
                R.drawable.kit_foxes));
        flora.add(new Info ("Quail",
                "Quails can lay 10-20 eggs at one time.",
                R.drawable.quail));
        flora.add(new Info ("Roadrunners",
                "Roadrunners have zygodactyl feet. Two toes on the front and two toes on the back.",
                R.drawable.road_runner));
        flora.add(new Info ("Leopard Lizards",
                "Leopard lizards are absent from areas of steep slope, dense vegetation, or areas subject to seasonal flooding.",
                R.drawable.leopard_lizard));
        flora.add(new Info ("Gopher Snakes",
                "Gophers indeed are the gopher snake's primary prey. However, because these agile snakes are adapt at climbing and swimming, their diets are not limited to a single species.",
                R.drawable.gopher_snake));
        flora.add(new Info ("Canyon Tree Frogs",
                "Native to the rocky plateau, canyon tree frogs are relatively small. Approximatly 2.2 inches.",
                R.drawable.canyon_treefrog));
        flora.add(new Info ("Peregrine Falcons",
                "Peregrine falcons eat mostly birds of an enormous variety. 450 North American species have been documents as their prey. This species is protected by state and/or federal law.",
                R.drawable.peregrine_falcon));
        flora.add(new Info ("Desert Tortoises",
                "Desert tortoises are native to the Mojave and Sonoran deserts. In Utah, they can only be found in Washington County. Adult tortoises can survive a year or more without access to water. It takes 16 years to fully mature and can live 30 to 50 years total. Adult tortoises mate in the spring and early fall. This sensitive species is protected by state and/or federal law.",
                R.drawable.desert_tortoise));
        flora.add(new Info ("Gila Monsters",
                "The gila monster is an ancient native of St. George. Gila monters and their relatives, the bearded lizards, are the only venomous lizards in the world. This venom is lethal to small mammals. They specialize on eating eggs and juvenile mammals from nests. This species is protected by state and federal laws.",
                R.drawable.gila_monster));

        //print to hiking xml
        InfoAdapter adapter =
                new InfoAdapter(this, flora);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

