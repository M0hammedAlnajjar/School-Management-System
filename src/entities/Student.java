package entities;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String gradeLevel;
    private String enrollmentDate;
    private double feeBalance;
    private List<String> subjects;

    public Student(String firstName, String lastName, String dateOfBirth, String gender, String phoneNumber, String email, String address, String gradeLevel, double feeBalance, List<String> subjects, String enrollmentDate) {
        super(firstName, lastName, dateOfBirth, gender, phoneNumber, email, address);
        this.gradeLevel = gradeLevel;
        this.feeBalance = feeBalance;
        this.subjects = new ArrayList<>();
        this.enrollmentDate = enrollmentDate;

    }

    public Student(String id, String first, String lastName, String gender, String phoneNumber, String phone, String address, String gradeLevel, String s, double v, int i) {
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public double getFeeBalance() {
        return feeBalance;
    }

    public void setFeeBalance(double feeBalance) {
        if (feeBalance < 0) {
            System.out.println("Fee balance cannot be negative");
            this.feeBalance = 0;
        }
        this.feeBalance = feeBalance;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student:"+getFirstName()+" "+getLastName()+"GradeLevel: " + gradeLevel+ " |fee balance: " + feeBalance);

    }

    public void updateContact(String phone) {
        setPhoneNumber(phone);
    }
    public void updateContact(String phone, String email) {
        setPhoneNumber(phone);
        setEmail(email);

    }
    public void addSubject(String subject) {
        subjects.add(subject);


    }
}
