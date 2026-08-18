package entities;

import interfaces.Displayable;
import utils.HelperUtils;

public class Person implements Displayable {

    private String id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String phoneNumber;
    private String email;
    private String address;

    // Empty Constructor
    public Person() {

    }

    // Constructor
    public Person(
            String firstName,
            String lastName,
            String dateOfBirth,
            String gender,
            String phoneNumber,
            String email,
            String address
    ) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    // ID Getter
    public String getId() {

        return id;
    }

    // ID Setter
    public void setId(String id) {

        if (HelperUtils.isEmpty(id)) {

            System.out.println(
                    "ID cannot be empty. Keeping the old ID."
            );

            return;
        }

        this.id = id;
    }

    // First Name Getter
    public String getFirstName() {

        return firstName;
    }

    // First Name Setter
    public void setFirstName(
            String firstName
    ) {

        this.firstName = firstName;
    }

    // Last Name Getter
    public String getLastName() {

        return lastName;
    }

    // Last Name Setter
    public void setLastName(
            String lastName
    ) {

        this.lastName = lastName;
    }

    // Date of Birth Getter
    public String getDateOfBirth() {

        return dateOfBirth;
    }

    // Date of Birth Setter
    public void setDateOfBirth(
            String dateOfBirth
    ) {

        this.dateOfBirth = dateOfBirth;
    }

    // Gender Getter
    public String getGender() {

        return gender;
    }

    // Gender Setter
    public void setGender(String gender) {

        this.gender = gender;
    }

    // Phone Number Getter
    public String getPhoneNumber() {

        return phoneNumber;
    }

    // Phone Number Setter
    public void setPhoneNumber(
            String phoneNumber
    ) {

        this.phoneNumber = phoneNumber;
    }

    // Email Getter
    public String getEmail() {

        return email;
    }

    // Email Setter
    public void setEmail(String email) {

        this.email = email;
    }

    // Address Getter
    public String getAddress() {

        return address;
    }

    // Address Setter
    public void setAddress(
            String address
    ) {

        this.address = address;
    }

    // Display Full Information
    @Override
    public void displayInfo() {

        System.out.println(
                "Person: "
                        + firstName
                        + " "
                        + lastName
                        + " (ID: "
                        + id
                        + ")"
        );
    }

    // Display Short Information
    @Override
    public String displaySummary() {

        return id
                + " - "
                + firstName
                + " "
                + lastName;
    }

    // Convert Object to String
    @Override
    public String toString() {

        return "Person{id="
                + id
                + ", name="
                + firstName
                + " "
                + lastName
                + "}";
    }

    // Compare Two Person Objects
    @Override
    public boolean equals(Object object) {

        if (this == object) {

            return true;
        }

        if (object == null) {

            return false;
        }

        if (!(object instanceof Person)) {

            return false;
        }

        Person person = (Person) object;

        if (this.id == null) {

            return person.id == null;
        }

        return this.id.equals(person.id);
    }
}