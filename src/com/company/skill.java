package com.company;

import java.util.HashMap;

public class skill {

    HashMap <String, String> skillJob;

    public skill() {
        skillJob = new HashMap <>();
    }

    public HashMap <String, String> getSkillJob() {
        return skillJob;
    }

    public void setSkillJob(HashMap <String, String> skillJob) {
        this.skillJob = skillJob;
    }

    @Override
    public String toString() {
        String display = "";
        for (String i : skillJob.keySet()) {
            display += i + "," + skillJob.get(i) + "\n";
        }
        return display;
    }


}
