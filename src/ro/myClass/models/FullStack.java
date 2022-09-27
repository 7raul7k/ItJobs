package ro.myClass.models;

public class FullStack implements Jobs{
    private Person person;
    private int salary;

    public FullStack(Person person, int salary) {
        this.person = person;
        this.salary = salary;
    }

    @Override
    public String describe() {
        String text = "";
        text += person.describe();
        text += "\nJob: " + "Fullstack Developer";
        text+="\nSalary: " + salary;
        text += "\n=====================================\n";
        return text;
    }

    @Override
    public void calculateSalary() {
        this.setSalary(person.getHours()*61*30);

    }

    @Override
    public String programmingLanguages() {
        return person.programmingLanguages();
    }
    @Override
    public String toString(){
        return person+","+"Full Stack Developer"+salary;
    }
    @Override
    public boolean equals(Object obj){
        FullStack fullStack = (FullStack) obj;
        return this.person.equals(fullStack.person);
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
