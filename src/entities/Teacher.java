package entities;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private String subject;
    private int experienceYears;
    private double salary;
    private List<String> classesTaught;

    // Constructor
    public Teacher(
            String firstName,
            String lastName,
            String dateOfBirth,
            String gender,
            String phoneNumber,
            String email,
            String address,
            int experienceYears,
            String subject,
            double salary,
            List<String> classesTaught
    ) {

        super(
                firstName,
                lastName,
                dateOfBirth,
                gender,
                phoneNumber,
                email,
                address
        );

        this.experienceYears = experienceYears;
        this.subject = subject;
        this.salary = salary;

        if (classesTaught == null) {

            this.classesTaught =
                    new ArrayList<>();

        } else {

            this.classesTaught =
                    classesTaught;
        }
    }

    // Subject Getter
    public String getSubject() {

        return subject;
    }

    // Subject Setter
    public void setSubject(
            String subject
    ) {

        this.subject = subject;
    }

    // Experience Years Getter
    public int getExperienceYears() {

        return experienceYears;
    }

    // Experience Years Setter
    public void setExperienceYears(
            int experienceYears
    ) {

        if (experienceYears < 0) {

            System.out.println(
                    "Experience years cannot be negative."
            );

            this.experienceYears = 0;

            return;
        }

        this.experienceYears =
                experienceYears;
    }

    // Salary Getter
    public double getSalary() {

        return salary;
    }

    // Salary Setter
    public void setSalary(
            double salary
    ) {

        this.salary = salary;
    }

    // Classes Taught Getter
    public List<String> getClassesTaught() {

        return classesTaught;
    }

    // Classes Taught Setter
    public void setClassesTaught(
            List<String> classesTaught
    ) {

        if (classesTaught == null) {

            this.classesTaught =
                    new ArrayList<>();

        } else {

            this.classesTaught =
                    classesTaught;
        }
    }

    // Update Salary
    public void updateSalary(
            double salary,
            String reason
    ) {

        setSalary(salary);

        System.out.println(
                "Salary updated. Reason: "
                        + reason
        );
    }

    // Display Teacher Information
    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println(
                "Teacher: "
                        + getFirstName()
                        + " "
                        + getLastName()
                        + " | Subject: "
                        + subject
                        + " | Experience: "
                        + experienceYears
                        + " years"
        );
    }
}