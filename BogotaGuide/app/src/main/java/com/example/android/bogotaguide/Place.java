package com.example.android.bogotaguide;

/**
 * Created by User on 01/05/2017.
 */

public class Place {

    /**
     * Name of the place
     */

    private String name;

    /**
     * Address of the place
     */
    private String address;

    /**
     * Website address
     */

    private String website;
    /**
     * Hours when the place is open
     */

    private int mainHours;
    private int alternativeHours;

    /**
     * Picture of the place
     */

    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(String name, String address, int mainHours, int alternativeHours, String website) {
        this.name = name;
        this.address = address;
        this.mainHours = mainHours;
        this.alternativeHours = alternativeHours;
        this.website = website;
    }

    public Place(int mImageResourceID, String name, String address, int mainHours, int alternativeHours, String website) {
        this.name = name;
        this.address = address;
        this.mainHours = mainHours;
        this.alternativeHours = alternativeHours;
        this.website = website;
        this.mImageResourceID = mImageResourceID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getWebsite() {
        return website;
    }

    public int getMainHours() {
        return mainHours;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public int getAlternativeHours() {
        return alternativeHours;

    }

    /*
    * Returns whether or not there is an image for this place
    */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}