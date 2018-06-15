package com.company;

import java.util.ArrayList;

public class education {

    ArrayList <String> subject;
    ArrayList <String> collage;
    ArrayList <String> date;

    public education() {
        this.subject = new ArrayList <>();
        this.collage = new ArrayList <>();
        this.date = new ArrayList <>();

    }

    public ArrayList <String> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList <String> subject) {
        this.subject = subject;
    }

    public ArrayList <String> getCollage() {
        return collage;
    }

    public void setCollage(ArrayList <String> collage) {
        this.collage = collage;
    }

    public ArrayList <String> getDate() {
        return date;
    }

    public void setDate(ArrayList <String> date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String display = "";

        for (int i = 0; i < collage.size(); i++) {
            display += subject.get(i) + "\n" + collage.get(i) + "," + date.get(i);
        }
        return display;
    }
}
