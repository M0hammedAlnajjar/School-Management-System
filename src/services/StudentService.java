package services;

import entities.Student;
import interfaces.Manageable;
import utils.HelperUtils;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements Manageable {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public void add(Object entity) {
        if (entity instanceof Student) {
            students.add((Student) entity);
        }
    }

    @Override
    public Student searchById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }

        return null;
    }

    @Override
    public boolean remove(Object entity) {
        if (entity instanceof Student) {
            return students.remove(entity);
        }

        return false;
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    public Student addStudent(String first, String last, String phone, String ali) {

        String id = HelperUtils.generateId("STU");

        Student student = new Student(
                id,
                first,
                last,
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
}