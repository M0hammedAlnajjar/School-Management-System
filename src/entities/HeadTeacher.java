package entities;

import java.util.List;

public class HeadTeacher extends Teacher {

    private String department;
    private int teachersManaged;

    // Constructor
    public HeadTeacher(
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
            List<String> classesTaught,
            String department,
            int teachersManaged
    ) {

        super(
                firstName,
                lastName,
                dateOfBirth,
                gender,
                phoneNumber,
                email,
                address,
                experienceYears,
                subject,
                salary,
                classesTaught
        );

        this.department = department;
        this.teachersManaged = teachersManaged;
    }

    // Department Getter
    public String getDepartment() {

        return department;
    }

    // Department Setter
    public void setDepartment(
            String department
    ) {

        this.department = department;
    }

    // Teachers Managed Getter
    public int getTeachersManaged() {

        return teachersManaged;
    }

    // Teachers Managed Setter
    public void setTeachersManaged(
            int teachersManaged
    ) {

        this.teachersManaged =
                teachersManaged;
    }

    // Increase Number of Managed Teachers
    public void addManagedTeacher() {

        teachersManaged =
                teachersManaged + 1;
    }

    // Display Head Teacher Information
    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println(
                "Head Teacher: "
                        + getFirstName()
                        + " "
                        + getLastName()
                        + " | Department: "
                        + department
                        + " | Manages: "
                        + teachersManaged
                        + " teachers"
        );
    }
}