package ro.myClass.models;

public class SoftwareDeveloper implements Jobs {
    private Person person;
    private int salary;

    public SoftwareDeveloper(Person person, int salary) {
        this.person = person;
        this.salary = salary;
    }

    @Override
    public String describe() {
        String text = "";
        text += person.describe();
        text += "\nJob: Software Developer";
        text+="\nSalary: " + salary;
        text += "\n============================\n";
        return text;
    }

    @Override
    public void calculateSalary() {
        this.setSalary(person.getHours()*30*30);

    }

    @Override
    public String programmingLanguages() {
        return person.programmingLanguages();
    }
    @Override
    public String toString(){
        return person+","+"Software Developer"+","+salary;
    }
    @Override
    public boolean equals(Object obj){
        SoftwareDeveloper developer = (SoftwareDeveloper) obj;
        return this.person.equals(developer.person);
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
