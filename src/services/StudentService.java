package services;

import entities.Student;
import interfaces.Manageable;
import interfaces.Searchable;
import utils.HelperUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentService
        implements Manageable<Student>,
        Searchable<Student> {

    private List<Student> students =
            new ArrayList<>();

    // =========================
    // GETTERS AND SETTERS
    // =========================

    public List<Student> getStudents() {

        return students;
    }

    public void setStudents(
            List<Student> students
    ) {

        this.students = students;
    }

    // =========================
    // ADD STUDENT OBJECT
    // =========================

    @Override
    public void add(Student entity) {

        if (entity != null) {

            students.add(entity);
        }
    }

    // =========================
    // ADD STUDENT USING DATA
    // =========================

    public Student addStudent(
            String firstName,
            String lastName,
            String phoneNumber
    ) {

        String id =
                HelperUtils.generateId("STU");

        Student student =
                new Student(
                        firstName,
                        lastName,
                        "",
                        "",
                        phoneNumber,
                        "",
                        "",
                        "Grade 1",
                        0.0,
                        new ArrayList<>(),
                        ""
                );

        student.setId(id);

        students.add(student);

        return student;
    }

    // =========================
    // SEARCH BY ID
    // =========================

    @Override
    public Student searchById(String id) {

        if (id == null
                || id.trim().isEmpty()) {

            return null;
        }

        for (Student student : students) {

            if (student.getId() != null
                    && student.getId().equalsIgnoreCase(
                    id.trim()
            )) {

                return student;
            }
        }

        return null;
    }

    // =========================
    // REMOVE STUDENT
    // =========================

    @Override
    public boolean remove(Student entity) {

        if (entity == null) {

            return false;
        }

        return students.remove(entity);
    }

    // =========================
    // GET ALL STUDENTS
    // =========================

    @Override
    public List<Student> getAll() {

        return students;
    }

    // =========================
    // SEARCH USING KEYWORD
    // =========================

    @Override
    public List<Student> search(
            String keyword
    ) {

        List<Student> results =
                new ArrayList<>();

        if (keyword == null
                || keyword.trim().isEmpty()) {

            return results;
        }

        String searchKeyword =
                keyword.trim().toLowerCase();

        for (Student student : students) {

            String firstName =
                    student.getFirstName();

            String lastName =
                    student.getLastName();

            boolean firstNameMatches =
                    firstName != null
                            && firstName
                            .toLowerCase()
                            .contains(searchKeyword);

            boolean lastNameMatches =
                    lastName != null
                            && lastName
                            .toLowerCase()
                            .contains(searchKeyword);

            if (firstNameMatches
                    || lastNameMatches) {

                results.add(student);
            }
        }

        return results;
    }

    // =========================
    // EQUALS
    // =========================

    @Override
    public boolean equals(Object object) {

        if (this == object) {

            return true;
        }

        if (object == null
                || getClass()
                != object.getClass()) {

            return false;
        }

        StudentService that =
                (StudentService) object;

        return Objects.equals(
                students,
                that.students
        );
    }

    // =========================
    // HASH CODE
    // =========================

    @Override
    public int hashCode() {

        return Objects.hash(students);
    }
}