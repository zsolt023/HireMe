package com.nagy.hireme.data;

public class ProfessionalExperience {
    private String title;
    private String interval;
    private String text;
    private boolean expanded;

    public ProfessionalExperience(String title, String interval, String text) {
        this.title = title;
        this.interval = interval;
        this.text = text;
        this.expanded = false;
    }

    public String getTitle() {
        return title;
    }

    public String getInterval() {
        return interval;
    }

    public String getText() {
        return text;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }
}
