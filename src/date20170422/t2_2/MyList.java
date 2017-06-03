package date20170422.t2_2;

/**
 * 
 * @author 9527Number
 *
 * @param <T>
 */
public interface MyList<T> {
    public void add(T obj) throws Exception;

    public void add(int i, T obj) throws Exception;

    public T del(int i) throws Exception;

    public T get(int i) throws Exception;

    public int size();

    public int search(T obj);

    public boolean isEmpty();
}
