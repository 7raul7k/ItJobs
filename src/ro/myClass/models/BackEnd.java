package ro.myClass.models;

public class BackEnd implements Jobs{
    private Person person;
    private int salary;

    public BackEnd(Person person, int salary) {
        this.person = person;
        this.salary = salary;
    }

    @Override
    public String describe() {
       String text = "";
       text+= person.describe();
       text+="\nJob: " + "Back-End Developer";
       text+="\nSalary: " + salary;
       text+= "\n=============================================\n";
       return text;
    }

    @Override
    public void calculateSalary() {
        this.setSalary(person.getHours()*65*30);

    }

    @Override
    public String programmingLanguages() {
        return person.programmingLanguages();
    }
    @Override
    public String toString(){
        return person+","+"Back-end Developer"+","+salary;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
