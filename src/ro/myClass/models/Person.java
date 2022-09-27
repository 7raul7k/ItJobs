package ro.myClass.models;

import ro.myClass.models.Jobs;

public class Person implements Jobs {
    private String firstName;
    private String lastName;
    private int age;
    private String programmingLanguages;
    private int hours;

    public Person(String firstName, String lastName, int age, String programmingLanguages,int hours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.programmingLanguages = programmingLanguages;
        this.hours = hours;
    }

    @Override
    public String describe() {
        String text = "";
        text += "First name: " + firstName;
        text += "\nLast name: " + lastName;
        text += "\nAge: " + age;
        text += "\nLanguages: " + programmingLanguages;
        text += "\nHours: " + hours;
        return text;
    }

    @Override
    public void calculateSalary() {
        System.out.println("This person doesnt have a salary");
    }

    @Override
    public String programmingLanguages() {
        return programmingLanguages;
    }
    @Override
    public String toString(){
        return firstName+","+lastName+","+age+","+programmingLanguages+","+hours;
    }
    @Override
    public boolean equals(Object obj){
        Person m = (Person) obj;
        if(this.equals(m)){
            return true;
        }
        return false;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setProgrammingLanguages(String programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public String getProgrammingLanguages() {
        return programmingLanguages;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


}
