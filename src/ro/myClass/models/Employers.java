package ro.myClass.models;

import java.util.ArrayList;

public class Employers implements Jobs {
    private ArrayList<Jobs> jobs;

    public Employers(ArrayList<Jobs> jobs) {
        this.jobs = jobs;
    }

    @Override
    public String describe() {
        String text = "";
       for(int i = 0 ; i < jobs.size();i++){
           text += jobs.get(i).describe();
       }
       return text;
    }

    @Override
    public void calculateSalary() {
        for(int i = 0 ; i < jobs.size();i++){
            this.jobs.get(i).calculateSalary();
        }

    }

    @Override
    public String programmingLanguages() {
        String text = "";
       for(int i = 0 ; i < jobs.size();i++){
           text += "Person: " + jobs.get(i).programmingLanguages();
       }
       return text;
    }
}
