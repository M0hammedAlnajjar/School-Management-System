package entities;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private String subject;
    private int experienceYears;
    private double salary;
    private List<String> classesTaught;

    public Teacher(String firstName, String lastName, String dateOfBirth, String gender, String phoneNumber, String email, String address, int experienceYears, String subject, double salary, List<String> classesTaught) {
        super(firstName, lastName, dateOfBirth, gender, phoneNumber, email, address);
        this.experienceYears = experienceYears;
        this.subject = subject;
        this.salary = salary;
        this.classesTaught = classesTaught;
        this.classesTaught=new ArrayList<>();
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 0) {
            System.out.println("Experience years cannot be negative");
            this.experienceYears = 0;
        }
        this.experienceYears = experienceYears;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getClassesTaught() {
        return classesTaught;
    }

    public void setClassesTaught(List<String> classesTaught) {
        this.classesTaught = classesTaught;
    }

        public void updateSalary(double salary,String reason) {
            setSalary(salary);
            System.out.println("Salary updated"+reason);
        }
    @Override
    public void displayInfo() {

        super.displayInfo();
        System.out.println("Teacher:" +getFirstName()+ " "+getFirstName() + "| subject:" +subject +" | experienceYears:" +experienceYears + "  years" );
    }
}
