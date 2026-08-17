package services;

import entities.Student;
import interfaces.Manageable;

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

    }

    @Override
    public boolean remove(Object entity) {
        return false;
    }

    @Override
    public List getAll() {
        return List.of();
    }
}
