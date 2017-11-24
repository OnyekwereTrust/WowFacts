package com.example.tjah.wowfacts;


public class Facts {

    private int mFactId;

    public Facts(int textResId) {
        mFactId = textResId;

    }

    public int getFactId() {
        return mFactId;
    }

    public void setTextResId(int textResId) {
        mFactId = textResId;
    }


}
