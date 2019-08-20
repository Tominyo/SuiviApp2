package com.example.tommy.suiviapp2;

import java.util.Date;

public class Commit {

    private Date date;
    private int id;
    private String message;

    public Commit(){

    }

    public Commit(String message, int id, Date date){
        this.message = message;
        this.id = id;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
