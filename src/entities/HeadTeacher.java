package entities;

import java.util.List;

public class HeadTeacher extends Teacher {
    private double budgetAllocated;
    private String officeNumber;
    private int yearsOfExperience;
    private String email;
    private boolean isFullTime;


    public HeadTeacher(String firstName, String lastName, String dateOfBirth, String gender, String phoneNumber, String email, String address, int experienceYears, String subject, double salary, List<String> classesTaught, double budgetAllocated, String officeNumber, int yearsOfExperience, String email1, boolean isFullTime) {
        super(firstName, lastName, dateOfBirth, gender, phoneNumber, email, address, experienceYears, subject, salary, classesTaught);
        this.budgetAllocated = budgetAllocated;
        this.officeNumber = officeNumber;
        this.yearsOfExperience = yearsOfExperience;
        this.email = email1;
        this.isFullTime = isFullTime;
    }

    public double getBudgetAllocated() {
        return budgetAllocated;
    }

    public void setBudgetAllocated(double budgetAllocated) {
        this.budgetAllocated = budgetAllocated;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Head Teacher: " + getFirstName() + " " + getLastName()
                + " | budgetAllocated: " + budgetAllocated+ " | officeNumber" +officeNumber + " | yearsOfExperience: " + yearsOfExperience+ " | email: " + email+ "isFullTime"+isFullTime);
    }
}
