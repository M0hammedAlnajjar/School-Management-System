package interfaces;
import entities.Student;

import java.util.List;

public interface Manageable<T> {
    void add(T entity);

    Student searchById(String id);

    boolean remove(T entity);
    List<T> getAll();

}
