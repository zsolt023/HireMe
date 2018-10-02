package com.nagy.hireme.data;

public class Education {

    private String type;
    private String name;
    private String interval;

    public Education(String type, String name, String interval) {
        this.type = type;
        this.name = name;
        this.interval = interval;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getInterval() {
        return interval;
    }
}
