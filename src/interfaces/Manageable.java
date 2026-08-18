package interfaces;

import java.util.List;

public interface Manageable<T> {

    // Add an Entity
    void add(T entity);

    // Search by String ID
    T searchById(String id);

    // Remove an Entity
    boolean remove(T entity);

    // Get All Entities
    List<T> getAll();
}