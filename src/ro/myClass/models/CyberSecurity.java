package ro.myClass.models;

public class CyberSecurity implements Jobs{
    private Person person;
    private int salary;

    public CyberSecurity(Person person, int salary) {
        this.person = person;
        this.salary = salary;
    }

    @Override
    public String describe() {
        String text = "";
        text += person.describe();
        text += "\nJob : Cyber Security";
        text+="\nSalary: " + salary;
        text += "\n=====================================\n";
        return text;
    }

    @Override
    public void calculateSalary() {
        this.setSalary(person.getHours()*54*30);
    }

    @Override
    public String programmingLanguages() {
        return person.programmingLanguages();
    }
    @Override
    public String toString(){
        return person+","+"Cyber Security"+salary;
    }
    @Override
    public boolean equals(Object obj){
        CyberSecurity security = (CyberSecurity) obj;
        return this.person.equals(security.person);
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
