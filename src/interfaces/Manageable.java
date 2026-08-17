package interfaces;
import java.util.List;

public interface Manageable<T> {
    void add(T entity);
    boolean remove(T entity);
    List<T> getAll();

}
