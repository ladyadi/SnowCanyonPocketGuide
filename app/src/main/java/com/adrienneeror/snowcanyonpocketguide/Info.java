package com.adrienneeror.snowcanyonpocketguide;

public class Info {
    private String maboutNames;
    private String maboutDescriptions;
    private int mimage;

    public Info (String aboutNames, String aboutDescriptions, int image){
        maboutNames = aboutNames;
        maboutDescriptions = aboutDescriptions;
        mimage = image;
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
}
