package com.example.saveyourfood.models;

import java.util.Date;

public class MyGrocery {
    private String name;
    private String quantity;
    private String date; //wird später ins Datentyp Date umgewandelt

    public MyGrocery(String name, String quantity, String date) {
        this.name = name;
        this.quantity = quantity;
        this.date = date;
    }

    public MyGrocery() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MyGrocery{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", date=" + date +
                '}';
    }
}
