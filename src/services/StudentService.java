package services;

import entities.Student;
import interfaces.Manageable;
import interfaces.Searchable;
import utils.HelperUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentService implements Manageable<Student>, Searchable<Student> {

    private List<Student> students = new ArrayList<>();

    // =========================
    // GETTERS AND SETTERS
    // =========================

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // =========================
    // ADD STUDENT
    // =========================

    @Override
    public void add(Student entity) {
        if (entity != null) {
            students.add(entity);
        }
    }

    // =========================
    // SEARCH BY ID
    // =========================

    @Override
    public Student searchById(String id) {

        if (id == null) {
            return null;
        }

        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
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
    // ADD STUDENT USING INPUT
    // =========================

    public Student addStudent(
            String ahmed, String firstName,
            String lastName,
            String phone
    ) {

        String id = HelperUtils.generateId("STU");

        Student student = new Student(
                id,
                firstName,
                lastName,
                "",
                "",
                phone,
                "",
                "",
                "Grade 1",
                0.0,
                0
        );

        students.add(student);

        return student;
    }

    // =========================
    // SEARCH STUDENTS
    // =========================

    @Override
    public List<Student> search(String keyword) {

        List<Student> results = new ArrayList<>();

        if (keyword == null || keyword.trim().isEmpty()) {
            return results;
        }

        keyword = keyword.trim().toLowerCase();

        for (Student s : students) {

            if (s.getFirstName().toLowerCase().contains(keyword)
                    || s.getLastName().toLowerCase().contains(keyword)) {

                results.add(s);
            }
        }

        return results;
    }

    @Override
    public Student searchById(int id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {   // use .equals(), not ==
                return s;
            }
        }
        return null;
    }

    // =========================
    // EQUALS
    // =========================

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StudentService that = (StudentService) o;

        return Objects.equals(students, that.students);
    }

    // =========================
    // HASH CODE
    // =========================

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }
}