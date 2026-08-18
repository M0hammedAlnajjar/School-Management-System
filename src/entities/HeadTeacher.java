package entities;

import java.util.List;

public class HeadTeacher extends Teacher {
    private String department;
    private int teachersManaged;

    public HeadTeacher(String firstName, String lastName, String dateOfBirth, String gender, String phoneNumber, String email, String address, int experienceYears, String subject, double salary, List<String> classesTaught) {
        super(firstName, lastName, dateOfBirth, gender, phoneNumber, email, address, experienceYears, subject, salary, classesTaught);
        this.department = department;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getTeachersManaged() {
        return teachersManaged;
    }

    public void setTeachersManaged(int teachersManaged) {
        this.teachersManaged = teachersManaged;
    }


    public void addManagedTeacher() {
        teachersManaged = teachersManaged + 1;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
         {
            System.out.println("Head Teacher: " + getFirstName() + " " + getLastName()
                    + " | department: " + department + " | manages: " + teachersManaged + " teachers");
        }
}}
