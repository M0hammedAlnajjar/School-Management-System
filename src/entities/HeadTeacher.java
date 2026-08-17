package entities;

public class HeadTeacher {
    private double budgetAllocated;
    private String officeNumber;
    private int yearsOfExperience;
    private String email;
    private boolean isFullTime;

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
}
