package ro.myClass;

import ro.myClass.models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Popescu","Alex",24,"Python,Java,Php,JavaScript,SQL",8);
        Person person1 = new Person("Dumitrescu","Rares",30,"Python,PowerShell,Linux,Ruby,C/C++",10);
        Person person2 = new Person("Cristescu","Ioan",25,"Java,JavaScript,HTML,CSS,SQL",9);
        Person person3 = new Person("Ursulescu","Dragos",27,"HTML,CSS,JavaScript,TypeScript",7);
        Person person4 = new Person("Filip","Denis",23,"NodeJS,Python,PHP,C#,JavaScript",4);
        SoftwareDeveloper developer = new SoftwareDeveloper(person,0);developer.calculateSalary();
        CyberSecurity security = new CyberSecurity(person1,0);security.calculateSalary();
        FullStack fullStack = new FullStack(person2,0);fullStack.calculateSalary();
        FrontEnd frontEnd = new FrontEnd(person3,0);frontEnd.calculateSalary();
        BackEnd backEnd = new BackEnd(person4,0);backEnd.calculateSalary();
        ArrayList<Jobs> jobs = new ArrayList<>();
        jobs.add(developer);
        jobs.add(security);
        jobs.add(frontEnd);
        jobs.add(fullStack);
        jobs.add(backEnd);
        Employers employers = new Employers(jobs);
        System.out.println(employers.describe());

    }
}