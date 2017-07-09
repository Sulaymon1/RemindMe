package com.example.sulaymon.remindme.dto;

/**
 * Created by Sulaymon on 09.07.2017.
 */

public class RemindDTO {
    private String title;

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
