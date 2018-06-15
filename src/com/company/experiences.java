package com.company;

import java.util.ArrayList;

public class experiences {

    ArrayList <String> position;
    ArrayList <String> company;
    ArrayList <String> date;
    ArrayList <String> duty1;
    ArrayList <String> duty2;

    public experiences() {

        this.position = new ArrayList <>();
        this.company = new ArrayList <>();
        this.date = new ArrayList <>();
        this.duty1 = new ArrayList <>();
        this.duty2 = new ArrayList <>();

    }

    public ArrayList <String> getPosition() {
        return position;
    }

    public void setPosition(ArrayList <String> position) {
        this.position = position;
    }

    public ArrayList <String> getCompany() {
        return company;
    }

    public void setCompany(ArrayList <String> company) {
        this.company = company;
    }

    public ArrayList <String> getDate() {
        return date;
    }

    public void setDate(ArrayList <String> date) {
        this.date = date;
    }

    public ArrayList <String> getDuty1() {
        return duty1;
    }

    public void setDuty1(ArrayList <String> duty1) {
        this.duty1 = duty1;
    }

    public ArrayList <String> getDuty2() {
        return duty2;
    }

    public void setDuty2(ArrayList <String> duty2) {
        this.duty2 = duty2;
    }


    @Override
    public String toString() {
        String display = "";
        for (int i = 0; i < position.size(); i++) {
            display += position.get(i) + "\n" + company.get(i) + "\n" + date.get(i) + "\n" + duty1.get(i) + "\n" + duty2.get(i);
        }
        return display;
    }

}
