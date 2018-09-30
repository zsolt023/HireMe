package com.nagy.hireme.data;

public class Hobby {
    private String title;
    private int resId;

    public Hobby(String title, int resId) {
        this.title = title;
        this.resId = resId;
    }

    public String getTitle() {
        return title;
    }

    public int getResId() {
        return resId;
    }
}
