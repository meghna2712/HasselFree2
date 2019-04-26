package com.customers.hasselfree;



public class customers {

    // Store the id of the  movie poster
    private int mImageDrawable;
    // Store the name of the movie
    private String mName;
    // Store the release date of the movie
    private float mRelease;

    // Constructor that is used to create an instance of the Movie object
    public customers(int mImageDrawable, String mName, float mRelease) {
        this.mImageDrawable = mImageDrawable;
        this.mName = mName;
        this.mRelease = mRelease;
    }

    public int getmImageDrawable() {
        return mImageDrawable;
    }

    public void setmImageDrawable(int mImageDrawable) {
        this.mImageDrawable = mImageDrawable;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public float getmRelease() {
        return mRelease;
    }

    public void setmRelease(float mRelease) {
        this.mRelease = mRelease;
    }
}