package entities;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private String gradeLevel;
    private String enrollmentDate;
    private double feeBalance;
    private List<String> subjects;

    // Constructor
    public Student(
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
            String enrollmentDate
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

        this.gradeLevel = gradeLevel;
        this.feeBalance = feeBalance;

        if (subjects == null) {

            this.subjects = new ArrayList<>();

        } else {

            this.subjects = subjects;
        }

        this.enrollmentDate = enrollmentDate;
    }

    // Grade Level Getter
    public String getGradeLevel() {

        return gradeLevel;
    }

    // Grade Level Setter
    public void setGradeLevel(
            String gradeLevel
    ) {

        this.gradeLevel = gradeLevel;
    }

    // Enrollment Date Getter
    public String getEnrollmentDate() {

        return enrollmentDate;
    }

    // Enrollment Date Setter
    public void setEnrollmentDate(
            String enrollmentDate
    ) {

        this.enrollmentDate = enrollmentDate;
    }

    // Fee Balance Getter
    public double getFeeBalance() {

        return feeBalance;
    }

    // Fee Balance Setter
    public void setFeeBalance(
            double feeBalance
    ) {

        if (feeBalance < 0) {

            System.out.println(
                    "Fee balance cannot be negative."
            );

            this.feeBalance = 0;

            return;
        }

        this.feeBalance = feeBalance;
    }

    // Subjects Getter
    public List<String> getSubjects() {

        return subjects;
    }

    // Subjects Setter
    public void setSubjects(
            List<String> subjects
    ) {

        if (subjects == null) {

            this.subjects = new ArrayList<>();

        } else {

            this.subjects = subjects;
        }
    }

    // Display Student Information
    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println(
                "Student: "
                        + getFirstName()
                        + " "
                        + getLastName()
                        + " | Grade Level: "
                        + gradeLevel
                        + " | Fee Balance: "
                        + feeBalance
        );
    }

    // Update Phone Number
    public void updateContact(
            String phone
    ) {

        setPhoneNumber(phone);
    }

    // Update Phone Number and Email
    public void updateContact(
            String phone,
            String email
    ) {

        setPhoneNumber(phone);
        setEmail(email);
    }

    // Add Subject
    public void addSubject(
            String subject
    ) {

        subjects.add(subject);
    }
}