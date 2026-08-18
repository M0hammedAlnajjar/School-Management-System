package entities;

import java.util.List;

public class SeniorStudent extends Student {

    private String major;
    private double gpa;

    // Constructor
    public SeniorStudent(
            String firstName,
            String lastName,
            String dateOfBirth,
            String gender,
            String phoneNumber,
            String email,
            String address,
            String gradeLevel,
            double feeBalance,
            List<String> subjects,
            String enrollmentDate,
            String major,
            double gpa
    ) {

        super(
                firstName,
                lastName,
                dateOfBirth,
                gender,
                phoneNumber,
                email,
                address,
                gradeLevel,
                feeBalance,
                subjects,
                enrollmentDate
        );

        this.major = major;
        this.gpa = gpa;
    }

    // Major Getter
    public String getMajor() {

        return major;
    }

    // Major Setter
    public void setMajor(
            String major
    ) {

        this.major = major;
    }

    // GPA Getter
    public double getGpa() {

        return gpa;
    }

    // GPA Setter
    public void setGpa(
            double gpa
    ) {

        this.gpa = gpa;
    }

    // Display Senior Student Information
    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println(
                "Major: " + major
        );

        System.out.println(
                "GPA: " + gpa
        );
    }
}