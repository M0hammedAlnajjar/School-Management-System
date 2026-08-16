package entities;

import java.util.List;

public class Teacher {
    private String subject;
    private int experienceYears;
    private double salary;
    private List<String> classesTaught;

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
}
