package com.adrienneeror.snowcanyonpocketguide;

import android.net.Uri;

import java.net.URI;

public class Hiking {
    private String maboutNames;
    private String maboutDescriptions;
    private int mimage;
    private double mlat;
    private double mlon;

    public Hiking (String aboutNames, String aboutDescriptions, int image, double lat, double lon){
        maboutNames = aboutNames;
        maboutDescriptions = aboutDescriptions;
        mimage = image;
        mlat = lat;
        mlon = lon;
    }

    //get name
    public String getAboutNames(){
        return maboutNames;
    }

    //get description
    public String getAboutDescriptions(){
        return maboutDescriptions;
    }

    //get image
    public int getImage() {return mimage;}

    //get map
    public double getLat() {return mlat;}
    public double getLon() {return mlon;}
}
