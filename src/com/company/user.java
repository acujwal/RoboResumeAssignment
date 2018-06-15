package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class user {

    private String name;
    private String surName;
    private String email;

    education Education;
    experiences Experiences;
    skill Skill;

    public user() {

        this.name = name;
        this.surName = surName;
        this.email = email;
        this.Experiences = new experiences();
        this.Education = new education();
        this.Skill = new skill();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public education getEducation() {
        return Education;
    }

    public void setEducation(education education) {
        Education = education;
    }

    public experiences getExperiences() {
        return Experiences;
    }

    public void setExperiences(experiences experiences) {
        Experiences = experiences;
    }

    public skill getSkill() {
        return Skill;
    }

    public void setSkill(skill skill) {
        Skill = skill;
    }

    @Override
    public String toString() {
        String display = name + surName + "\n" + email+"\n\n";
        return display;
    }





}
