package com.nagy.hireme.data;

public class ProgLangKnowledge {

    private String languageName;
    private int rating; // 1-little .. 5-very good

    public ProgLangKnowledge(String languageName, int rating) {
        this.languageName = languageName;
        this.rating = rating;
    }

    public String getLanguageName() {
        return languageName;
    }

    public int getRating() {
        return rating;
    }
}
