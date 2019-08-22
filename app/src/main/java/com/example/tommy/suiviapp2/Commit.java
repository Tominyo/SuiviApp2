package com.example.tommy.suiviapp2;

import java.util.Date;

public class Commit {

    public static final String TABLE_NAME = "commits";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_MESSAGE = "message";
    public static final String COLUMN_TIME = "time";
    public static final String COLUMN_ID_DATE = "id_date";

    private String date;
    private int id;
    private int id_date;
    private String message;

    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_ID_DATE + " INTEGER,"
                    + COLUMN_MESSAGE + " TEXT, "
                    + COLUMN_TIME + " TEXT"
                    + ")";

    public Commit(){

    }

    public Commit(int id, int id_date, String message, String date){
        this.message = message;
        this.id = id;
        this.id_date = id_date;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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

    public int getId_date() {
        return id_date;
    }

    public void setId_date(int id_date) {
        this.id_date = id_date;
    }
}
