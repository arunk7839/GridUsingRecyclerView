package com.c1ctech.gridusingrecyclerview;

public class Item {

    private int imageResourseId;
    private String versionName;

    public Item(int imageResourseId, String versionName) {
        this.imageResourseId = imageResourseId;
        this.versionName = versionName;
    }

    public int getImageResourseId() {
        return imageResourseId;
    }


    public String getVersionName() {
        return versionName;
    }

}
