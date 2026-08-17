package entities;

import java.util.List;

public class SeniorStudent extends Student {
    private String major;
    private double gpa;


    public SeniorStudent(String firstName, String lastName, String dateOfBirth, String gender, String phoneNumber, String email, String address, String gradeLevel, double feeBalance, List<String> subjects, String enrollmentDate, String major, double gpa) {
        super(firstName, lastName, dateOfBirth, gender, phoneNumber, email, address, gradeLevel, feeBalance, subjects, enrollmentDate);
        this.major = major;
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        System.out.println(" SeniorStudent: " + getFirstName());
        System.out.println("Major: " + getMajor());
        System.out.println("GPA: " + getGpa());

    }
}
