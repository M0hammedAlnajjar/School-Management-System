package utils;

import entities.Teacher;

import java.util.List;

public class HelperUtils extends Teacher {
    private String major;
    private double GPA;

    public HelperUtils(String firstName, String lastName, String dateOfBirth, String gender, String phoneNumber, String email, String address, int experienceYears, String subject, double salary, List<String> classesTaught) {
        super(firstName, lastName, dateOfBirth, gender, phoneNumber, email, address, experienceYears, subject, salary, classesTaught);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
