package com.example.bangpe;

public class Data {

    String date;
    String content;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Data(String date, String content) {
        
        this.date = date;
        this.content = content;
    }
}
