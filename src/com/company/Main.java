package com.company;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);

        user User = new user();

       ArrayList<String> subjects = new ArrayList<>();
       ArrayList<String> colleges = new ArrayList <>();
       ArrayList<String> dates = new ArrayList <>();

        ArrayList<String> position = new ArrayList <>();
        ArrayList<String> company = new ArrayList <>();
        ArrayList<String> date = new ArrayList <>();
        ArrayList<String> duty1 = new ArrayList <>();
        ArrayList<String> duty2 = new ArrayList <>();

        HashMap<String, String> skill = new HashMap <>();



        System.out.printf("=============================================================== \n\n");

        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Enter Your Sur Name: ");
        String surname = input.nextLine();
        System.out.println("Enter Your E-mail: ");
        String email =  input.nextLine();

        User.setName(name);
        User.setSurName(surname);
        User.setEmail(email);


        educationAdd(subjects, colleges, dates );
        addJobs(company,position,date,duty1,duty2);
        addSkills(skill);


        User.Experiences.setPosition(position);
        User.Experiences.setCompany(company);
        User.Experiences.setDate(date);
        User.Experiences.setDuty1(duty1);
        User.Experiences.setDuty2(duty2);

        System.out.println(User.Education.toString());
        System.out.println(User.Experiences.toString());
        System.out.println(User.Skill.toString()
        );
    }

    public static void educationAdd(ArrayList<String> subject, ArrayList<String> collage, ArrayList<String> date){
        Scanner input = new Scanner(System.in);
        user User = new user();

        String addMore = "";
        int count = 1;

        System.out.println("Enter Your Education: ");

        do{
            System.out.println("Enter your Subject: ");
            String sub = input.nextLine();
            System.out.println("Enter Your Collage Name: ");
            String Collage = input.nextLine();
            System.out.println("Enter Your Graduation year: ");
            String Dates = input.nextLine();
            input.nextLine();

            subject.add(sub);
            collage.add(Collage);
            date.add(Dates);

            User.Education.setSubject(subject);
            User.Education.setCollage(collage);
            User.Education.setDate(date);


            System.out.println("Do you want to add more education");
            addMore = input.nextLine();
        }while(!addMore.equalsIgnoreCase("n"));

    }
   public static void addSkills(HashMap<String,String> skills){
       user user = new user();
       Scanner input = new Scanner(System.in);
       int count =1;
       String option ="";
       System.out.println("Please provide your skills");
       do{
           System.out.println("Enter your skill:");
           String skill = input.nextLine();
           System.out.println("Enter your rating:");
           String rating = input.nextLine();

           skills.put(skill,rating);
           user.Skill.setSkillJob(skills);

           count++;
           System.out.println("Do you want to add more skills (y/n)");
           option = input.nextLine();
           System.out.println(":::::::::::::::::::::::::::::::::::::::");
       }while(!option.equalsIgnoreCase("n"));
   }


    public static void addJobs(ArrayList<String>titles, ArrayList<String> locations, ArrayList<String>
            dates, ArrayList<String> duty1s, ArrayList<String> duty2s){

        user person = new user();
        Scanner input= new Scanner(System.in);
        int count =1;
        String option="";
        System.out.println("Do you want to add your work experience(y/n)");
        String work =input.nextLine();
        while(!work.equalsIgnoreCase("n")){
            System.out.println("Enter your job title: ");
            String title = input.nextLine();
            System.out.println("Enter your job location: ");
            String location = input.nextLine();
            System.out.println("Enter your job date");
            String date = input.nextLine();
            System.out.println("Enter your main duty:");
            String duty1 = input.nextLine();
            System.out.println("Enter your secondary duty: ");
            String duty2 = input.nextLine();

            titles.add(title);
            locations.add(location);
            dates.add(date);
            duty1s.add(duty1);
            duty2s.add(duty2);

            person.Experiences.setDate(dates);
            person.Experiences.setDuty1(duty1s);
            person.Experiences.setDuty2(duty2s);
            person.Experiences.setCompany(locations);
            person.Experiences.setCompany(titles);

            count++;
            System.out.println("Do you want to add more jobs(y/n):");
            work = input.nextLine();
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");

        }
    }
}
